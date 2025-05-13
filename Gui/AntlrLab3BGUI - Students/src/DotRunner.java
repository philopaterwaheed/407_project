import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DotRunner {
    private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
    private static final String DOT_WINDOWS = "dot.bat";
    private static final String DOT_LINUX = "dot";
    private String dotPath;

    public DotRunner() {
        initializeDotPath();
    }

    private void initializeDotPath() {
        if (IS_WINDOWS) {
            // Windows-specific logic
        } else {
            String[] unixPaths = {"/usr/bin/dot", "/usr/local/bin/dot", "/opt/local/bin/dot"};
            for (String path : unixPaths) {
                if (Files.exists(Paths.get(path))) {
                    dotPath = path;
                    return;
                }
            }
            try {
                Process which = new ProcessBuilder("which", "dot").start();
                int exitCode = which.waitFor();
                if (exitCode == 0) {
                    InputStream inputStream = null;
                    ByteArrayOutputStream result = null;
                    try {
                        inputStream = which.getInputStream();
                        result = new ByteArrayOutputStream();

                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = inputStream.read(buffer)) != -1) {
                            result.write(buffer, 0, length);
                        }

                        String output = result.toString("UTF-8").trim();
                        if (!output.isEmpty()) {
                            dotPath = output;
                            return;
                        }
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                // Ignore close errors
                            }
                        }
                        if (result != null) {
                            try {
                                result.close();
                            } catch (IOException e) {
                                // Ignore close errors
                            }
                        }
                    }
                }
            } catch (IOException | InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        throw new RuntimeException("Could not find dot executable. Please ensure Graphviz is installed.");
    }

    public void generateGraph(String dotInput, Path outputPath, String format) throws IOException, InterruptedException {
        if (dotPath == null) {
            throw new RuntimeException("DOT executable not found");
        }
        List<String> command = new ArrayList<>();
        if (IS_WINDOWS) {
            command.add("cmd");
            command.add("/c");
        }
        command.add(dotPath);
        command.add("-T" + format);
        command.add("-o");
        command.add(outputPath.toString());
        Path tempDotFile = Files.createTempFile("graph_", ".dot");
        Files.write(tempDotFile, dotInput.getBytes(StandardCharsets.UTF_8));
        command.add(tempDotFile.toString());
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command).redirectErrorStream(true);
            if (IS_WINDOWS) {
                Path dotDir = Paths.get(dotPath).getParent();
                String path = System.getenv("PATH") + File.pathSeparator + dotDir.toString();
                processBuilder.environment().put("PATH", path);
            }
            Process process = processBuilder.start();
            if (!process.waitFor(30, TimeUnit.SECONDS)) {
                process.destroy();
                throw new RuntimeException("DOT process timed out");
            }
            if (process.exitValue() != 0) {
                String error;
                InputStream inputStream = null;
                ByteArrayOutputStream outputStream = null;
                try {
                    inputStream = process.getInputStream();
                    outputStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, length);
                    }
                    error = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            // Ignore close errors
                        }
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            // Ignore close errors
                        }
                    }
                }
                throw new RuntimeException("DOT process failed: " + error);
            }
        } finally {
            try {
                Files.deleteIfExists(tempDotFile);
            } catch (IOException e) {
                // Log cleanup error
            }
        }
    }
}
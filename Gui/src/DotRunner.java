import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DotRunner {
	private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
	private String dotPath;

	public DotRunner() {
		initializeDotPath();
	}

	private void initializeDotPath() {
		if (IS_WINDOWS) {
			// Try common Graphviz installation locations on Windows
			String[] winPaths = {
					System.getenv("ProgramFiles") + "\\Graphviz\\bin\\dot.exe",
					System.getenv("ProgramFiles(x86)") + "\\Graphviz\\bin\\dot.exe",
					System.getenv("ProgramFiles") + "\\Graphviz\\bin\\dot.bat",
					System.getenv("ProgramFiles(x86)") + "\\Graphviz\\bin\\dot.bat"
			};

			for (String path : winPaths) {
				if (path != null && Files.exists(Paths.get(path))) {
					dotPath = path;
					return;
				}
			}

			// Try checking in system PATH
			try {
				Process process = new ProcessBuilder("where", "dot").start();
				if (process.waitFor(5, TimeUnit.SECONDS) && process.exitValue() == 0) {
					try (InputStream in = process.getInputStream()) {
						ByteArrayOutputStream out = new ByteArrayOutputStream();
						byte[] buffer = new byte[1024];
						int len;
						while ((len = in.read(buffer)) != -1) {
							out.write(buffer, 0, len);
						}
						String result = out.toString(String.valueOf(StandardCharsets.UTF_8)).trim();
						if (!result.isEmpty()) {
							dotPath = result.split("\\r?\\n")[0]; // Use the first match
							return;
						}
					}
				}
			} catch (IOException | InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		} else {
			// Linux/Unix-style detection
			String[] unixPaths = {"/usr/bin/dot", "/usr/local/bin/dot", "/opt/local/bin/dot"};
			for (String path : unixPaths) {
				if (Files.exists(Paths.get(path))) {
					dotPath = path;
					return;
				}
			}

			try {
				Process process = new ProcessBuilder("which", "dot").start();
				if (process.waitFor(5, TimeUnit.SECONDS) && process.exitValue() == 0) {
					try (InputStream in = process.getInputStream()) {
						ByteArrayOutputStream out = new ByteArrayOutputStream();
						byte[] buffer = new byte[1024];
						int len;
						while ((len = in.read(buffer)) != -1) {
							out.write(buffer, 0, len);
						}
						String result = out.toString(String.valueOf(StandardCharsets.UTF_8)).trim();
						if (!result.isEmpty()) {
							dotPath = result;
							return;
						}
					}
				}
			} catch (IOException | InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		throw new RuntimeException("Could not find dot executable. Please ensure Graphviz is installed and added to PATH.");
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
				// Ensure dot.exe directory is in the PATH
				Path dotDir = Paths.get(dotPath).getParent();
				String newPath = dotDir + File.pathSeparator + System.getenv("PATH");
				processBuilder.environment().put("PATH", newPath);
			}

			Process process = processBuilder.start();
			if (!process.waitFor(30, TimeUnit.SECONDS)) {
				process.destroy();
				throw new RuntimeException("DOT process timed out");
			}

			if (process.exitValue() != 0) {
				try (InputStream inputStream = process.getInputStream();
				     ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
					byte[] buffer = new byte[1024];
					int length;
					while ((length = inputStream.read(buffer)) != -1) {
						outputStream.write(buffer, 0, length);
					}
					String error = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
					throw new RuntimeException("DOT process failed: " + error);
				}
			}
		} finally {
			try {
				Files.deleteIfExists(tempDotFile);
			} catch (IOException e) {
				// Ignore cleanup error
			}
		}
	}
}

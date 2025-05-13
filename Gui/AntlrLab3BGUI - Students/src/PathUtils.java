import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PathUtils {
    private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
    
    /**
     * Converts a path string to a platform-independent path
     */
    public static Path normalizePath(String path) {
        return Paths.get(path.replace('\\', '/')).normalize();
    }
    
    /**
     * Combines path segments in a platform-independent way
     */
    public static Path combinePath(String... paths) {
        return Paths.get(String.join(File.separator, paths)).normalize();
    }
    
    /**
     * Converts a path to its absolute form
     */
    public static Path toAbsolutePath(Path path) {
        return path.toAbsolutePath().normalize();
    }
    
    /**
     * Gets the relative path between two paths
     */
    public static Path getRelativePath(Path base, Path target) {
        return base.relativize(target).normalize();
    }
    
    /**
     * Creates a project-relative path from a string
     */
    public static Path createProjectPath(String projectRoot, String relativePath) {
        Path normalizedRoot = normalizePath(projectRoot);
        Path normalizedPath = normalizePath(relativePath);
        return normalizedRoot.resolve(normalizedPath).normalize();
    }
    
    /**
     * Ensures directory separators are correct for the current platform
     */
    public static String toPlatformPath(String path) {
        if (IS_WINDOWS) {
            return path.replace('/', '\\');
        }
        return path.replace('\\', '/');
    }
    
    /**
     * Creates directory if it doesn't exist
     */
    public static void ensureDirectoryExists(Path path) throws IOException {
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
    }
    
    /**
     * Gets the file extension in a platform-independent way
     */
    public static String getFileExtension(String filename) {
        String normalizedFilename = filename.replace('\\', '/');
        int lastDotIndex = normalizedFilename.lastIndexOf('.');
        return lastDotIndex == -1 ? "" : normalizedFilename.substring(lastDotIndex + 1);
    }
}
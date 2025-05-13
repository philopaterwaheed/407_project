import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.Properties;

public class ConfigManager {
    private static final String CONFIG_DIR = "config";
    private final Path configPath;
    
    public ConfigManager(String projectRoot) {
        Path root = PathUtils.normalizePath(projectRoot);
        this.configPath = PathUtils.createProjectPath(root.toString(), CONFIG_DIR);
    }
    
    public Properties loadConfig(String configName) {
        Path configFile = configPath.resolve(configName + ".properties");
        Properties props = new Properties();
        
        if (Files.exists(configFile)) {
            try (InputStream in = Files.newInputStream(configFile)) {
                props.load(in);
            } catch (IOException e) {
                // Handle exception...
            }
        }
        
        return props;
    }
    
    public void saveConfig(String configName, Properties props) {
        Path configFile = configPath.resolve(configName + ".properties");
        try {
            PathUtils.ensureDirectoryExists(configPath);
            try (OutputStream out = Files.newOutputStream(configFile)) {
                props.store(out, "Configuration saved on " + new Date());
            }
        } catch (IOException e) {
            // Handle exception...
        }
    }
}
package cache;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import files.FileUtils;

public class CacheUtils {

    public static final String CACHE_DIRECTORY = ".cache";

    public static Path getCacheDirectory() {
        return FileUtils.getAbsolutePath(CACHE_DIRECTORY);
    }

    public static void refreshCacheDirectory() throws IOException {
        clearCacheDirectory();
        Files.createDirectory(getCacheDirectory());
    }

    public static void clearCacheDirectory() {
        FileUtils.deleteDirectory(getCacheDirectory().toFile());
    }
}

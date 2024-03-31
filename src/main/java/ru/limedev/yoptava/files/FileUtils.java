package files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static final String CACHE_DIRECTORY = ".cache";
    public static final String JAVA_EXTENSION = ".java";

    public static String fileSeparator() {
        return System.getProperty("file.separator");
    }

    public static Path getAbsolutePath(String path) {
        return Paths.get(path).toAbsolutePath();
    }

    public static void renameFile(Path file, String newName) throws IOException {
        Files.move(file, file.resolveSibling(newName));
    }

    public static void deleteDirectory(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f: files) {
                if(f.isDirectory()) {
                    deleteDirectory(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

    public static void refreshCacheDirectory() throws IOException {
        deleteDirectory(getCacheDirectory().toFile());
        Files.createDirectory(getCacheDirectory());
    }

    public static Path getCacheDirectory() {
        return Paths.get(CACHE_DIRECTORY).toAbsolutePath();
    }

    public static Path getYoptavaFromCache(String file) {
        String cacheFile = getCacheDirectory() + fileSeparator() + file;
        return getAbsolutePath(cacheFile);
    }

    public static String getCacheYoptavaName(String file) {
        return file.replace(YoptavaFiles.FILE_EXTENSION, JAVA_EXTENSION);
    }

    public static String readYoptavaFromCache(String javaFile, Charset encoding) throws IOException {
        Path yoptavaPath = getYoptavaFromCache(javaFile);
        byte[] encoded = Files.readAllBytes(yoptavaPath);
        return new String(encoded, encoding);
    }

    public static void putYoptavaToCache(String file) throws IOException {
        String javaFile = getCacheYoptavaName(file);
        Path targetPath = getYoptavaFromCache(file);
        Path copied = Files.copy(getAbsolutePath(file), targetPath);
        renameFile(copied, javaFile);
    }
}

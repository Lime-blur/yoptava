package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static final String JAVA_EXTENSION = ".java";
    public static final String fileSeparator = System.getProperty("file.separator");

    public static Path getAbsolutePath(String path) {
        return Paths.get(path).toAbsolutePath();
    }

    public static void renameFile(Path file, String newName) throws IOException {
        Files.move(file, file.resolveSibling(newName));
    }

    public static void deleteDirectory(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }
}

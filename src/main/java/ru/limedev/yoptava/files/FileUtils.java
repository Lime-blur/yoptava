package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import core.StringUtils;
import settings.settings.abstraction.YoptavaSettings;

public final class FileUtils {

    public static final String JAVA_EXTENSION = ".java";
    public static final String fileSeparator = System.getProperty("file.separator");

    public static Path getAbsolutePath(String path) {
        return Paths.get(path).toAbsolutePath();
    }

    public static void renameFile(Path file, String newName) throws IOException {
        Files.move(file, file.resolveSibling(newName));
    }

    public static List<String> listShortFilesPath(String directoryName, YoptavaSettings settings) {
        List<String> files = new ArrayList<>();
        for (String file : listFilesPath(directoryName)) {
            String shortPath = StringUtils.replaceBefore(file, settings.getProjectSourcesDirectory());
            files.add(shortPath);
        }
        return files;
    }

    public static List<String> listFilesPath(String directoryName) {
        List<String> files = new ArrayList<>();
        FileUtils.listFilesPath(directoryName, files);
        return files;
    }

    public static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }

    private static void listFilesPath(String directoryName, List<String> files) {
        File directory = new File(directoryName);
        File[] fileList = directory.listFiles();
        if (fileList == null) return;
        for (File file : fileList) {
            if (file.isFile()) {
                files.add(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                listFilesPath(file.getAbsolutePath(), files);
            }
        }
    }
}

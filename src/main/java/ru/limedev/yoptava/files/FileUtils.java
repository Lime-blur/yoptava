package ru.limedev.yoptava.files;

import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;
import ru.limedev.yoptava.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {

    public static final String JAVA_EXTENSION = ".java";
    public static final String fileSeparator = System.getProperty("file.separator");

    public static boolean isJavaExtension(File file) {
        return isJavaExtension(file.getName());
    }

    public static boolean isJavaExtension(String fileName) {
        return getExtension(fileName).equals(JAVA_EXTENSION);
    }

    public static String getExtension(String fileName) {
        String extension = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) extension = fileName.substring(i);
        return extension.toLowerCase();
    }

    public static Path getAbsolutePath(String path) {
        return Paths.get(path).toAbsolutePath();
    }

    public static void renameFile(Path file, String newName) throws IOException {
        Files.move(file, file.resolveSibling(newName));
    }

    public static List<String> listShortFilesPath(String directoryName, YoptavaSettings settings) {
        List<String> files = new ArrayList<>();
        for (String file : listFilesPath(directoryName)) {
            String shortPath = getShortFilePath(file, settings);
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

    public static String getShortFilePath(String file, YoptavaSettings settings) {
        return StringUtils.replaceBefore(file, settings.getProjectSourcesDirectory());
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

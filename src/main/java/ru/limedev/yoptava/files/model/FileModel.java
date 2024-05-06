package ru.limedev.yoptava.files.model;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public final class FileModel {

    @NotNull
    String path;
    @NotNull
    String name;
    boolean isDirectory;

    public FileModel(@NotNull String path, @NotNull String name, boolean isDirectory) {
        this.path = path;
        this.name = name;
        this.isDirectory = isDirectory;
    }

    @Override
    public int hashCode() {
        int result = this.path.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + Boolean.hashCode(this.isDirectory);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileModel)) return false;
        FileModel fileModel = (FileModel) o;
        return isDirectory == fileModel.isDirectory && Objects.equals(path, fileModel.path) && Objects.equals(name, fileModel.name);
    }

    @NotNull
    public String getPath() {
        return path;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public static void addFileToList(
        @NotNull String path,
        @NotNull String name,
        boolean isDirectory,
        @NotNull List<FileModel> files
    ) {
        FileModel fileModel = new FileModel(path, name, isDirectory);
        files.add(fileModel);
    }
}

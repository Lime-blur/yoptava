package ru.limedev.yoptava.settings.type;

import org.jetbrains.annotations.NotNull;
import ru.limedev.yoptava.parser.dictionary.abstraction.Dictionary;

import java.util.Objects;

public final class Language {

    @NotNull
    private final String extension;
    @NotNull
    private final Dictionary dictionary;

    public Language(@NotNull String extension, @NotNull Dictionary dictionary) {
        this.extension = extension;
        this.dictionary = dictionary;
    }

    @Override
    public int hashCode() {
        int result = this.extension.hashCode();
        result = result * 31 + this.dictionary.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language)) return false;
        Language that = (Language) o;
        return Objects.equals(extension, that.extension) && Objects.equals(dictionary, that.dictionary);
    }

    @NotNull
    public String getExtension() {
        return this.extension;
    }

    @NotNull
    public Dictionary getDictionary() {
        return this.dictionary;
    }
}
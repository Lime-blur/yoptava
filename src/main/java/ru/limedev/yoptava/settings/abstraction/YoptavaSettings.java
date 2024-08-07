package ru.limedev.yoptava.settings.abstraction;

import ru.limedev.yoptava.settings.type.Language;
import ru.limedev.yoptava.settings.type.LanguageType;

public interface YoptavaSettings {

    /**
     * Returns current yoptava language.
     */
    Language getLanguage();

    /**
     * Returns the initial directory where current yoptava files are located.<br>
     * For {@link LanguageType#GOPTAVA} = goptava<br>
     * For {@link LanguageType#RUPTAVA} = ruptava<br>
     * For {@link LanguageType#LEPTAVA} = leptava<br>
     * For {@link LanguageType#BELPTAVA} = belptava<br>
     */
    String getSourcesDirectory();

    /**
     * Returns the initial directory where yoptava files are located taking into account
     * the project name.
     */
    String getProjectSourcesDirectory();

    /**
     * Returns the file name that launches yoptava files.
     */
    String getMainClassName();

    /**
     * Return the "main" method for yoptava files.
     */
    String getMainClassLoadMethod();
}

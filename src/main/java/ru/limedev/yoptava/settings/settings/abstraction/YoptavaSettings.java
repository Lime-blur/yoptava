package settings.settings.abstraction;

import settings.LanguageType;

public interface YoptavaSettings {

    /**
     * Returns Russian programming language type.
     */
    LanguageType getLanguageType();

    /**
     * Returns the initial directory where Russian-language java files are located.<br><br>
     * For {@link LanguageType#GOPTAVA} = goptava<br>
     * For {@link LanguageType#RUPTAVA} = ruptava<br>
     * For {@link LanguageType#LEPTAVA} = leptava<br>
     */
    String getSourcesDirectory();

    /**
     * Returns the initial directory where Russian-language java files are located taking into account
     * the project name.
     */
    String getProjectSourcesDirectory();

    /**
     * Returns the file name that launches Russian-language java files.
     */
    String getMainClassName();

    /**
     * Return the "main" method for Russian-language java files.
     */
    String getMainClassLoadMethod();
}

package settings;

import files.FileUtils;

public class YoptavaSettings {

    /**
     * Current Russian programming language type.
     */
    public static final LanguageType LANGUAGE_TYPE = LanguageType.GOPTAVA;

    /**
     * The initial directory where Russian-language java files are located.<br><br>
     * For {@link LanguageType#GOPTAVA} = goptava<br>
     * For {@link LanguageType#RUPTAVA} = ruptava<br>
     * For {@link LanguageType#LEPTAVA} = leptava<br>
     */
    public static final String SOURCES_DIRECTORY = "goptava";

    /**
     * The initial directory where Russian-language java files are located taking into account
     * the project name.
     */
    public static final String PROJECT_SOURCES_DIRECTORY = System.getProperty("user.dir") + FileUtils.fileSeparator + SOURCES_DIRECTORY + FileUtils.fileSeparator;

    /**
     * The name of the file that launches Russian-language java files.
     */
    public static final String MAIN_CLASS_NAME = "Load";

    /**
     * The "main" method for Russian-language java files.
     */
    public static final String MAIN_CLASS_LOAD_METHOD = "load";
}

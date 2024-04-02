package settings;

import files.FileUtils;

public class YoptavaSettings {

    /**
     * Extension of Russian-language java files.
     */
    public static final String FILE_EXTENSION = ".yoptava";

    /**
     * The initial directory where Russian-language java files are located.
     */
    public static final String SOURCES_DIRECTORY = "yoptava";

    /**
     * The initial directory where Russian-language java files are located taking into account
     * the project name.
     */
    public static final String PROJECT_SOURCES_DIRECTORY = "yoptava" + FileUtils.fileSeparator + SOURCES_DIRECTORY + FileUtils.fileSeparator;

    /**
     * The name of the file that launches Russian-language java files.
     */
    public static final String MAIN_CLASS_NAME = "Load";

    /**
     * The "main" method for Russian-language java files.
     */
    public static final String MAIN_CLASS_LOAD_METHOD = "load";
}

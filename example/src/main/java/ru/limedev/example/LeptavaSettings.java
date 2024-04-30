import settings.LanguageType;
import settings.settings.abstraction.YoptavaSettings;

public final class LeptavaSettings implements YoptavaSettings {

    @Override
    public LanguageType getLanguageType() {
        return Settings.LANGUAGE_TYPE;
    }

    @Override
    public String getSourcesDirectory() {
        return Settings.SOURCES_DIRECTORY;
    }

    @Override
    public String getProjectSourcesDirectory() {
        return Settings.PROJECT_SOURCES_DIRECTORY;
    }

    @Override
    public String getMainClassName() {
        return Settings.MAIN_CLASS_NAME;
    }

    @Override
    public String getMainClassLoadMethod() {
        return Settings.MAIN_CLASS_LOAD_METHOD;
    }
}

import settings.settings.abstraction.YoptavaSettings;

public class Main {

    private static final YoptavaSettings customSettings = new LeptavaSettings();

    public static void main(String[] args) {
        Yoptava.init(customSettings);
    }
}

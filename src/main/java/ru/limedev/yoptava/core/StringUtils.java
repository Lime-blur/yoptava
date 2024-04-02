package core;

public class StringUtils {

    public static final String EMPTY_STRING = "";

    public static String replaceBefore(String string, String before) {
        return string.replaceFirst(".*?" + before, EMPTY_STRING);
    }
}

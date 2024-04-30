package core;

public final class StringUtils {

    public static final String EMPTY_STRING = "";

    public static String replaceBefore(String string, String before) {
        String formattedBefore = before.replace("\\", "\\\\");
        return string.replaceFirst(".*?" + formattedBefore, EMPTY_STRING);
    }

    public static String collectStringArray(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (String s : array) {
            builder.append(s);
        }
        return builder.toString();
    }
}

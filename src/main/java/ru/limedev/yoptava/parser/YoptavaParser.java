package parser;

import java.util.Map;

import core.StringUtils;

public class YoptavaParser {

    private static final String CRLF = "[\\ \t \f]* \\R";
    private static final String DOUBLE_QUOTED_STRING = "\"([^\\\"\r\n] | \\[^\r\n] | \\" + CRLF + ")*\"?";

    public static String parseAndConvert(String text) {
        String[] textParts = text.split("(?=" + DOUBLE_QUOTED_STRING +")");
        for (Map.Entry<String, String> entry : YoptavaDictionary.keywords.entrySet()) {
            for (int i = 0; i < textParts.length; i++) {
                if (i % 2 != 0) continue;
                textParts[i] = replaceWord(textParts[i], entry.getKey(), entry.getValue());
            }
        }
        return StringUtils.collectStringArray(textParts);
    }

    private static String replaceWord(String text, String word, String replace) {
        return text.replaceAll(word, replace);
    }
}

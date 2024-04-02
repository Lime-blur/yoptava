package parser;

import java.util.Map;

public class YoptavaParser {

    private static final String CRLF = "[\\ \t \f]* \\R";
    private static final String DOUBLE_QUOTED_STRING = "\"([^\\\"\r\n] | \\[^\r\n] | \\" + CRLF + ")*\"?";

    public static String parseAndConvert(String text) {
        String result = text;
        for (Map.Entry<String, String> entry : YoptavaDictionary.keywords.entrySet()) {
            result = replaceWord(result, entry.getKey(), entry.getValue());
        }
        return result;
    }

    private static String replaceWord(String text, String word, String replace) {
        return text.replaceAll(word, replace);
    }
}

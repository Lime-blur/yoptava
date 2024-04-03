package parser;

import java.util.Map;

import core.StringUtils;
import settings.YoptavaSettings;

public class YoptavaParser {

    private static final String DOUBLE_QUOTED_PATTERN = "(?!\\\")(?=\")";

    public static String parseAndConvert(String text) {
        String[] textParts = text.split(DOUBLE_QUOTED_PATTERN);
        Map<String, String> keywords = YoptavaSettings.LANGUAGE_TYPE.dictionary.getKeywords();
        for (Map.Entry<String, String> entry : keywords.entrySet()) {
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

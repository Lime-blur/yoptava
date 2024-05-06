package ru.limedev.yoptava.parser;

import java.util.Map;

import ru.limedev.yoptava.utils.StringUtils;
import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;

public final class YoptavaParser {

    private static final String DOUBLE_QUOTED_PATTERN = "(?!\\\\\")(?=\")";

    public static String parseAndConvert(String text, YoptavaSettings settings) {
        String[] textParts = text.split(DOUBLE_QUOTED_PATTERN);
        Map<String, String> keywords = settings.getLanguage().getDictionary().getKeywords();
        for (int i = 0; i < textParts.length; i++) {
            if (i % 2 != 0) continue;
            for (Map.Entry<String, String> entry : keywords.entrySet()) {
                textParts[i] = replaceWord(textParts[i], entry.getKey(), entry.getValue());
            }
        }
        return StringUtils.collectStringArray(textParts);
    }

    private static String replaceWord(String text, String word, String replace) {
        return text.replaceAll("\\b" + word + "\\b", replace);
    }
}

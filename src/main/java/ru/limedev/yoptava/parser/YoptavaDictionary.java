package parser;

import java.util.HashMap;
import java.util.Map;

public class YoptavaDictionary {

    public static Map<String, String> keywords = new HashMap<String, String>() {
        {
            put("публичный", "public");
            put("класс", "class");
            put("статический", "static");
            put("конечный", "final");
            put("пустой", "void");
        }
    };
}

package parser.dictionary;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class YoptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            put("ебанный", "public");
            put("ёбанный", "public");
            put("клёво", "class");
            put("клево", "class");
            put("попонятиям", "static");
            put("бачок", "final");
            put("беспонтовый", "void");
            put("говнойбать", "abstract");
            put("найтиСтукача", "assert");
            put("харэ", "break");
            put("лещ", "case");
            put("аеслинайду", "case");
            put("гоп", "catch");
            put("аченетак", "catch");
            put("аченитак", "catch");
            put("ачёнетак", "catch");
            put("ачёнитак", "catch");
            put("двигай", "continue");
            put("пахану", "default");
            put("апохуй", "default");
            put("наотыбись", "default");
            put("крч", "do");
            put("иливжопураз", "else");
            put("еээ", "enum");
            put("батя", "extends");
            put("тюряжка", "finally");
            put("го", "for");
            put("вилкойвглаз", "if");
            put("силикон", "implements");
            put("спиздить", "import");
            put("шкура", "instanceof");
            put("хуёво", "interface");
            put("хуево", "interface");
            put("чорт", "native");
            put("гыйбать", "new");
            put("захуярить", "new");
            put("клеёнка", "package");
            put("клеенка", "package");
            put("мой", "private");
            put("подкрыша", "protected");
            put("яга", "super");
            put("естьчо", "switch");
            put("вписон", "synchronized");
            put("тырыпыры", "this");
            put("пнх", "throw");
            put("плюнуть", "throws");
            put("ахз", "transient");
            put("хапнуть", "try");
            put("побратски", "try");
            put("пабрацки", "try");
            put("пабратски", "try");
            put("вписос", "volatile");
            put("потрещим", "while");
            put("отвечаю", "return");

            put("пацан", "boolean");
            put("семка", "byte");
            put("эээ", "char");
            put("двойные", "double");
            put("плавник", "float");
            put("хуйня", "int");
            put("колонна", "long");
            put("пипин", "short");

            put("трулио", "true");
            put("чётко", "true");
            put("четко", "true");
            put("чотко", "true");
            put("нетрулио", "false");
            put("пиздишь", "false");
            put("нечётко", "false");
            put("нечетко", "false");
            put("нечотко", "false");
            put("нуллио", "null");
            put("порожняк", "null");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}

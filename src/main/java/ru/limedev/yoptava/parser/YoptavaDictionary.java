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
            put("абстрактный", "abstract");
            put("утвердить", "assert");
            put("прервать", "break");
            put("случай", "case");
            put("поймать", "catch");
            put("продолжать", "continue");
            put("стандартный", "default");
            put("выполнять", "do");
            put("иначе", "else");
            put("перечисление", "enum");
            put("расширяет", "extends");
            put("окончательно", "finally");
            put("для", "for");
            put("если", "if");
            put("реализует", "implements");
            put("импортировать", "import");
            put("экземпляр", "instanceof");
            put("интерфейс", "interface");
            put("родной", "native");
            put("новый", "new");
            put("пакет", "package");
            put("приватный", "private");
            put("защищенный", "protected");
            put("защищённый", "protected");
            put("родитель", "super");
            put("когда", "switch");
            put("синхронизированный", "synchronized");
            put("этот", "this");
            put("бросать", "throw");
            put("бросает", "throws");
            put("несериализуемый", "transient");
            put("пробовать", "try");
            put("атомарный", "volatile");
            put("пока", "while");
            put("вернуть", "return");

            put("логический", "boolean");
            put("байт", "byte");
            put("символ", "char");
            put("двойной", "double");
            put("плавающий", "float");
            put("целый", "int");
            put("длинный", "long");
            put("короткий", "short");

            put("правда", "true");
            put("ложь", "false");
            put("нулевой", "null");
        }
    };
}

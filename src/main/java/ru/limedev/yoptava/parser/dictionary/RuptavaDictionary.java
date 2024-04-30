package parser.dictionary;

import org.jetbrains.annotations.NotNull;
import parser.dictionary.abstraction.Dictionary;

import java.util.HashMap;
import java.util.Map;

public final class RuptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            // Keywords
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

            // Primitives
            put("логический", "boolean");
            put("байт", "byte");
            put("символ", "char");
            put("двойной", "double");
            put("плавающий", "float");
            put("целый", "int");
            put("длинный", "long");
            put("короткий", "short");

            // Values
            put("правда", "true");
            put("ложь", "false");
            put("нулевой", "null");

            // Object
            put("Объект", "Object");
            put("получитьКласс", "getClass");
            put("хэшКод", "hashCode");
            put("равен", "equals");
            put("клонировать", "clone");
            put("кСтроке", "toString");
            put("уведомить", "notify");
            put("уведомитьВсе", "notifyAll");
            put("ждать", "wait");
            put("финализировать", "finalize");

            // Iterable
            put("Итерируемый", "Iterable");
            put("итератор", "iterator");
            put("дляКаждого", "forEach");
            put("сплитератор", "spliterator");

            // Collection
            put("размер", "size");
            put("пустоЛи", "isEmpty");
            put("содержит", "contains");
            put("кМассиву", "toArray");
            put("добавить", "add");
            put("убрать", "remove");
            put("содержитВсе", "containsAll");
            put("добавитьВсе", "addAll");
            put("убратьВсе", "removeAll");
            put("убратьЕсли", "removeIf");
            put("удержатьВсе", "retainAll");
            put("очистить", "clear");
            put("стрим", "stream");
            put("параллельныйСтрим", "parallelStream");

            // List
            put("Список", "List");
            put("заменитьВсе", "replaceAll");
            put("сортировать", "sort");
            put("получить", "get");
            put("установить", "set");
            put("индексУ", "indexOf");
            put("последнийИндексУ", "lastIndexOf");
            put("итераторСписка", "listIterator");
            put("подСписок", "subList");

            // ArrayList
            put("СписокМассива", "ArrayList");

            // Set
            put("Набор", "Set");

            // HashSet
            put("ХэшНабор", "HashSet");

            // String
            put("Строка", "String");
            put("значение", "value");
            put("хэш", "hash");
            put("кодоваяТочкаВ", "codePointAt");
            put("кодоваяТочкаДо", "codePointBefore");
            put("количествоКодовыхТочек", "codePointCount");
            put("сдвигПоКодовымТочкам", "offsetByCodePoints");
            put("получитьСимволы", "getChars");
            put("получитьБайты", "getBytes");
            put("контентРавен", "contentEquals");
            put("равенИгнорируяРегистр", "equalsIgnoreCase");
            put("ПОРЯДОК_НЕЧУВСТВИТЕЛЬНЫЙ_К_РЕГИСТРУ", "CASE_INSENSITIVE_ORDER");
            put("сопоставитьИгнорируяРегистрС", "compareToIgnoreCase");
            put("регионСоответствует", "regionMatches");
            put("начинаетсяС", "startsWith");
            put("заканчиваетсяС", "endsWith");
            put("подстрока", "substring");
            put("объединить", "concat");
            put("заменить", "replace");
            put("соответствует", "matches");
            put("заменитьПервый", "replaceFirst");
            put("расколоть", "split");
            put("соединить", "join");
            put("кНижнемуРегистру", "toLowerCase");
            put("кВерхнемуРегистру", "toUpperCase");
            put("обрезать", "trim");
            put("кСимвольномуМассиву", "toCharArray");
            put("форматировать", "format");
            put("значениеУ", "valueOf");
            put("копироватьЗначениеУ", "copyValueOf");
            put("каноническоеПредставление", "intern");

            // Serializable
            put("Сериализуемый", "Serializable");

            // Comparable
            put("Сопоставимый", "Comparable");
            put("сопоставитьС", "compareTo");

            // Comparator
            put("Компаратор", "Comparator");
            put("сопоставить", "compare");
            put("перевернутый", "reversed");
            put("перевёрнутый", "reversed");
            put("затемСравнивая", "thenComparing");
            put("затемСравниваяЦелый", "thenComparingInt");
            put("затемСравниваяДлинный", "thenComparingLong");
            put("затемСравниваяДвойной", "thenComparingDouble");
            put("перевернутыйПорядок", "reverseOrder");
            put("перевёрнутыйПорядок", "reverseOrder");
            put("натуральныйПорядок", "naturalOrder");
            put("нулиСначала", "nullsFirst");
            put("нулиПоследние", "nullsLast");
            put("сравнение", "comparing");
            put("сравнениеЦелого", "comparingInt");
            put("сравнениеДлинного", "comparingLong");
            put("сравнениеДвойного", "comparingDouble");

            // CharSequence
            put("СимвольнаяПоследовательность", "CharSequence");
            put("длина", "length");
            put("символВ", "charAt");
            put("подПоследовательность", "subSequence");
            put("символы", "chars");
            put("кодовыеТочки", "codePoints");

            // System
            put("Система", "System");
            put("Система.ввод", "System.in");
            put("Система.вывод", "System.out");
            put("Система.ошибка", "System.err");
            put("Система.установитьВвод", "System.setIn");
            put("Система.установитьВывод", "System.setOut");
            put("Система.установитьОшибку", "System.setErr");
            put("Система.консоль", "System.console");
            put("Система.унаследованныйКанал", "System.inheritedChannel");
            put("Система.установитьМенеджерБезопасности", "System.setSecurityManager");
            put("Система.получитьМенеджерБезопасности", "System.getSecurityManager");
            put("Система.текущееВремяМиллисекунды", "System.currentTimeMillis");
            put("Система.наноВремя", "System.nanoTime");
            put("Система.копироватьМассив", "System.arraycopy");
            put("Система.идентификационныйХэшкод", "System.identityHashCode");
            put("Система.получитьСвойства", "System.getProperties");
            put("Система.разделительСтрок", "System.lineSeparator");
            put("Система.установитьСвойства", "System.setProperties");
            put("Система.получитьСвойство", "System.getProperty");
            put("Система.установитьСвойство", "System.setProperty");
            put("Система.очиститьСвойство", "System.clearProperty");
            put("Система.получитьОкружение", "System.getenv");
            put("Система.выход", "System.exit");
            put("Система.сборщикМусора", "System.gc");
            put("Система.запуститьФинализацию", "System.runFinalization");
            put("Система.запуститьФинализаторовПриВыходе", "System.runFinalizersOnExit");
            put("Система.загрузить", "System.load");
            put("Система.запуститьБиблиотеку", "System.loadLibrary");
            put("Система.сопоставитьИмяБиблиотеки", "System.mapLibraryName");

            // System short methods
            put("системноРаспечатать", "System.out.print");
            put("системноРаспечататьСтроку", "System.out.println");
            put("системноРаспечататьФорматно", "System.out.printf");

            // PrintStream
            put("ПотокПечати", "PrintStream");
            put("промыть", "flush");
            put("закрыть", "close");
            put("проверитьОшибку", "checkError");
            put("записать", "write");
            put("распечатать", "print");
            put("распечататьСтроку", "println");
            put("распечататьФорматно", "printf");
            put("присоединить", "append");

            // Map
            put("Карта", "Map");
            put("содержитКлюч", "containsKey");
            put("содержитЗначение", "containsValue");
            put("положить", "put");
            put("положитьВсе", "putAll");
            put("наборКлючей", "keySet");
            put("значения", "values");
            put("наборЗаписей", "entrySet");
            put("получитьИлиПоУмолчанию", "getOrDefault");
            put("положитьЕслиОтсутствует", "putIfAbsent");
            put("вычислитьЕслиОтсутствует", "computeIfAbsent");
            put("вычислить", "compute");
            put("слить", "merge");

            // Entry
            put("Запись", "Entry");
            put("получитьКлюч", "getKey");
            put("получитьЗначение", "getValue");
            put("установитьЗначение", "setValue");
            put("сравнениеПоКлючу", "comparingByKey");
            put("сравнениеПоЗначению", "comparingByValue");

            // HashMap
            put("ХэшКарта", "HashMap");

            // Boolean
            put("Логический", "Boolean");

            // Byte
            put("Байт", "Byte");

            // Character
            put("Символ", "Character");

            // Double
            put("Двойной", "Double");

            // Float
            put("Плавающий", "Float");

            // Integer
            put("Целый", "Integer");

            // Long
            put("Длинный", "Long");

            // Short
            put("Короткий", "Short");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}

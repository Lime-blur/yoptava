package ru.limedev.yoptava.parser.dictionary;

import org.jetbrains.annotations.NotNull;
import ru.limedev.yoptava.parser.dictionary.abstraction.Dictionary;

import java.util.HashMap;
import java.util.Map;

public final class GoptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            // Keywords
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

            // Primitives
            put("пацан", "boolean");
            put("семка", "byte");
            put("эээ", "char");
            put("двойные", "double");
            put("плавник", "float");
            put("хуйня", "int");
            put("колонна", "long");
            put("пипин", "short");

            // Values
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

            // Annotations
            put("Перебить", "Override");

            // Object
            put("Петух", "Object");
            put("вычислитьКласс", "getClass");
            put("кодоваяШняга", "hashCode");
            put("свой", "equals");
            put("клон", "clone");
            put("поПацански", "toString");
            put("позвонить", "notify");
            put("позвонитьПацанам", "notifyAll");
            put("мотатьСрок", "wait");
            put("сестьВтюрягу", "finalize");

            // Iterable
            put("Говнодыраторный", "Iterable");
            put("говнодыратор", "iterator");
            put("пероПодРебро", "forEach");
            put("разделительЯги", "spliterator");

            // Collection
            put("ухтыжёптыж", "size");
            put("нетЛавэ", "isEmpty");
            put("яТвойОтецЕбуОвец", "contains");
            put("кПомойке", "toArray");
            put("заебошить", "add");
            put("уебать", "remove");
            put("яТвойОтецЕбуВсехОвец", "containsAll");
            put("заебошитьВсе", "addAll");
            put("заебошитьВсё", "addAll");
            put("уебатьВсем", "removeAll");
            put("уебатьВилкойвглаз", "removeIf");
            put("ебаломВпол", "retainAll");
            put("урыть", "clear");
            put("жидкое", "stream");
            put("жидкоеГовно", "parallelStream");

            // List
            put("Компаха", "List");
            put("весьПивасПодмени", "replaceAll");
            put("сидор", "sort");
            put("вычислить", "get");
            put("заебенить", "set");
            put("поТюряге", "indexOf");
            put("последняяОтсидка", "lastIndexOf");
            put("говнодыраторСвалки", "listIterator");
            put("мелкаяКомпаха", "subList");

            // ArrayList
            put("КомпахаНаПомойке", "ArrayList");

            // Set
            put("Хабар", "Set");

            // HashSet
            put("ШняжныйХабар", "HashSet");

            // String
            put("Район", "String");
            put("валио", "value");
            put("шняга", "hash");
            put("хуйняНутыпоэлОткуда", "codePointAt");
            put("хуйняНутыпоэлГде", "codePointBefore");
            put("нутыпоэлСколькоХуйни", "codePointCount");
            put("нутыпоэлКудаХуйнюПринести", "offsetByCodePoints");
            put("вычислитьПидоров", "getChars");
            put("вычислитьГдеСемки", "getBytes");
            put("ухтыжёптыжСвой", "contentEquals");
            put("ухтыжёптыжИгнорщикЕбаный", "equalsIgnoreCase");
            put("НА_МУСОРОВ_ПОХУЮ", "CASE_INSENSITIVE_ORDER");
            put("сравнитьИгнорщикаЕбаного", "compareToIgnoreCase");
            put("уФениПроблемы", "regionMatches");
            put("начатьЗалупку", "startsWith");
            put("отЗалупки", "endsWith");
            put("спиздитьМеждуСтрок", "substring");
            put("заебеньВсе", "concat");
            put("пивасПодмени", "replace");
            put("футбики", "matches");
            put("первыйПивасПодмени", "replaceFirst");
            put("поделитьЯгу", "split");
            put("вписаться", "join");
            put("неКапсом", "toLowerCase");
            put("капсомБля", "toUpperCase");
            put("вырезатьОчко", "trim");
            put("хулеНаПомойку", "toCharArray");
            put("зашитьОчко", "format");
            put("валиоОф", "valueOf");
            put("клонВалиоОф", "copyValueOf");
            put("мелкийБотанБольнички", "intern");

            // Serializable
            put("Осёл", "Serializable");

            // Comparable
            put("Сравнимый", "Comparable");
            put("сравниС", "compareTo");

            // Comparator
            put("Сравнитель", "Comparator");
            put("сравнить", "compare");
            put("внизГоловой", "reversed");
            put("потомВнизГоловой", "thenComparing");
            put("потомВнизГоловойХуйню", "thenComparingInt");
            put("потомВнизГоловойКолонну", "thenComparingLong");
            put("потомВнизГоловойДвойных", "thenComparingDouble");
            put("внизГоловойПидора", "reverseOrder");
            put("внатуреПидор", "naturalOrder");
            put("порожнякВначале", "nullsFirst");
            put("нуллиоВначале", "nullsFirst");
            put("порожнякВконце", "nullsLast");
            put("нуллиоВконце", "nullsLast");
            put("сравнение", "comparing");
            put("сравнениеХуйни", "comparingInt");
            put("сравнениеКолонны", "comparingLong");
            put("сравнениеДвойных", "comparingDouble");

            // CharSequence
            put("СлыштеБля", "CharSequence");
            put("писькомер", "length");
            put("обаЁба", "charAt");
            put("обаЕба", "charAt");
            put("слыштеБляМелкие", "subSequence");
            put("вычёбля", "chars");
            put("нутыпоэлЧёЗаХуйня", "codePoints");

            // System
            put("Система", "System");
            put("Система.тыЭтоПишибля", "System.in");
            put("Система.дверь", "System.out");
            put("Система.папандос", "System.err");
            put("Система.взятьБумагу", "System.setIn");
            put("Система.выпилитьДверь", "System.setOut");
            put("Система.принятьПапандос", "System.setErr");
            put("Система.красноглазое", "System.console");
            put("Система.мойКореш", "System.inheritedChannel");
            put("Система.мент", "System.setSecurityManager");
            put("Система.вызватьМента", "System.getSecurityManager");
            put("Система.сколькоВремя", "System.currentTimeMillis");
            put("Система.наноВремя", "System.nanoTime");
            put("Система.клонироватьПомойку", "System.arraycopy");
            put("Система.номерок", "System.identityHashCode");
            put("Система.увидетьЗаяву", "System.getProperties");
            put("Система.отстрелитьХуй", "System.lineSeparator");
            put("Система.накататьЗаяву", "System.setProperties");
            put("Система.увидетьТекстЗаявы", "System.getProperty");
            put("Система.накататьТекстЗаявы", "System.setProperty");
            put("Система.забратьЗаяву", "System.clearProperty");
            put("Система.камера", "System.getenv");
            put("Система.выход", "System.exit");
            put("Система.мусорка", "System.gc");
            put("Система.вТюрягу", "System.runFinalization");
            put("Система.вТюрягуПриВыходе", "System.runFinalizersOnExit");
            put("Система.нестиСемки", "System.load");
            put("Система.нестиПачкуСемок", "System.loadLibrary");
            put("Система.засратьВсюПачкуСемок", "System.mapLibraryName");

            // System short methods
            put("системноНаПечать", "System.out.print");
            put("системноСтрокуНаПечать", "System.out.println");
            put("системноИсправленияНаПечать", "System.out.printf");

            // PrintStream
            put("ЖидкаяПечать", "PrintStream");
            put("промытьМозги", "flush");
            put("завали", "close");
            put("естьПапандос", "checkError");
            put("малява", "write");
            put("наПечать", "print");
            put("строкуНаПечать", "println");
            put("исправленияНаПечать", "printf");
            put("присобачить", "append");

            // Map
            put("Тубзик", "Map");
            put("естьКуча", "containsKey");
            put("естьГовно", "containsValue");
            put("насрать", "put");
            put("насратьПоПолной", "putAll");
            put("насранаяКуча", "keySet");
            put("насраноеГовно", "values");
            put("насранаяКучаГовна", "entrySet");
            put("вычислитьИлиВъебать", "getOrDefault");
            put("насратьЕслиНеНасрано", "putIfAbsent");
            put("насратьЕслиРядомНеНасрано", "computeIfAbsent");
            put("насратьНаверх", "compute");
            put("слить", "merge");

            // Entry
            put("КучаГовна", "Entry");
            put("вычислитьКучу", "getKey");
            put("вычислитьГовно", "getValue");
            put("насратьГовна", "setValue");
            put("сравнитьПоКуче", "comparingByKey");
            put("сравнитьПоГовну", "comparingByValue");

            // HashMap
            put("ШняжныйТубзик", "HashMap");

            // Boolean
            put("Пацан", "Boolean");

            // Byte
            put("Семка", "Byte");

            // Character
            put("Эээ", "Character");

            // Double
            put("Двойные", "Double");

            // Float
            put("Плавник", "Float");

            // Integer
            put("Хуйня", "Integer");

            // Long
            put("Колонна", "Long");

            // Short
            put("Пипин", "Short");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}

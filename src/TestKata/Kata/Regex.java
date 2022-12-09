package TestKata.Kata;

class Regex {


    public static boolean isArab(String a) throws Exception {
        boolean isArabNum = a.matches("[\\d]") || a.matches("(10)");
        return isArabNum;

    }

    public static boolean isMathSymbol(String c) throws Exception {
        boolean isSymbol = c.matches("[+*/-]");
        if (isSymbol == false) throw new Exception("Вы неправильно ввели знак действия");
        return isSymbol;

    }

    public static boolean isRoman(String a) throws Exception {
        boolean isRomanNum = a.matches("[VX]") || a.matches("I{0,3}") || a.matches("IV") || a.matches("VI") || a.matches("VII") || a.matches("VIII") || a.matches("IX");
        if (isRomanNum == false) throw new Exception("Используйте только арабские числа от 1 до 10 включительно или только римские цыфрф от I до X включительно");
        return isRomanNum;

    }
}
package dzien2;

public class StringUtil { // String helper


    private StringUtil() {
    }

    public static boolean containsIgnoreCase(String str1, String str2) {
        return str1.toLowerCase().contains(str2.toLowerCase());
    }

    public static String fragmentBetweenChars(String text, char firstLetter, char secondLetter) {
        return text.substring(text.indexOf(firstLetter) + 1, text.indexOf(secondLetter));
    }
}

package dzien2;

public class StringUtil { // String helper


    private StringUtil() {
    }

    public static boolean containsIgnoreCase(String str1, String str2) {
        return str1.toLowerCase().contains(str2.toLowerCase());
    }

    /**
     * Ta metoda wycina fragment tekstu pomiędzy wskazanymi literami
     * @param text wprowadzony test
     * @param firstLetter pierwsza litera od której ma zacząć się przycinanie tekstu
     * @param secondLetter litera do której przycinamy tekst
     * @return fragment tekstu pomiędzy wprowadzonymi literami
     * @deprecated ta metoda często zwraca wyjątki, np kiedy litera nie występuje w tekście
     * @see String.substring()
     * @since 1.2
     */
    @Deprecated
    public static String fragmentBetweenChars(String text, char firstLetter, char secondLetter) {
        return text.substring(text.indexOf(firstLetter) + 1, text.indexOf(secondLetter));
    }
}

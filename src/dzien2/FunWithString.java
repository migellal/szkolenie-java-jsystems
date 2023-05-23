package dzien2;

import static dzien2.StringUtil.fragmentBetweenChars;

public class FunWithString {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        System.out.println(text);
        System.out.println(text.substring(1, 3));
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println(text.codePointAt(0));
        System.out.println(text.concat(" i psa")); // konkatenacja, domyślnie korzystamy z symbolu +
        System.out.println(text.equalsIgnoreCase("ALA MA KOTA"));
        System.out.println(text.endsWith("psa"));
        System.out.println(text.indexOf("m"));
        System.out.println(text.indexOf("o"));
        System.out.println(text.substring(text.indexOf('m') + 1, text.indexOf('o'))); // łączenie metod, oznacza wytnij mi fragment pomiędzy literami
        System.out.println(fragmentBetweenChars(text, 'm', 'o')); // util z powyżsyzm

        String[] split = text.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        int a = 0;
        a++;
        System.out.println(a);

        String text2 = text + " i psa";

        addVer2();
    }

    private static void addVer1() {
        long start = System.currentTimeMillis();
        String text = "a";
        for (int i = 0; i < 1000000; i++) {
            text = text.concat("a");
        }
        System.out.println(text);
        long stop = System.currentTimeMillis();
        System.out.println("Czas trwania operacji:");
        System.out.println(stop-start);
    }
    /*
    Przy milionie operacji czas trwania:
    129232 (2 minuty)
     */

    private static void addVer2() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb);
        long stop = System.currentTimeMillis();
        System.out.println("Czas trwania operacji:");
        System.out.println(stop-start);
    }
    /*
    Przy milionie operacji czas trwania:
    63 milis
     */
}

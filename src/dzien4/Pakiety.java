package dzien4;

import dzien2.StringUtil;
import dzien4.fakelista.ArrayList;

import java.util.List;

import static dzien2.StringUtil.containsIgnoreCase;

public class Pakiety {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("text1");
        list.add("text2");

        System.out.println(list);

        for(String str : list) {
            System.out.println(str);
        }

        List<String> prawdziwaLista = new java.util.ArrayList<>();

        String str1 = StringUtil.fragmentBetweenChars("text", 'e', 'x'); // import klasyczny
        boolean b = containsIgnoreCase("text", "text"); // import statyczny, trzeba uważać na te same nazwy metod w klasie
    }

//    private static boolean containsIgnoreCase(String str1, String str2) { // ta sama nazwa metody jak przy imporcie
//        return false;
//    }
}

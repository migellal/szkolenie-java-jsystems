package dzien2.faktura;

import java.util.ArrayList;
import java.util.List;

public class SystemFakturowy {

    public static void main(String[] args) {
        Petent petent1 = new Petent("Krzysztof", "Nowak", 5040073424L);
        Petent petent2 = new Petent("Wojtek", "Kwiatkowski", "Rowery małe i duże - bis", 5040076324L);
        Petent petent3 = new Petent("Marian", "Stanowski", 523473424L);
        Petent petent4 = new Petent("Zdzisław", "Kapucha", "Kapucha serivces", 5040079832L);

        Faktura faktura1 = new Faktura(1023, "Rower biegowy marki gazela", petent1, petent2);
        Faktura faktura2 = new Faktura(345.50, "Wywóz dachówek", petent3, petent4);

        faktura1.drukuj();
        faktura2.drukuj();

        System.out.println(faktura1);

        String[] array1 = new String[]{"1","2","3"};
        System.out.println(array1);
        List<String> list = new ArrayList<>(); // więcej o tym w późniejszych lekcjach
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list); // drukuje prawdziwą zawartosć, a nie tylko nazwę klasy i hash

        Faktura faktura3 = new Faktura(1023, "Rower biegowy marki gazela", petent1, petent2);
        Faktura faktura4 = new Faktura(345.50, "Wywóz dachówek", petent3, petent4);

        System.out.println(faktura4.getNumerFaktury());

    }
}
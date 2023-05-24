package dzien3;

import dzien3.ksiegowosc.Faktura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kolekcje {
    public static void main(String[] args) {
        List<Faktura> list = new ArrayList<>();
        list.add(new Faktura(23));
        list.add(new Faktura(11));
        list.add(new Faktura(131));
        list.add(new Faktura(7));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}

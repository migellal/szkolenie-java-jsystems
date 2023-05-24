package dzien3;

import dzien3.generyki.Krotka;
import dzien3.generyki.NaiwnePudelko;
import dzien3.generyki.OperationResult;
import dzien3.generyki.Pudelko;
import dzien3.ksiegowosc.Faktura;

import java.util.*;
import java.util.function.Consumer;

public class Kolekcje {
    public static void main(String[] args) {
//        ArrayList<Faktura> list1 = new ArrayList<>(); // tak można zapisać, ale zazwyczaj się tego nie robi
        List<Faktura> list = new ArrayList<>();
        Faktura f = new Faktura(131);

        list.add(new Faktura(23));
        list.add(new Faktura(11));
        list.add(f);
        list.add(new Faktura(7));
        list.add(new Faktura(54));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.remove(f);
        System.out.println(list);
        list.remove(new Faktura(54));
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }


        List<String> list2 = new LinkedList<>();
        // szybsza podczas usuwania elementów

        // List - zapamietuje w kolejnosci dodawania, może  zawierać duplikaty
        // Set -  nie dba o kolejnosc, cała kolekcja jest unikalna
        // Map - posiada pola klucz, oraz wartość

        NaiwnePudelko naiwnePudelkoNaFaktury = new NaiwnePudelko();
        naiwnePudelkoNaFaktury.wrzucDoPudelka(new Faktura(23));
        Faktura f2 = (Faktura) naiwnePudelkoNaFaktury.wezZPudelka();

        Pudelko<Faktura> fajnePudelkoNaFaktury = new Pudelko<>();
        fajnePudelkoNaFaktury.wrzucDoPudelka(new Faktura(342));
        Faktura faktura = fajnePudelkoNaFaktury.wezZPudelka();

        Pudelko<String> pudelkoNaNapisy = new Pudelko<>();
        pudelkoNaNapisy.wrzucDoPudelka("jakiś napis");
        System.out.println(pudelkoNaNapisy.wezZPudelka());

        OperationResult<Faktura> fakturaOperationResult = zapisIOdczyt();
        if (fakturaOperationResult.isSuccess()) {
            System.out.println(fakturaOperationResult.getResult());
        } else {
            System.err.println(fakturaOperationResult.getErrorMessage());
        }

        Set<String> set = new HashSet<>();
        set.add("napis1");
        set.add("napis4");
        set.add("napis3");
        System.out.println(set);
        set.add("napis4"); // nie zostało dodane, ponieważ ten element istanił już wcześniej
        System.out.println(set);
        set.remove("napis1"); // zostało usunięte, nei istnieje opcja usunięcia po indexie
        System.out.println(set);
        System.out.println(set.size());

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "jeden");
        System.out.println(map);
        map.put(0, "zerozero"); // nadpisuje klucz, jeśli takowy istnieje
        System.out.println(map);
        map.putIfAbsent(1, "jedenjeden"); // dodaje klucz, jeśli go nie ma
        System.out.println(map);
        System.out.println(map.get(1));
        map.put(3, "szukana");
        map.put(4, "szukana");
        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            String value = map.get(key);
            if (value.equals("szukana")) {
                System.out.println(key);
            }
        }

        map.remove(4);
        map.remove(3, "trzy"); // ten remove nie zadziała, ponieważ wartość jest inna
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(" -------------------- --- ");
        for (Faktura fak : list) {// iterator fori, znajduje się powyżej
            fak.policz();
        }

        System.out.println(" ----------------------- - ------");
        for (String s : set) {
            System.out.println(s);
        }
        set.forEach(new Consumer<String>() { // stare podejście
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        set.forEach(s -> { // nowe podejście - lambda
            System.out.println(s);
        });

        for (Map.Entry<Integer, String> entry : map.entrySet()) { // fori nie zadziała
            System.out.println("Klucz: " + entry.getKey() + " Wartość: " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println("Klucz: " + k + " Wartość: " + v));

    }

    private static Krotka<Faktura, String> zlozonaOperacja() {
        // zlozona operacja na danych, która powinna na raz zwrócić dwa różne typy
        String notatka = "Nie płacić, zlecenie nieudane, do neegocjacji";
        Faktura f = new Faktura(999);
        return new Krotka<>(f, notatka);
    }

    private static OperationResult<Faktura> zapisIOdczyt() {
        // łączę się z bazą danych i próbuje coś odczytać
//        OperationResult operationResult = new OperationResult(new Faktura(12));
        OperationResult<Faktura> operationResult = new OperationResult(false, "serwer niedostępny", null);
        return operationResult;
    }
}

package dzien3;

import dzien3.generyki.Krotka;
import dzien3.generyki.NaiwnePudelko;
import dzien3.generyki.OperationResult;
import dzien3.generyki.Pudelko;
import dzien3.ksiegowosc.Faktura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
        if(fakturaOperationResult.isSuccess()) {
            System.out.println(fakturaOperationResult.getResult());
        } else {
            System.err.println(fakturaOperationResult.getErrorMessage());
        }
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

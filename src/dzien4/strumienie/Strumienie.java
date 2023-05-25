package dzien4.strumienie;

import dzien3.ksiegowosc.Faktura;
import dzien4.data.GraPlanszowa;
import dzien4.data.Wydawca;

import java.util.*;
import java.util.stream.Collectors;

public class Strumienie {

    public static void main(String[] args) {
        // Generowanie 10 instancji klasy Wydawca
        Wydawca wydawca1 = new Wydawca("Wydawnictwo XYZ", 1990, false);
        Wydawca wydawca2 = new Wydawca("GryPlanszowe123", 2005, true);
        Wydawca wydawca3 = new Wydawca("SuperGry", 1985, true);
        Wydawca wydawca4 = new Wydawca("MegaPlanszówki", 2010, true);
        Wydawca wydawca5 = new Wydawca("FantazyGames", 1998, false);
        Wydawca wydawca6 = new Wydawca("NoweHoryzonty", 2003, false);
        Wydawca wydawca7 = new Wydawca("BoardGameMasters", 2015, true);
        Wydawca wydawca8 = new Wydawca("GameInnovation", 2008, true);
        Wydawca wydawca9 = new Wydawca("PlayfulMinds", 1995, false);
        Wydawca wydawca10 = new Wydawca("WonderlandGames", 2012, true);

        // Generowanie 40 instancji klasy GraPlanszowa
        GraPlanszowa gra1 = new GraPlanszowa("Catan", 4.5, 99.99, 3, 4, wydawca1);
        GraPlanszowa gra2 = new GraPlanszowa("Splendor", 4.2, 79.99, 2, 4, wydawca2);
        GraPlanszowa gra3 = new GraPlanszowa("Ticket to Ride", 4.7, 149.99, 2, 5, wydawca3);
        GraPlanszowa gra4 = new GraPlanszowa("Azul", 4.4, 69.99, 2, 4, wydawca4);
        GraPlanszowa gra5 = new GraPlanszowa("Codenames", 4.6, 59.99, 4, 8, wydawca5);
        GraPlanszowa gra6 = new GraPlanszowa("Pandemic", 4.8, 89.99, 2, 4, wydawca6);
        GraPlanszowa gra7 = new GraPlanszowa("7 Wonders", 4.3, 109.99, 2, 7, wydawca7);
        GraPlanszowa gra8 = new GraPlanszowa("Carcassonne", 4.4, 79.99, 2, 5, wydawca8);
        GraPlanszowa gra9 = new GraPlanszowa("Dixit", 4.6, 69.99, 3, 6, wydawca9);
        GraPlanszowa gra10 = new GraPlanszowa("Scythe", 4.8, 199.99, 1, 5, wydawca10);
        GraPlanszowa gra11 = new GraPlanszowa("Kingdomino", 4.2, 49.99, 2, 4, wydawca1);
        GraPlanszowa gra12 = new GraPlanszowa("Santorini", 4.5, 89.99, 2, 4, wydawca2);
        GraPlanszowa gra13 = new GraPlanszowa("Dominion", 4.4, 99.99, 2, 4, wydawca3);
        GraPlanszowa gra14 = new GraPlanszowa("Ticket to Ride: Europe", 4.7, 159.99, 2, 5, wydawca4);
        GraPlanszowa gra15 = new GraPlanszowa("Forbidden Island", 4.3, 49.99, 2, 4, wydawca5);
        GraPlanszowa gra16 = new GraPlanszowa("Pandemic Legacy: Season 1", 4.9, 179.99, 2, 4, wydawca6);
        GraPlanszowa gra17 = new GraPlanszowa("Terraforming Mars", 4.7, 129.99, 1, 5, wydawca7);
        GraPlanszowa gra18 = new GraPlanszowa("7 Wonders Duel", 4.6, 99.99, 2, 2, wydawca8);
        GraPlanszowa gra19 = new GraPlanszowa("Splendor: Cities of Splendor", 4.5, 49.99, 2, 4, wydawca9);
        GraPlanszowa gra20 = new GraPlanszowa("Gloomhaven", 4.9, 299.99, 1, 4, wydawca10);
        GraPlanszowa gra21 = new GraPlanszowa("Pandemic Legacy: Season 2", 4.9, 189.99, 2, 4, wydawca1);
        GraPlanszowa gra22 = new GraPlanszowa("Ticket to Ride: Nordic Countries", 4.6, 139.99, 2, 3, wydawca2);
        GraPlanszowa gra23 = new GraPlanszowa("Everdell", 4.7, 129.99, 1, 4, wydawca3);
        GraPlanszowa gra24 = new GraPlanszowa("Azul: Stained Glass of Sintra", 4.3, 89.99, 2, 4, wydawca4);
        GraPlanszowa gra25 = new GraPlanszowa("Codenames: Duet", 4.6, 59.99, 2, 4, wydawca5);
        GraPlanszowa gra26 = new GraPlanszowa("Terra Mystica", 4.8, 109.99, 2, 5, wydawca6);
        GraPlanszowa gra27 = new GraPlanszowa("Agricola", 4.5, 119.99, 1, 5, wydawca7);
        GraPlanszowa gra28 = new GraPlanszowa("Spirit Island", 4.7, 99.99, 1, 4, wydawca8);
        GraPlanszowa gra29 = new GraPlanszowa("Wingspan", 4.9, 149.99, 1, 5, wydawca9);
        GraPlanszowa gra30 = new GraPlanszowa("The Castles of Burgundy", 4.4, 89.99, 2, 4, wydawca10);
        GraPlanszowa gra31 = new GraPlanszowa("Carcassonne: Hunters and Gatherers", 4.6, 69.99, 2, 5, wydawca1);
        GraPlanszowa gra32 = new GraPlanszowa("Lords of Waterdeep", 4.7, 109.99, 2, 5, wydawca2);
        GraPlanszowa gra33 = new GraPlanszowa("7 Wonders: Leaders", 4.5, 39.99, 2, 7, wydawca3);
        GraPlanszowa gra34 = new GraPlanszowa("Tzolk'in: The Mayan Calendar", 4.8, 129.99, 2, 4, wydawca4);
        GraPlanszowa gra35 = new GraPlanszowa("Gloomhaven: Jaws of the Lion", 4.9, 129.99, 1, 4, wydawca5);
        GraPlanszowa gra36 = new GraPlanszowa("Dominion: Intrigue", 4.5, 79.99, 2, 4, wydawca6);
        GraPlanszowa gra37 = new GraPlanszowa("King of Tokyo", 4.3, 49.99, 2, 6, wydawca7);
        GraPlanszowa gra38 = new GraPlanszowa("Mage Knight", 4.7, 169.99, 1, 4, wydawca8);
        GraPlanszowa gra39 = new GraPlanszowa("Patchwork", 4.6, 39.99, 2, 2, wydawca9);
        GraPlanszowa gra40 = new GraPlanszowa("Splendor: Marvel", 4.5, 59.99, 2, 4, wydawca10);

        List<GraPlanszowa> gry = Arrays.asList(gra1, gra2, gra3, gra4, gra5, gra6, gra7, gra8, gra9, gra10,
                gra11, gra12, gra13, gra14, gra15, gra16, gra17, gra18, gra19, gra20,
                gra21, gra22, gra23, gra24, gra25, gra26, gra27, gra28, gra29, gra30,
                gra31, gra32, gra33, gra34, gra35, gra36, gra37, gra38, gra39, gra40);

        List<GraPlanszowa> gry2 = new ArrayList<>(); // gry od wydawcy po 2000 roku z oceną równą bądź powyżej 4.7

        for (GraPlanszowa gra : gry) {
            if(gra.getWydawca().getRokPowstaniaWydawnictwa()>2000 && gra.getOcena()>=4.7) {
                gry2.add(gra);
            }
        }

        System.out.println(gry2.size());
        System.out.println(gry2);

        Map<Wydawca, List<GraPlanszowa>> wydawcyMap = new HashMap<>(); // wydawcy którzy wydają tylko gry planszowe i ich tytuły
        List<Wydawca> wydawcy = new ArrayList<>(); // wydawcy którzy wydają tylko gry planszowe i wydali ich conajmniej 2

        for (GraPlanszowa gra : gry) {
            if(gra.getWydawca().isWydajeTylkoGryPlanszowe()) {
                List<GraPlanszowa> gryPlanszowe = wydawcyMap.get(gra.getWydawca());
                if(gryPlanszowe != null) {
                    gryPlanszowe.add(gra);
                } else {
                    gryPlanszowe = new ArrayList<>();
                    gryPlanszowe.add(gra);
                }
                wydawcyMap.put(gra.getWydawca(), gryPlanszowe);
            }
        }

        for (Map.Entry<Wydawca, List<GraPlanszowa>> entry : wydawcyMap.entrySet()) {
            if(entry.getValue().size()>=2) {
                wydawcy.add(entry.getKey());
            }
        }

        System.out.println(wydawcy.size());
        System.out.println(wydawcy);

        // chat gpt wersja 1
        Map<Wydawca, List<GraPlanszowa>> wydawcyMap2 = new HashMap<>();
        List<Wydawca> wydawcy2 = new ArrayList<>();

        for (GraPlanszowa gra : gry) {
            if (gra.getWydawca().isWydajeTylkoGryPlanszowe()) {
                wydawcyMap2.computeIfAbsent(gra.getWydawca(), k -> new ArrayList<>()).add(gra);
            }
        }

        wydawcyMap2.forEach((wydawca, gryPlanszowe) -> {
            if (gryPlanszowe.size() >= 2) {
                wydawcy2.add(wydawca);
            }
        });

        System.out.println(wydawcy2.size());
        System.out.println(wydawcy2);

        // chat gpt wersja 2
        Map<Wydawca, List<GraPlanszowa>> wydawcyMap3 = gry.stream()
                .filter(gra -> gra.getWydawca().isWydajeTylkoGryPlanszowe())
                .collect(Collectors.groupingBy(GraPlanszowa::getWydawca));

        List<Wydawca> wydawcy3 = wydawcyMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() >= 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(wydawcy3.size());
        System.out.println(wydawcy3);

        List<Wydawca> wydawcy4 = gry.stream()
                .filter(gra -> gra.getWydawca().isWydajeTylkoGryPlanszowe())
                .collect(Collectors.groupingBy(GraPlanszowa::getWydawca))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() >= 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(wydawcy4.size());
        System.out.println(wydawcy4);

        System.out.println(" ----------------------- ---------------- ");

        List<GraPlanszowa> gry3 = new ArrayList<>(); // gry od wydawcy po 2000 roku z oceną równą bądź powyżej 4.7

        for (GraPlanszowa gra : gry) {
            if(gra.getWydawca().getRokPowstaniaWydawnictwa()>2000 && gra.getOcena()>=4.7) {
                gry3.add(gra);
            }
        }

        System.out.println(gry3.size());
        System.out.println(gry3);

        List<GraPlanszowa> gry4 = gry.stream()
                .filter(g -> g.getWydawca().getRokPowstaniaWydawnictwa() > 2000) // tutaj warunek or ||, jeśli takiego potrzebujesz
                .filter(g -> g.getOcena() >= 4.7)
                .toList(); // ctrl + alt + v -> generuje lewą część zmiennej (czyli typ, nazwę, oraz znak równości)

        System.out.println(gry4.size());
        System.out.println(gry4);

        List<Wydawca> wydawcy5 = wydawcy2.stream()
                .filter(Wydawca::isWydajeTylkoGryPlanszowe) // znaczy to samo co: w -> w.isWydajeTylkoGryPlanszowe()
                .toList();

        List<Integer> wydawcy6 = wydawcy2.stream()
                        .mapToInt(Wydawca::getRokPowstaniaWydawnictwa) // znaczy to samo co w -> w.getRokPowstaniaWydawnictwa()
                        .boxed() // metoda zamienia IntStream na Stream
                        .toList();

        // metody w stream:
        // filter -> służy do filtrowania, w nawiasie podajemy warunek podobny do tego z ifa
        // map -> służy do transofrmacji typu
        // anyMatch -> czy którykolwiek z elementów spełnia warunek
        // allMatch -> czy wszystkie z elementów spełniają warunek
        // findAny -> znajdź którykolwiek
        // findFirst -> znajdź pierwszy
        // count -> policz, zwraca liczbę elementów
        // dropWhile -> usuń wszystkie elementy do pierwszego elementu spełniającego warunek

        boolean b = wydawcy2.stream().anyMatch(w -> w.getRokPowstaniaWydawnictwa() < 2005);

        Optional<Wydawca> optionalWydawca = wydawcy.stream().findAny();

        if(optionalWydawca.isPresent()) {
            System.out.println("Istnieje wydawca");
        } else {
            System.err.println("Nie odnaleziono wydawcy");
        }

        System.out.println(wydawcy5);
        System.out.println(wydawcy5.size());

        Faktura faktura = pobierzFakture(45);
        System.out.println(faktura.getTyp());

        Faktura faktura2 = pobierzFakture(45);
        if(faktura2 != null) {
            System.out.println(faktura2.getTyp()); // bez ifa nullPointerException
        }

        Optional<Faktura> faktura1 = pobierzFaktureMadrze(23);
        if(faktura1.isPresent()) {
            System.out.println(faktura1);
        } else {
            System.err.println("Nie ma faktury, podaj inny numer");
        }
    }

    public static Faktura pobierzFakture(int id) {
        // połączenie z bazą danych, wyszukiwanie faktury po id
        // faktura istnieje albo nie, a więc zwracamy Fakturę, albo null
        return null; // new Faktura(23);
    }

    public static Optional<Faktura> pobierzFaktureMadrze(int id) {
        // połączenie z bazą danych, wyszukiwanie faktury po id
        // faktura istnieje albo nie, a więc zwracamy Fakturę, albo null
        return Optional.ofNullable(new Faktura(23));
//        return Optional.empty(); // new Faktura(23);
    }
    /*
    Napisać generator liczb losowych, wygenerować liczby lotto jeden raz (6 liczb, zakres 1 do 49),
    a następnie powtarzać to generowanie tak długo, az drugi raz trafimy na te same liczby
    wyświetlić ile było to losowań, jaki był koszt kuponu i czy się opłaciło
     */
        /*
    Wylosować liczbę z zakresu 1 do 100, a następnie odpytywać użytkownika tak długo, aż poda właściwą liczbę,
    po każdej odpowiedzi informować użytkownika czy wylosowana liczba jest większa, czy mniejsza.
    Na koniec wyświetlić ile prób podjął użytkownik (użyć try-catch, żeby zabezpieczyć się przed fałszywymi odpowiedziami)
     */

}

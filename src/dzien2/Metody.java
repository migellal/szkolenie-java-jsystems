package dzien2;

import java.util.Scanner;

public class Metody {

    private static int ostatniWynik;

    public static void main(String[] args) {
        System.out.println("to jest tekst");
        wypiszNazweKlasy();
        wypiszNazweKlasy();

        int wynik = mnozonyPrzezDwa(10);
        System.out.println(mnozonyPrzezDwa(0));
        System.out.println("wynik= " + wynik);
        int podwojneMnozenie = mnozonyPrzezDwa(mnozonyPrzezDwa(2));
        System.out.println(podwojneMnozenie);
        System.out.println("ostatni wynik= " + ostatniWynik);
        System.out.println(mnozenie(5, 6)); // ctrl+p - podglądanie parametrów
        System.out.println(mnozenie()); // wywołanie przeładowanej metody mnozenie
        System.out.println();
        System.out.println(" --------------- ---------------");
        System.out.println(dodawanie()); // metoda z trzema kropkami - nieoznaczona liczba zmiennych
        System.out.println(dodawanie(4, 3, 6, 1));
        System.out.println(dodawanie(4));
        System.out.println(dodawanie(4, 6, 3, 1, 3, 4, 6, 3, 2, 43, 2));

        /*
        1.	Napisz nową metodę, a w niej wprowadź dwie liczby całkowite, wydrukuj wszystkie wartości pomiędzy nimi
            (pamiętaj, że użytkownik może najpierw podać większą wartość)
         */
        drukujWartosci();

    }

    public static void drukujWartosci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        if (a > b) {
            drukujWartoscPomiedzy(b, a);
        } else {
            drukujWartoscPomiedzy(a, b);
        }
    }

    public static void drukujWartoscPomiedzy(int low, int high) {
        low++;
        for (; low < high; low++) {
            System.out.print(low + ", ");
        }
    }

    public static void wypiszNazweKlasy() {
        System.out.println("Metody");
    }

    public static int mnozonyPrzezDwa(int liczba) {
        int wynik;
        if (liczba == 0) {
            wynik = 0;
        } else {
            wynik = liczba * 2;
        }
        ostatniWynik = wynik;
        return wynik;
    }

    public static int mnozenie(int a, int b) {
        return a * b;
    }

    // override (przeciążanie) vs overload
    // tutaj mamy overload - przeładowanie
    private static int mnozenie() {
        return 0;
    }

    private static int dodawanie(int... ints) {
        int wynik = 0;
        for (int x : ints) {
            wynik = wynik + x;
        }
        return wynik;
    }
}

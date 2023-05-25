package dzien4;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/*
Wylosować liczbę z zakresu 1 do 100, a następnie odpytywać użytkownika tak długo, aż poda właściwą liczbę,
po każdej odpowiedzi informować użytkownika czy wylosowana liczba jest większa, czy mniejsza.
Na koniec wyświetlić ile prób podjął użytkownik (użyć try-catch, żeby zabezpieczyć się przed fałszywymi odpowiedziami)
*/
public class ZadanieLoteria {
    public static void main(String[] args) {
        int poprawnaLiczba = losujLiczbe();

        System.out.println("Wylosowałem liczbę od 1 do 100, zgadnij jaką?");

        boolean kolejnaProba = true;
        int proby = 0;

        while (kolejnaProba) {
            int podanaLiczba = -1;
            try {
                proby++;
                Scanner scanner = new Scanner(System.in);
                podanaLiczba = scanner.nextInt();
            } catch (NoSuchElementException e) {
                System.err.println("Ejj ale bez takich!");
            }
            if (podanaLiczba < 0 || podanaLiczba > 100) {
                System.out.println("Podaj liczbę z zakresu od 1 do 100");
            } else if (podanaLiczba < poprawnaLiczba) {
                System.out.println("Spróbuj podać większą liczbę");
            } else if (podanaLiczba > poprawnaLiczba) {
                System.out.println("Spróbuj podać liczbę mniejszą");
            } else {
                kolejnaProba = false;
            }
        }

        System.out.println("Udało Ci się! Zgadłeś wylosowaną liczbę, była nią: " + poprawnaLiczba);
        System.out.println("Wystarczyło tylko " + proby + " prób!");
    }

    private static int losujLiczbe() {
        return new Random()
                .ints(1, 1, 100)
                .findAny().orElse(50);
    }
}

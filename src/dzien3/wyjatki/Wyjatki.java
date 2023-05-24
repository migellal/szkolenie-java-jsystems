package dzien3.wyjatki;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Wyjatki {

    public static void main(String[] args) {
        String[] array = new String[]{"tekst"};

        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Indeks poza tablicą");
        }

        System.out.println("program działa dalej.....");

        Scanner scanner = new Scanner(System.in);
//        scanner.close();
        int nextInt = 0;
        try {
            nextInt = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Następnym razem wprowadź poprawne dane!");
        } catch (NoSuchElementException e) {
            System.err.println("Następnym razem wprowadź poprawny input!");
        } catch (IllegalStateException e) {
            System.err.println("Skaner zepsuty");
        } catch (Exception e) {
            System.err.println("Zupełnie nie wiem co się stało, ale tak na pewno nie powinno być!");
        } finally { // blok finally, wykona się ZAWSZE, bez względu na to, czy wykona się try, czy catch
            scanner.close();
        }

        System.out.println(nextInt);

        try {
            Pesel pesel = new Pesel(1232312L);
        } catch (PeselException e) {
            System.err.println("Ten pesel nie jest poprawny!!!");
        }

    }
}

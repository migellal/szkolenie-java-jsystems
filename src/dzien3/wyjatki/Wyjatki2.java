package dzien3.wyjatki;

import java.util.Scanner;

public class Wyjatki2 {

    public static void main(String[] args) {
        int nextInt = 0;
        try (Scanner scanner2 = new Scanner(System.in)) { // try with resources, w nawiasach zasoby które mają zostać zamknięte po przetworzeniu
            nextInt = scanner2.nextInt();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println(nextInt);

        try {
            System.out.println("Super ważne operacje!!!");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("finally");
        }

        KlasaZwracaDane klasaZwracaDane = new KlasaZwracaDane();
        klasaZwracaDane.dane();

        try {
            System.out.println("Super ważne operacje - system exit!!!");
            System.exit(3239);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("finally - system exit");
        }
    }
}

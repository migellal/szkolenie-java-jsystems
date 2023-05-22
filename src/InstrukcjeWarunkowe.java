import java.util.Scanner;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

        boolean warunek = a > 5;
//        if(a>5) { // klasyczny zapis
        if (warunek && a < 15) { // ||, &&
            System.out.println("A jest większe niż 5 ale jest mniejsze niż 15");
        }

        if (a % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        if (a % 3 == 0) { // blok decyzyjny z 3 i więcej możliwościami
            System.out.println("Liczba jest podzielna przez 3");
        } else if (a % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna ani przez 3, ani przez 5");
        }

        if (a == 1) {
            System.out.println("Liczba jest równa 1");
        } else if (a == 2) {
            System.out.println("Liczba jest równa 2");
        } else if (a == 3) {
            System.out.println("Liczba jest równa 3");
        }

        System.out.println("------------------");

        switch (a) { // klasyczny switch-case
            case 1:
                System.out.println("Liczba jest równa 1");
                break;
            case 2:
                System.out.println("Liczba jest równa 2");
                break;
            case 3:
                System.out.println("Liczba jest równa 3");
                break;
            default: // default może być na początku switcha i działa poprawnie
                System.out.println("Liczba nie jest równa ani 1, ani 2, ani 3");
                break;
        }

        switch (a) { // rozszerzony switch-case
            case 1 -> System.out.println("Liczba jest równa 1");
            case 2 -> System.out.println("Liczba jest równa 2");
            case 3 -> System.out.println("Liczba jest równa 3");
            default -> // default może być na początku switcha i działa poprawnie
                    System.out.println("Liczba nie jest równa ani 1, ani 2, ani 3");
        }


    }

}

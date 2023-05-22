import java.util.Random;

public class Petle {
    public static void main(String[] args) {
        int a = 1;
        a++; // a plus plus oznacza: a = a + 1;, a+=1 inkrementacja przyrostkowa
        System.out.println(a);

        System.out.println(a++);
        System.out.println(++a); // inkrementacja przedrostkowa
        a--; // dekrementacja
        System.out.println(" -------------- klasyczna pętla for -");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(" -------------- pętla for od 1 do 10 -");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" -------------- pętla for z zmianą wartości co 2 -");
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println(" -------------- dziwna pętla for");
        int k = 0;
        for (; k <= 10; ) {
            k++;
            System.out.println(k);
        }
        System.out.println(" ------------------ odwrotna pętla for");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] ints = new int[]{5, 2, 7, 4, 2, 0, 8, 2, 5};

        for (int i = 0; i < ints.length; i++) {
            System.out.println("Indeks: " + i + " -> " + ints[i]);
        }

        int index = 0;
        for (int x : ints) {
            System.out.println(x);
            index++;
        }

        boolean by2 = true;
//        while (true) { // pętla która nigdy się nie zatrzyma
//            System.out.println("nieskończoność");
//        }

        int r = 0;
        Random rand = new Random();
        while (true) {
            r = rand.nextInt();
            System.out.println(r);
            if (r > 2000000000) {
                break;
            }
        }

        do {
            System.out.println("Przynajmniej raz!");
        } while (r < 2000000000);

        int r2 = 0;
        Random rand2 = new Random();
        while (r2 < 2000000000) {
            r2 = rand2.nextInt();
            System.out.println(r2);
        }

        /*
        3.	FizzBuzz: Wypisz wszystkie liczby od 1 do 100, jednak jeżeli liczba jest podzielna przez:
        trzy – wypisz „Fizz”,
        pięć – wypisz „Buzz”,
        trzy i pięć wypisz „FizzBuzz”.

        1
        2
        Fizz
        4
        Buzz
        Fizz
        ...
        14
        FizzBuzz
        16
         */

        char ch = 'a';
        for (int i = 0; i <= Character.MAX_VALUE; i++) {
            System.out.println("i: " + i + " -> " + ch++);
        }
        // w ten sposób da analizować zmienną char
        // tutaj jest bardzo ważny komentarz!
        // ten komentarz spowoduje konflikt!

    }
}

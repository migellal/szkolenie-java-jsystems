import java.math.BigDecimal;

public class Zmienne {

    public static void main(String[] args) {
        System.out.println("jakiś\n\r tek\n\tst z klasy Zmienne\n"); // \n nowa linia, \t tabulator
        String text1 = "To jest zmienna zawierająca tekst";
        System.out.println();
        System.out.println(text1);

        System.out.println("\\n");
        System.out.println("\"cudzysłów\""); // \" do wydrukowania cudzysłowiu
        System.out.println(" --------------- ");
        System.out.println();

        int a = 130;
        byte b1 = 127; // byte zajmuje mało miejsca w pamięci, stąd jego maksymalny rozmiar to 127
        byte b2 = -128; // minimalna wartość byte
        b1 = (byte) (b1 + 1); // rzutowanie

        System.out.println(b1);
        System.out.println(b1+"1"); // dodanie napisu zamienia całość na string
        System.out.println(b1+1); // dodanie cyfry zamienia typ na int
        // zmienne mają zdefiniowany minimalny i maksymalny rozmiar
        // zmiana typu zmiennej to rzutowanie, ale jest to operacja niebezpieczna
        // zmienna z przekroczonym zakresem zacznie się liczyć od minimalnej wartości

        int zz = 1;
        String xx1 = "" + zz; // rzutowanie tutaj nie zadziała, aby uzyskać tekst dodajemy pusty tekst
        String xx2 = String.valueOf(zz); // drugi sposób, dedykowana metoda

        short s1 = 32767; // maksymalny short
        short s2 = Short.MIN_VALUE; // -32768 minimalny short

        int i1 = Integer.MAX_VALUE; // 2147483647
        System.out.println(i1);
        int i2 = -2147483648; //

        long l1 = Long.MAX_VALUE; // 9223372036854775807
        System.out.println(l1);
        long l2 = 92233720368L; // dla longów dodajemy literkę L na końcu

        boolean bool1 = true; // typ boolean
        boolean bool2 = false; // true lub false

        char ch = 'a'; // typ znakowy
        System.out.println(ch);
        char ch2 = (char) (ch + 5); // typ arytmetyczny, reprezentuje litery
        System.out.println(ch2);

        char ch3 = Character.MAX_VALUE;
        int chZakres = ch3;
        int chaZakres = ch;
        System.out.println(ch3);
        System.out.println(chZakres);
        System.out.println(chaZakres);

        char ch4 = 130;
        System.out.println(ch4);

        float f1 = Float.MAX_VALUE;
        float f2 = 0.1F; // typ float kończy się literą F

        double d1 = Double.MAX_VALUE; // bardziej dokładny, nie potrzebuje litery na końcu
        double d2 = 0.01;

        int zmienna1 = 4;
        int zmienna2 = 5; // ctrl + d // duplikowanie linii
        double zmienna3 = 4.0;
        int suma = zmienna1 + zmienna2;
        int roznica = zmienna1 - 3;
        int iloczyn = 2 * zmienna2;
        int iloraz = zmienna2/4;
        double iloraz2 = zmienna2/4.0; // zmienna2/4 najpierw zrobi int, potem double, a więc utraci dane
        double iloraz3 = zmienna2/zmienna3; // zmienna2/4 najpierw zrobi int, potem double, a więc utraci dane
        int resztaZDzielenia = zmienna2%zmienna1;
//        BigDecimal bigDecimal = BigDecimal.valueOf(1.0); // obiekty do operacji matematycznych nie gubiące dokładności
//        bigDecimal + 4.0; // to się nie kompiluje
//        BigDecimal added = bigDecimal.add(BigDecimal.valueOf(4.0));

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(iloraz2);
        System.out.println(iloraz3);
        System.out.println(resztaZDzielenia);

        String concat = "Ala " + " ma " + " kota";
        System.out.println(concat);

        System.out.println(" -- -- -- -- --");

        boolean t = true;
        boolean f = false;

        System.out.println(t);
        System.out.println(f);

        // && and, || or, !not

        System.out.println(!t);
        System.out.println(t&&true);
        System.out.println(t&&false);
        System.out.println(f&&false);

        System.out.println(t||f);
        System.out.println(f||t);
        System.out.println(f||f);
        // jeśli zmienna == true lub na dysku w pliku w linii 1000 jest wartość true
        // if(t||Files.readLine(1000)==true) {}
        // 1ms, 350ms
        //

        /*
        7.	Prędkość światła wynosi 299 792 458 m/s. Ile to jest km na sekundę? A ile km na godzinę? Oraz ile metrów na godzinę?
        8.	Odległość słońce-ziemia wynosi około 150 000 000 km. Ile minut i sekund potrzeba, aby promienie dotarły do ziemi?

         */

    }
}

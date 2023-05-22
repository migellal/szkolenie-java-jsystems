public class Tablice {

    public static void main(String[] args) { // psvm, main
        String text1 = "tekst pierwszy";
        String text2 = "tekst drugi";
        String text3 = "tekst trzeci";

        String[] array1 = new String[]{text1, text2,
                text3, "tekst czwarty"};

        System.out.println(array1); // nie wydrukuje zawartości
        System.out.println(array1[1]);
//        System.out.println(array1[4]); // rzuca wyjątek, przerywa działanie aplikacji
        // ponieważ index 4 znajduje się po za tablicą

        System.out.println(array1[3]);
        array1[3] = "to jest tekst";
        System.out.println(array1[3]);

        int[] ints = new int[]{1, 2, 3, 4};
        Object[] objects = new Object[]{1, "napis", ints, array1};

//        System.out.println(args[0]); // argumenty z zewnątrz aplikacji,
        // pojawi się błąd jeśli ich nie mamy

        String[] array2;
        String str;
        array2 = new String[5]; // inny zapis tablicy
        str = "jakiś tekst";

        int[] array3 = new int[5];
        double[] array4 = new double[5];
        boolean[] array5 = new boolean[5];

        System.out.println(array2[1]);
        System.out.println(array3[2]);
        array3[2] = 7;
        System.out.println(array3[2]);
        System.out.println(array4[3]);
        System.out.println(array5[2]);

        String[][][] array6 = new String[][][]{{{"text1"}}, {{"text1", "text2"}}};
        String[][] array7 = array6[0];
        String[] array8 = array7[0];
        System.out.println(array8[0]);
        System.out.println(array6[0][0][0]);

    }

}

package dzien2;

import dzien2.faktura.Faktura;

import static dzien2.StringUtil.containsIgnoreCase;

public class SlowkaKluczowe {

    public static void main(String[] args) {
        // static - oznacza, że obiekt istnieje zawsze, od początku urchomienia programu, zawsze w jednej kopii
        // statyczne mogą być zmienne, stałe oraz metody
        // najczęściej statycznie oznaczamy helpery
        // czyli metody które nie są związane z obiektem biznesowym, tylko technicznym
        // przy zmiennych zazwyczaj występuje też słówko final, które oznacza, że jest to stała, nie da sie zmienić raz ustawionej wartości

        System.out.println(Faktura.VAT);
        System.out.println(Math.PI);
        System.out.println(Faktura.calaculateBrutto(100));

        String str1 = "ala ma kota";
        String str2 = "Ala";

        StringUtil.containsIgnoreCase(str1, str2);

//        StringUtil stringUtil = new StringUtil(); // nie powinniśmy tworzyć obiektów takich klas
//        stringUtil.containsIgnoreCase(str1, str2); // błąd kompilacji, konstruktor prywatny

    }
}

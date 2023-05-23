package dzien2;

import dzien2.model.Kolo;
import dzien2.model.Kwadrat;
import dzien2.model.Prostokat;

public class ObslugaFigurGeometrycznych {

    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat();
        prostokat.setA(4);
        prostokat.setB(5);
        System.out.println(prostokat.getA());
        System.out.println(prostokat.getB());

        Prostokat prostokat2 = new Prostokat();
        prostokat2.setA(7);
        prostokat2.setB(9);
        System.out.println(prostokat2.getA());
        System.out.println(prostokat2.getB());
        System.out.println(prostokat.getA() < prostokat2.getA());

        System.out.println(prostokat.obliczObwod());
        System.out.println(prostokat2.obliczObwod());

        Prostokat prostokat3 = new Prostokat();
        int i = prostokat3.obliczObwod();
        System.out.println(i);

        Kolo kolo1 = new Kolo(5);
        kolo1.obliczObwod();

        Kwadrat kw1 = new Kwadrat();
        Kwadrat kw2 = new Kwadrat(5);

//        System.gc(); // garbage collector - usuwanie obiektów
//        // ta metoda tylko sugeruje użycie garbage collectora

        Kwadrat kw3 = new Kwadrat();
        Kwadrat kw4 = new Kwadrat();
        if(kw3==kw4) {
            System.out.println("Te same kwadraty?");
        }

        String str1 = "Ala ma kota";
        String str2 = "Ala ma" + " kota";
        String str3 = str2 + "";
        if(str1==str3) {
            System.out.println("Te same napisy?");
        }
        if(str1.equals(str3)) {
            System.out.println("Takie same napisy");
        }

        if(kw3.equals(kw4)) {
            System.out.println("Takie same kwadraty?");
        }

        System.out.println(kw3.equals(prostokat3));
        System.out.println(kw3==kw3);

        Kolo kolo2 = new Kolo(2);
        Kolo kolo3 = new Kolo(3);

        System.out.println(kolo2.hashCode());
        System.out.println(kolo3.hashCode());


//        int numer = 7;
//        String text = "new text";
//        Double d = 0.0;
//        String[] arr = new String[]{};
    }
}

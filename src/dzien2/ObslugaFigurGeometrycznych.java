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



//        int numer = 7;
//        String text = "new text";
//        Double d = 0.0;
//        String[] arr = new String[]{};
    }
}

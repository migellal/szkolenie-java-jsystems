package dzien3.firma;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Firma {

    public static void main(String[] args) {

        MechanicznyJez mechanicznyJez = new MechanicznyJez(1, "Jeż Wojtek");
        MechanicznyJez mechanicznyJez2 = new MechanicznyJez(2, "Jeż Krystian");

//        Produkt produkt = new Produkt(-1, "produkt"); to się nie kompiluje, klasa Produkt jest astrakcyjna
//        Zabawka zabawka = new Zabawka(-2, "jakaś zabawka"); błąd kompilacji, Zabawka jest abstract

        mechanicznyJez.bawicSie();
        System.out.println(mechanicznyJez.getNazwa());

        Spozywcze pizza = new Spozywcze("Pizza");

        pizza.pakowanie();
        pizza.testowanie();

        Zabawka bananSamochod = new Zabawka(123, "Banan Samochów") {
            @Override
            public void testowanie() {
                System.out.println("Sprawdzam, czy wszystkie koła się kręcą");
            }
        };

        mechanicznyJez.wygladzKolce();

        przetestujeZabawki(mechanicznyJez, mechanicznyJez2,
                new LalkaTosia(252, "Zosia"), bananSamochod);
    }

    public static void przetestujeZabawki(Zabawka... zabawki) {
        for(Zabawka z : zabawki) {
            System.out.println(z.getNumerProduktu() + " " + z.getNazwa());
            z.testowanie();
            System.out.println(" -------------------------- ");
        }
    }
}

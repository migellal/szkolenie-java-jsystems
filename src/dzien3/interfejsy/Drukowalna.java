package dzien3.interfejsy;

import java.io.Serializable;

public interface Drukowalna extends Serializable { // interfejsy kończyły się na ...able // interfejsy mogą być rozszerzane
    // przez inne interfejsy

    void drukuj();
//
//    void potrzasnijDrukarka();

    default void czyscDrukarke() {
        System.out.println("Czyszcze drukarke");
    }

    default void dolozPapieru() {
        System.out.println("Dokładam papieru");
    }
}

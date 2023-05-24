package dzien3.interfejsy;

import java.io.Serializable;

public class StronaWWW implements Drukowalna, Serializable {

    @Override
    public void drukuj() {
        System.out.println("Drukuję stronę WWW");
    }

    @Override
    public void dolozPapieru() {
        System.out.println("Doloz blyszczacego, kolorowego papieru");
    }
}

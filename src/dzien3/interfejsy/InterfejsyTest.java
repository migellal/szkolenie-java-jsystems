package dzien3.interfejsy;

import dzien3.ksiegowosc.Faktura;
import dzien3.ksiegowosc.Paragon;

public class InterfejsyTest {

    public static void main(String[] args) {
        StronaWWW s = new StronaWWW();
        Faktura f = new Faktura(23);
        Paragon p = new Paragon(33);
        druk(s, f, p);
    }

    public static void druk(Drukowalna... drukowalne) {
        for (Drukowalna d : drukowalne) {
            d.drukuj();
            d.czyscDrukarke();
            d.dolozPapieru();
        }
    }
}

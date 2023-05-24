package dzien3.wyjatki;

public class KlasaZwracaDane {

    public String dane() {
        try {
            System.out.println("Super ważne operacje!!!");
            return "hurra!";
        } catch (Exception e) {
            System.err.println(e);
            return "nie hurra!";
        } finally {
            System.out.println("finally z klasy dane");
        }
    }
}

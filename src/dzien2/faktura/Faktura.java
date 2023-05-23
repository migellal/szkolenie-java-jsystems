package dzien2.faktura;

public class Faktura {

    private double kwota;
    private String towar;
    private Petent platnik;
    private Petent wystawca;

    public Faktura(double kwota, String towar, Petent platnik, Petent wystawca) {
        this.kwota = kwota;
        this.towar = towar;
        this.platnik = platnik;
        this.wystawca = wystawca;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTowar() {
        return towar;
    }

    public void setTowar(String towar) {
        this.towar = towar;
    }

    public Petent getPlatnik() {
        return platnik;
    }

    public void setPlatnik(Petent platnik) {
        this.platnik = platnik;
    }

    public Petent getWystawca() {
        return wystawca;
    }

    public void setWystawca(Petent wystawca) {
        this.wystawca = wystawca;
    }


    public void drukuj() {
        String print = "Towar -> " + towar + "\nKwota -> " + kwota + "\n" +
                "płatnik -> " + platnik.getDane() + "\n" +
                "wystawca -> " + wystawca.getDane() + "\n";
        System.out.println(print);
    }

    @Override
    public String toString() {
        return "Faktura{" +
                "kwota=" + kwota +
                ", towar='" + towar + '\'' +
                ", platnik=" + platnik +
                ", wystawca=" + wystawca +
                '}';
    }
}

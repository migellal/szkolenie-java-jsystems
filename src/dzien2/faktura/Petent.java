package dzien2.faktura;

public class Petent {
    private final String imie;
    private final String nazwisko;
    private String nazwaFirmy;
    private final long nip;

    public Petent(String imie, String nazwisko, long nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nip = nip;
        this.nazwaFirmy = imie + " " + nazwisko;
    }

    public Petent(String imie, String nazwisko, String nazwaFirmy, long nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaFirmy = nazwaFirmy;
        this.nip = nip;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public long getNip() {
        return nip;
    }

    public String getDane() {
        return "Nazwa firmy: " + nazwaFirmy + " | imię: " + imie + " | nazwisko: " + nazwisko + " | nip: " + nip;
    }

    @Override
    public String toString() {
        return "Petent{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nazwaFirmy='" + nazwaFirmy + '\'' +
                ", nip=" + nip +
                '}';
    }
}

package dzien3.urzad;

public class Urzednik extends Osoba {
    private GodzinyPracy godzinyPracy;

    public Urzednik(String imie, String nazwisko, long pesel) {
        super(imie, nazwisko, pesel);
        this.godzinyPracy = new GodzinyPracy();
        this.godzinyPracy.setPoczatekPracy("8:00");
        this.godzinyPracy.setKoniecPracy("16:00");
    }

    public Urzednik(String imie, String nazwisko, long pesel, GodzinyPracy godzinyPracy) {
        super(imie, nazwisko, pesel); // tutaj można użyć słówka this, aby wywołać kolejny konstruktor
        this.godzinyPracy = godzinyPracy;
    }

    public Urzednik(String imie, String nazwisko, long pesel, String poczatekPracy, String koniecPracy) {
        super(imie, nazwisko, pesel); // tutaj można użyć słówka this, aby wywołać kolejny konstruktor
        this.godzinyPracy = new GodzinyPracy();
        this.godzinyPracy.setPoczatekPracy(poczatekPracy);
        this.godzinyPracy.setKoniecPracy(koniecPracy);
    }

    public GodzinyPracy getGodzinyPracy() {
        return godzinyPracy;
    }

    public void setGodzinyPracy(GodzinyPracy godzinyPracy) {
        this.godzinyPracy = godzinyPracy;
    }

    @Override
    public String toString() {
        return "Urzednik{" +
                "godzinyPracy=" + godzinyPracy +
                " Osoba{" + super.toString() +
                "}";
    }
}

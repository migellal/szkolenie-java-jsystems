package dzien3.urzad;

public class GodzinyPracy {

    private String poczatekPracy; // lewy alt + lewy shift ->
    // więcej kursorów
    private String koniecPracy;

    public String getPoczatekPracy() {
        return poczatekPracy;
    }

    public void setPoczatekPracy(String poczatekPracy) {
        this.poczatekPracy = poczatekPracy;
    }

    public String getKoniecPracy() {
        return koniecPracy;
    }

    public void setKoniecPracy(String koniecPracy) {
        this.koniecPracy = koniecPracy;
    }

    @Override
    public String toString() {
        return "GodzinyPracy{" +
                "poczatekPracy='" + poczatekPracy + '\'' +
                ", koniecPracy='" + koniecPracy + '\'' +
                '}';
    }
}

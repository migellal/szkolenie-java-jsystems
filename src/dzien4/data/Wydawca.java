package dzien4.data;

import java.util.Objects;

public class Wydawca {
    private final String nazwaWydawcy;
    private final int rokPowstaniaWydawnictwa;
    private final boolean wydajeTylkoGryPlanszowe;
    public Wydawca(String nazwaWydawcy, int rokPowstaniaWydawnictwa, boolean wydajeTylkoGryPlanszowe) {
        this.nazwaWydawcy = nazwaWydawcy;
        this.rokPowstaniaWydawnictwa = rokPowstaniaWydawnictwa;
        this.wydajeTylkoGryPlanszowe = wydajeTylkoGryPlanszowe;
    }

    public String getNazwaWydawcy() {
        return nazwaWydawcy;
    }

    public int getRokPowstaniaWydawnictwa() {
        return rokPowstaniaWydawnictwa;
    }

    public boolean isWydajeTylkoGryPlanszowe() {
        return wydajeTylkoGryPlanszowe;
    }

    @Override
    public String toString() {
        return "Wydawca{" +
                "nazwaWydawcy='" + nazwaWydawcy + '\'' +
                ", rokPowstaniaWydawnictwa=" + rokPowstaniaWydawnictwa +
                ", wydajeTylkoGryPlanszowe=" + wydajeTylkoGryPlanszowe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wydawca wydawca = (Wydawca) o;

        if (rokPowstaniaWydawnictwa != wydawca.rokPowstaniaWydawnictwa) return false;
        if (wydajeTylkoGryPlanszowe != wydawca.wydajeTylkoGryPlanszowe) return false;
        return Objects.equals(nazwaWydawcy, wydawca.nazwaWydawcy);
    }

    @Override
    public int hashCode() {
        int result = nazwaWydawcy != null ? nazwaWydawcy.hashCode() : 0;
        result = 31 * result + rokPowstaniaWydawnictwa;
        result = 31 * result + (wydajeTylkoGryPlanszowe ? 1 : 0);
        return result;
    }
}

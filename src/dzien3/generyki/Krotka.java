package dzien3.generyki;

public class Krotka<L, R> { // touple, ta implemntacja jest dostępna w
    // większości bibliotek util
    // R extends Faktura -> typ może rozszerzać jakiś typ, czyli ograniczyć nam możliwość wyboru
    private final L lewy;
    private final R prawy;

    public Krotka(L lewy, R prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public L getKlucz() {
        return lewy;
    }

    public R getWartosc() {
        return prawy;
    }

    public L getLewy() {
        return lewy;
    }

    public R getPrawy() {
        return prawy;
    }
}

package dzien3.ksiegowosc;

public class Faktura extends DokumentKsiegowy implements Comparable<Faktura> {
    public Faktura(double cena) {
        super(TypDokumentu.FAKTURA, cena);
    }

    @Override
    public void policz() {
        System.out.println("Policzona cena: " + policzonaCena());
    }

    @Override
    public double policzonaCena() {
        return getCena() + getCena() * 0.23;
    }

    @Override
    public int compareTo(Faktura o) {
        int result = 0;
        if (getCena() > o.getCena()) {
            result = 1;
        } else if (getCena() < o.getCena()) {
            result = -1;
        }
        return result;
        // a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
    }
}

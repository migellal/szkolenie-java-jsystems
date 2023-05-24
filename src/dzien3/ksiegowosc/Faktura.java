package dzien3.ksiegowosc;

public class Faktura extends DokumentKsiegowy{
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
}

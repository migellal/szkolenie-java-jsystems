package dzien3.ksiegowosc;

public class Paragon extends DokumentKsiegowy{
    public Paragon(double cena) {
        super(TypDokumentu.PARAGON, cena);
    }

    @Override
    public void policz() {
        System.out.println("Policzona cena: " + policzonaCena());
    }

    @Override
    public double policzonaCena() {
        return getCena();
    }
}

package dzien3.ksiegowosc;

public abstract class DokumentKsiegowy {

    private TypDokumentu typ;
    private double cena;

    public DokumentKsiegowy(TypDokumentu typ, double cena) {
        this.typ = typ;
        this.cena = cena;
    }

    public abstract void policz();

    public abstract double policzonaCena();

    public final void drukuj() {
        System.out.println("Typ dokumentu: " + typ + " cena: " + cena + " policzona cena: " + policzonaCena());
    }

    public TypDokumentu getTyp() {
        return typ;
    }

    public void setTyp(TypDokumentu typ) {
        this.typ = typ;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

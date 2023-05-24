package dzien3.ksiegowosc;

import dzien3.interfejsy.Drukowalna;

public abstract class DokumentKsiegowy implements Drukowalna {

    private TypDokumentu typ;
    private double cena;

    public DokumentKsiegowy(TypDokumentu typ, double cena) {
        this.typ = typ;
        this.cena = cena;
    }

    public abstract void policz();

    public abstract double policzonaCena();

    @Override
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

    @Override
    public String toString() {
        return "DokumentKsiegowy{" +
                "typ=" + typ +
                ", cena=" + cena +
                '}';
    }
}

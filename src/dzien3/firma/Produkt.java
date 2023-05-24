package dzien3.firma;

public abstract class Produkt {
    private int numerProduktu;
    private String nazwa;

    public Produkt(int numerProduktu, String nazwa) {
        this.numerProduktu = numerProduktu;
        this.nazwa = nazwa;
    }

    public int getNumerProduktu() {
        return numerProduktu;
    }

    public void setNumerProduktu(int numerProduktu) {
        this.numerProduktu = numerProduktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public final void pakowanie() {
        System.out.println("Pakuję: " + nazwa);
    }

    public abstract void testowanie();
}

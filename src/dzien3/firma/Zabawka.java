package dzien3.firma;

abstract class Zabawka extends Produkt {
    public Zabawka(int numerProduktu, String nazwa) {
        super(numerProduktu, nazwa);
    }

    public void bawicSie() {
        System.out.println("Bawie się: " + getNazwa());
    }

    @Override
    public abstract void testowanie();

    //    @Override
//    public void pakowanie() { // błąd kompilacji, ta metoda jest final
//        System.out.println("Pakuję w ozdobny papier");
//    }
}

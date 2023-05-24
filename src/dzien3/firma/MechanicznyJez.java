package dzien3.firma;

public final class MechanicznyJez extends Zabawka { // ten final nie pozwoli na dalsze dziedziczenie z tej klasy
    public MechanicznyJez(int numerProduktu, String nazwa) {
        super(numerProduktu, nazwa);
    }

    @Override
    public void testowanie() {
        System.out.println("Sprawdzam, czy kolce nie są zbyt ostre dla dzieci");
    }

    public void wygladzKolce() {
        System.out.println("Gładzę kolce");
    }
}

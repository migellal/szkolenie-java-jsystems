package dzien3.firma;

public class LalkaTosia extends Zabawka{
    public LalkaTosia(int numerProduktu, String nazwa) {
        super(numerProduktu, nazwa);
    }

    @Override
    public void testowanie() {
        System.out.println("Sprawdzam, czy pudełko nie zawiera niebezpiecznych przedmiotów");
    }
}

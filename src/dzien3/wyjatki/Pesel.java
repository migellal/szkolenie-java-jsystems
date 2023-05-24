package dzien3.wyjatki;

public class Pesel {

    private long pesel;

    public Pesel(long pesel) throws PeselException {
        if(pesel>10000000L) {
            this.pesel = pesel;
        } else {
            throw new PeselException();
        }
    }

    public long getPesel() {
        return pesel;
    }
}

package dzien3.generyki;

public class Pudelko<T> {

    private T zawartoscPudelka;

    public T wezZPudelka() {
        return zawartoscPudelka;
    }

    public void wrzucDoPudelka(T zawartoscPudelka) {
        this.zawartoscPudelka = zawartoscPudelka;
    }
}

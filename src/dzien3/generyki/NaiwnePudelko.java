package dzien3.generyki;

public class NaiwnePudelko { // implementacja sprzed 20 paru lat, przed czasami generyków

    private Object zawartoscPudelka;

    public Object wezZPudelka() {
        return zawartoscPudelka;
    }

    public void wrzucDoPudelka(Object zawartoscPudelka) {
        this.zawartoscPudelka = zawartoscPudelka;
    }
}

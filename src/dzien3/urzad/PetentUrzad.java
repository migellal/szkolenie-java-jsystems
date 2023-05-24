package dzien3.urzad;

public class PetentUrzad extends Osoba {
    private String sprawa;

    public PetentUrzad(String imie, String nazwisko, long pesel, String sprawa) {
        super(imie, nazwisko, pesel);
        this.sprawa = sprawa;
    }

    public String getSprawa() {
        return sprawa;
    }

    public void setSprawa(String sprawa) {
        this.sprawa = sprawa;
    }
}

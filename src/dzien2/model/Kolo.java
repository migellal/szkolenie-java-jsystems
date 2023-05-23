package dzien2.model;

public class Kolo {

    private Integer r;

    public Kolo(Integer r) { // konstruktor jednoparametrowy, wymusza podanie parametru
        this.r = r;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public double obliczObwod() {
        return 2 * Math.PI * r;
    }
}

package dzien2.model;

public class Prostokat {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    // alt + insert -> generowanie kodu, getterów i setterów
    public int getB() {
        return b;
    }

    public int obliczObwod() {
        return 2 * a + 2 * b;
    }
}

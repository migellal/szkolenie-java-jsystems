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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prostokat prostokat = (Prostokat) o;

        if (a != prostokat.a) return false;
        return b == prostokat.b;
    }

    @Override
    public int hashCode() { // różny kod - na bank różne obiekty
        int result = a; // ten sam kod, to użyj equals, żeby się upewnić, czy to na pewno to samo
        result = 31 * result + b;
        return result;
    }
}

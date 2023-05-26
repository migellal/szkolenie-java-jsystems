package dzien2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetodyTest {

    List<Metody> listMetod = new ArrayList<>();

    @BeforeEach // Wykonaj treść tej metody przed każdym testem
    void init() {
        listMetod = new ArrayList<>();
        listMetod.add(new Metody());
        listMetod.add(new Metody());
        listMetod.add(new Metody());
        listMetod.add(new Metody());
        listMetod.add(new Metody());
    }
    // @BeforeAll - wykonaj przed wszystkimi testami

    @Test
    void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaLiczDodatnich() {
        assertEquals(2, Metody.mnozonyPrzezDwa(1));
        assertEquals(4, Metody.mnozonyPrzezDwa(2));
        assertEquals(6, Metody.mnozonyPrzezDwa(3));
        assertEquals(8, Metody.mnozonyPrzezDwa(4));
        assertEquals(2000002, Metody.mnozonyPrzezDwa(1000001));
    }

    @Test
    void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaLiczUjemnych() {
        assertEquals(-2, Metody.mnozonyPrzezDwa(-1));
        assertEquals(-4, Metody.mnozonyPrzezDwa(-2));
        assertEquals(-6, Metody.mnozonyPrzezDwa(-3));
        assertEquals(-8, Metody.mnozonyPrzezDwa(-4));
        assertEquals(-2000002, Metody.mnozonyPrzezDwa(-1000001));
    }

    @Test
    void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaZera() {
        assertEquals(0, Metody.mnozonyPrzezDwa(0));
        assertEquals(-0, Metody.mnozonyPrzezDwa(-0));
    }
}

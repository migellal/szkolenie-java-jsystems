package dzien3.urzad;

public class Urzad {

    public static void main(String[] args) {
        Urzednik urzednik = new Urzednik("Stefan", "Kogucik", 123L);
        System.out.println(urzednik);

        PetentUrzad petentUrzad = new PetentUrzad("Wojtek", "Poniedzielski", 234L, "wymiana dowodu");
        System.out.println(petentUrzad);

        GodzinyPracy godzinyPracy = new GodzinyPracy();
        godzinyPracy.setPoczatekPracy("10:00");
        godzinyPracy.setKoniecPracy("18:00");
        Urzednik urzednik2 = new Urzednik("Krystina", "Wąchowski", 456L, godzinyPracy);
        System.out.println(urzednik2);

        Urzednik urzednik3 = new Urzednik("Kajeten", "Burczymucha", 9535L, "11:00", "19:00");
        System.out.println(urzednik3);

//        Osoba osoba = new Osoba("A", "B", -1L);
    }
}

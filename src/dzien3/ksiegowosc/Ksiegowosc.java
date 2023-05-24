package dzien3.ksiegowosc;

import java.util.Scanner;

public class Ksiegowosc {

    public static void main(String[] args) {
        // w ramach zadania stworzyć abstrakcyjna klase DokumentKsiegowy
        // Klasa ta powinna zawierać finalną metodę drukuj dokument
        // Klasa ta powinna zawierać abstrakcyjną metodę policz
        // Kasa ta posiada dwa pola double: cena, String: typDokumentu
        // Z tej klasy mają dziedziczyć dwie klasy: Paragon, oraz Faktura
        // Metoda policz powinna być zaimplementowana jakkolwiek w klasach Faktura
        // oraz Paragon

        Paragon p1 = new Paragon(23);
        Faktura f1 = new Faktura(128);

        p1.drukuj();
        p1.policz();

        f1.drukuj();
        f1.policz();

        Scanner scanner = new Scanner(System.in);
        int opcja = scanner.nextInt();
        Menu menu = Menu.findById(opcja);

        switch (menu) {
            case MENU_GLOWNE -> System.out.println(Menu.MENU_GLOWNE.getLadnaNazwa());
            case USTAWIENIA -> System.out.println("Ustawienia");
            case AUTORZY -> System.out.println("Autorzy");
        }
//        switch (opcja) {
//            case 1 -> System.out.println("Menu Główne");
//            case 2 -> System.out.println("Ustawienia");
//            case 3 -> System.out.println("Autorzy");
//        }

        TypDokumentu typ = TypDokumentu.FAKTURA;

        switch (typ) {
            case FAKTURA -> System.out.println("To jest faktura");
            case PARAGON -> System.out.println("To jest paragon");
        }

        System.out.println(Menu.MENU_GLOWNE.getId());

    }

    enum Menu {
        MENU_GLOWNE(1, "Menu Główne"), USTAWIENIA(2, "Ustawienia"), AUTORZY(3, "Autorzy");

        private final int id;
        private final String ladnaNazwa;

        Menu(int id, String ladnaNazwa) {
            this.id = id;
            this.ladnaNazwa = ladnaNazwa;
        }

        public int getId() {
            return id;
        }

        public String getLadnaNazwa() {
            return ladnaNazwa;
        }

        public static Menu findById(int id) {
            return switch (id) {
                case 1 -> MENU_GLOWNE;
                case 2 -> USTAWIENIA;
                case 3 -> AUTORZY;
                default -> MENU_GLOWNE;
            };
        }
    }
}

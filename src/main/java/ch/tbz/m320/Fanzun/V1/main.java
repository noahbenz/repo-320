package ch.tbz.m320.Fanzun.V1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Medien> medienListe = new ArrayList<>();

        medienListe.add(new DVD("Inception", 2010, 19.99, 148));
        medienListe.add(new CD("Abbey Road", 1969, 14.99, "The Beatles"));
        medienListe.add(new Buch("To Kill a Mockingbird", 1960, 9.99, "9780061120084"));

        medienListe.remove(1);

        for (Medien medium : medienListe) {
            System.out.println(medium.getClass().getSimpleName() + ": " + medium.getTitel() + " - " + medium.getPreis());
        }
        medienListe.forEach(medium -> System.out.println(medium.getPreis()));
    }
}

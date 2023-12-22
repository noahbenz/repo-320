package ch.tbz.m320.benz.v1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medien> medienListe = new ArrayList<>();

        medienListe.add(new DVD("Inception", 2010, 19.99, 148));
        medienListe.add(new CD("Abbey Road", 1969, 14.99, "The Beatles"));
        medienListe.add(new Buch("To Kill a Mockingbird", 1960, 9.99, "9780061120084"));

        for (int i = 0; i < medienListe.size(); i++) {
            Medien medium = medienListe.get(i);
            System.out.println("Preis für " + medium.getTitel() + ": " + medium.getPreis());
        }
    }
}
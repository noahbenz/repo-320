package ch.tbz.m320.Fanzun.V1;

public class Buch extends Medien {
    private String isbn;

    public Buch(String titel, int jahr, double preis, String isbn) {
        super(titel, jahr, preis);
        this.isbn = isbn;
    }
}

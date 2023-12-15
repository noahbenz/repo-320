package ch.tbz.m320.Fanzun.V1;

public class CD extends Medien {
    private String bandName;

    public CD(String titel, int jahr, double preis, String bandName) {
        super(titel, jahr);
        this.bandName = bandName;
    }
}

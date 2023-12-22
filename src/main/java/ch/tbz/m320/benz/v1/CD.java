package ch.tbz.m320.benz.v1;

public class CD extends Medien {
    private String bandName;

    public CD(String titel, int jahr, double preis, String bandName) {
        super(titel, jahr);
        this.bandName = bandName;
    }
}

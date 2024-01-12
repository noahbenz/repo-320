package ch.tbz.m320.Fanzun.V1;

public class Medien {
    private String titel;
    private int jahr;
    private double preis;

    public Medien(String titel, int jahr, double preis) {
        this.titel = titel;
        this.jahr = jahr;
        this.preis = preis;
    }

    public Medien(String titel, int jahr) {
        this.titel = titel;
        this.jahr = jahr;
        this.preis = 20;
    }

    public String getTitel() {
        return titel;
    }

    public double getPreis(){
        return preis;
    }
}


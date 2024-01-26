package ch.tbz.m320.Fanzun.v2;

/**
 * Die Klasse Goalie repräsentiert einen Torhüter im Fußballspiel.
 */
public class Goalie extends Spieler {

    /**
     * Die Körpergröße des Torhüters.
     */
    private double bodySize;

    /**
     * Konstruktor für die Goalie-Klasse. Erzeugt einen neuen Torhüter mit einer
     * bestimmten Körpergröße und einem Namen.
     * @param bodySize Die Körpergröße des Torhüters.
     * @param name Der Name des Torhüters.
     */
    public Goalie(double bodySize, String name) {
        super(name);
        this.bodySize = bodySize;
    }

    /**
     * Diese Methode wird aufgerufen, wenn der Torhüter spielt.
     */
    @Override
    public void spielen() {
        System.out.println(getName() + " pariert den Ball");
    }
}

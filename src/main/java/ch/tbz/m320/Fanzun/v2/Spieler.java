package ch.tbz.m320.Fanzun.v2;

/**
 * Klasse Spieler repräsentiert einen Spieler im Fußballspiel.
 */
public class Spieler {

    /**
     * Name des Spielers.
     */
    private String name;

    /**
     * Konstruktor für die Spieler-Klasse.
     * @param name Der Name des Spielers.
     */
    public Spieler(String name) {
        this.name = name;
    }

    /**
     * Gibt den Namen des Spielers zurück.
     * @return Der Name des Spielers.
     */
    public String getName() {
        return name;
    }

    /**
     * Zeigt den Namen des Spielers an.
     */
    public void zeigeName() {
        System.out.println(name);
    }

    /**
     * Diese Methode wird aufgerufen, wenn der Spieler spielt.
     */
    public void spielen() {
        System.out.println(getName() + " spielt den Ball");
    }
}

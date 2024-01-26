package ch.tbz.m320.benz.v2;

/**
 * Die Klasse Spieler ist die Basisklasse, die alle Spieler in einer Mannschaft repräsentiert.
 * Sie enthält grundlegende Methoden und Eigenschaften, die von allen Spielertypen gemeinsam genutzt werden.
 */
public class Spieler {

    private String name; // Der Name des Spielers.

    /**
     * Konstruktor für die Spieler-Klasse, der den Namen des Spielers übernimmt.
     *
     * @param name Der Name des Spielers.
     */
    public Spieler(String name) {
        this.name = name; // Setzt den Namen des Spielers.
    }

    /**
     * Gibt den Namen des Spielers zurück.
     *
     * @return Der Name des Spielers.
     */
    public String getName() {
        return name;
    }

    /**
     * Zeigt den Namen des Spielers in der Konsole an.
     */
    public void zeigeName() {
        System.out.println(name);
    }

    /**
     * Diese Methode wird aufgerufen, wenn der Spieler am Spiel teilnimmt.
     * Sie gibt aus, dass der Spieler den Ball spielt.
     */
    public void spielen() {
        System.out.println(getName() + " spielt den Ball");
    }
}

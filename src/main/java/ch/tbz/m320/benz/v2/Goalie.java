package ch.tbz.m320.benz.v2;

/**
 * Die Klasse Goalie repräsentiert einen Spieler vom Typ Goalie (Torwart) in einer Mannschaft.
 * Sie erbt von der Klasse Spieler und erweitert deren Funktionalität speziell für Goalies.
 */
public class Goalie extends Spieler {

    private double bodySize; // Die Körpergröße des Goalies.

    /**
     * Konstruktor für die Goalie-Klasse, der die Körpergröße und den Namen des Goalies übernimmt.
     *
     * @param bodySize Die Körpergröße des Goalies.
     * @param name     Der Name des Goalies.
     */
    public Goalie(double bodySize, String name) {
        super(name); // Ruft den Konstruktor der übergeordneten Spieler-Klasse auf und übergibt den Namen.
        this.bodySize = bodySize; // Setzt die Körpergröße des Goalies.
    }

    /**
     * Diese Methode wird überschrieben, um das Verhalten eines Goalies beim Spielen darzustellen.
     * Sie gibt aus, dass der Goalie den Ball pariert.
     */
    @Override
    public void spielen() {
        System.out.println(getName() + " pariert den Ball");

}

package ch.tbz.m320.Fanzun.v2;

/**
 * Klasse Verteidiger zeigt Verteidiger im Fußballspiel. Erbt von Klasse Spieler.
 */
public class Verteidiger extends Spieler {

    /**
     * Konstruktor für die Verteidiger-Klasse.
     * @param name Der Name des Verteidigers.
     */
    public Verteidiger(String name) {
        super(name);
    }

    /**
     * Diese Methode wird aufgerufen, wenn der Verteidiger spielt.
     */
    @Override
    public void spielen() {
        System.out.println(getName() + " verteidigt sein Tor");
    }
}

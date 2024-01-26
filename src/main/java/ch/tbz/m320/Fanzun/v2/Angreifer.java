package ch.tbz.m320.Fanzun.v2;

/**
 * Klasse Angreifer zeigt einen Stürmer im Fußballspiel. Stürmer erbt von Klasse Spieler und hat keine zusätzlichen Attribute.
 */
public class Angreifer extends Spieler {

    /**
     * Erzeugt einen neuen Stürmer mit einem bestimmten Namen.
     * @param name Der Name des Stürmers.
     */
    public Angreifer(String name) {
        super(name);
    }

    /**
     * Diese Methode wird aufgerufen, wenn der Stürmer spielt.
     */
    @Override
    public void spielen() {
        System.out.println(getName() + " ist im Angriff");
    }
}

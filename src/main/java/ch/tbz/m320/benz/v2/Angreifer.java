package ch.tbz.m320.benz.v2;

/**
 * Die Klasse Angreifer repräsentiert einen Spieler vom Typ Angreifer in einer Mannschaft.
 * Sie erbt von der Klasse Spieler und erweitert deren Funktionalität speziell für Angreifer.
 */
public class Angreifer extends Spieler {

    /**
     * Konstruktor für die Angreifer-Klasse, der den Namen des Angreifers übernimmt.
     *
     * @param name Der Name des Angreifers.
     */
    public Angreifer(String name) {
        super(name); // Ruft den Konstruktor der übergeordneten Spieler-Klasse auf.
    }

    /**
     * Diese Methode simuliert das Jogging-Training eines Angreifers.
     * Sie gibt eine entsprechende Meldung aus.
     */
    public void jogTraining() {
        System.out.println("Der Angreifer " + getName() + " befindet sich im Jog-Training");
    }

    /**
     * Diese Methode wird überschrieben, um das Verhalten eines Angreifers beim Spielen darzustellen.
     * Sie gibt aus, dass der Angreifer im Angriff ist.
     */
    @Override
    public void spielen() {
        System.out.println(getName() + " ist im Angriff");
    }
}

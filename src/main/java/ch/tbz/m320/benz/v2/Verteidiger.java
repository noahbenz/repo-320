package ch.tbz.m320.benz.v2;

/**
 * Die Klasse Verteidiger repräsentiert einen Spieler vom Typ Verteidiger in einer Mannschaft.
 * Sie erbt von der Klasse Spieler und erweitert deren Funktionalität speziell für Verteidiger.
 */
public class Verteidiger extends Spieler {

    /**
     * Konstruktor für die Verteidiger-Klasse, der den Namen des Verteidigers übernimmt.
     *
     * @param name Der Name des Verteidigers.
     */
    public Verteidiger(String name) {
        super(name); // Ruft den Konstruktor der übergeordneten Spieler-Klasse auf und übergibt den Namen.
    }

    /**
     * Diese Methode wird überschrieben, um das Verhalten eines Verteidigers beim Spielen darzustellen.
     * Sie gibt aus, dass der Verteidiger sein Tor verteidigt.
     */
    @Override
<<<<<<< HEAD
    public void spielen() {
        System.out.println(getName() + " verteidigt sein Tor");
=======
    public void spielen(){
        System.out.println( getName() +" verteidigt sein Tor");
>>>>>>> ddd45b243cf2353cccffde8101c159d900018034
    }
}

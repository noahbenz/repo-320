package ch.tbz.m320.benz.v2;

import java.util.ArrayList;
import java.util.List;

public class Mannschaft {

    List<Spieler> mannschaft = new ArrayList<>(); // Die Liste der Spieler in der Mannschaft.

    /**
     * Fügt einen Goalie (Torwart) zur Mannschaft hinzu, sofern noch keiner vorhanden ist.
     *
     * @param bodySize Die Körpergröße des Goalies.
     * @param name     Der Name des Goalies.
     */
    public void addGoalie(Double bodySize, String name) {
        if (!hasGoalie()) {
            mannschaft.add(new Goalie(bodySize, name));
            System.out.println("Goalie wurde hinzugefügt");
        } else {
            System.out.println("Es gibt bereits einen Goalie in der Mannschaft.");
        }
    }

    /**
     * Fügt einen Verteidiger zur Mannschaft hinzu.
     *
     * @param name Der Name des Verteidigers.
     */
    public void addVerteidiger(String name) {
        mannschaft.add(new Verteidiger(name));
        System.out.println("Verteidiger wurde hinzugefügt");
    }

    /**
     * Fügt einen Angreifer zur Mannschaft hinzu.
     *
     * @param name Der Name des Angreifers.
     */
    public void addAngreifer(String name) {
        mannschaft.add(new Angreifer(name));
    }

    /**
     * Gibt die Namen aller Spieler in der Mannschaft aus.
     */
    public void ausgeben() {
        for (Spieler spieler : mannschaft) {
            spieler.zeigeName();
        }
    }

    /**
     * Gibt den Spieler an einem bestimmten Index in der Mannschaft zurück.
     *
     * @param index Der Index des gewünschten Spielers.
     * @return Der Spieler an dem angegebenen Index.
     */
    public Spieler getSpieler(int index) {
        return mannschaft.get(index);
    }

    /**
     * Überprüft, ob bereits ein Goalie (Torwart) in der Mannschaft vorhanden ist.
     *
     * @return true, wenn ein Goalie vorhanden ist, andernfalls false.
     */
    public boolean hasGoalie() {
        for (Spieler spieler : mannschaft) {
            if (spieler instanceof Goalie) {
                return true;
            }
        }
        return false;
    }
}
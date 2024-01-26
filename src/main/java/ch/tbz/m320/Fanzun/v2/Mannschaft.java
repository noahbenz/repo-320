package ch.tbz.m320.Fanzun.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Mannschaft zeigt eine Fußballmannschaft mit verschiedenen Spielertypen.
 */
public class Mannschaft {

    /**
     * Liste zur Speicherung der Mannschaftsspieler
     */
    List<Spieler> mannschaft = new ArrayList<>();

    /**
     * Fügt einen Torhüter zur Mannschaft hinzu, falls keiner vorhanden ist.
     * @param bodySize Die Körpergrösse des Torhüters.
     * @param name Der Name des Torhüters.
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
     * @param name Der Name des Verteidigers.
     */
    public void addVerteidiger(String name) {
        mannschaft.add(new Verteidiger(name));
        System.out.println("Verteidiger wurde hinzugefügt");
    }

    /**
     * Fügt einen Angreifer zur Mannschaft hinzu.
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
     * Überprüft, ob die Mannschaft bereits einen Torhüter hat.
     * @return true, wenn ein Torhüter vorhanden ist, sonst false.
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

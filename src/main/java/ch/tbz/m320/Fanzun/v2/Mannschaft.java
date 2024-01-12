package ch.tbz.m320.Fanzun.v2;

import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    List<Spieler> mannschaft = new ArrayList<>();

    public void addGoalie(Double bodySize, String name) {
        if (!hasGoalie()) {
            mannschaft.add(new Goalie(bodySize, name));
            System.out.println("Goalie wurde hinzugefügt");
        } else {
            System.out.println("Es gibt bereits einen Goalie in der Mannschaft.");
        }
    }

    public void addVerteidiger(String name) {
        mannschaft.add(new Verteidiger(name));
        System.out.println("Verteidiger wurde hinzugefügt");
    }

    public void addAngreifer(String name) {
        mannschaft.add(new Angreifer(name));
    }

    public void ausgeben() {
        for (Spieler spieler : mannschaft) {
            spieler.zeigeName();
        }
    }

    public boolean hasGoalie() {
        for (Spieler spieler : mannschaft) {
            if (spieler instanceof Goalie) {
                return true;
            }
        }
        return false;
    }
}

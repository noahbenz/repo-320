package ch.tbz.m320.Fanzun.v2;

import java.util.Scanner;

/**
 * Hauptklasse des Programms, die Benutzeroberfläche für Mannschaftsverwaltung bereitstellt
 */
public class Main {
    /**
     * Hauptmethode des Programms, die den Ablauf der Mannschaftsverwaltung bereitstellt
     * @param args
     */
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("Optionen: ");
            System.out.println("Jemanden hinzufügen (A)");
            System.out.println("Mannschaft ausgeben (M)");
            System.out.println("Spielen (S)");
            System.out.println("Ihre Auswahl: ");

            input = scanner.next();

            switch (input.toUpperCase()) {
                case "M":
                    mannschaft.ausgeben();
                    break;
                case "A":
                    System.out.println("Spieler hinzufügen: ");
                    System.out.println("Angreifer (A), Verteidiger (V), Goalie (G)");
                    input = scanner.next();

                    switch (input.toUpperCase()) {
                        case "A":
                            System.out.println("Geben Sie den Namen des Angreifers ein:");
                            mannschaft.addAngreifer(scanner.next());
                            break;
                        case "V":
                            System.out.println("Geben Sie den Namen des Verteidigers ein:");
                            mannschaft.addVerteidiger(scanner.next());
                            break;
                        case "G":
                            System.out.println("Geben Sie den Namen des Goalie ein:");
                            String name = scanner.next();
                            System.out.println("Geben Sie die Größe des Goalie ein:");
                            Double größe = scanner.nextDouble();
                            mannschaft.addGoalie(größe, name);
                            break;
                        default:
                            System.out.println("Ungültige Eingabe.");
                            break;
                    }
                    break;
                case "S":
                    for (Spieler spieler : mannschaft.mannschaft) {
                        spieler.spielen();
                    }
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
                    break;
            }
        } while (true);
    }
}

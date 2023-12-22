package ch.tbz.m320.benz.v2;

import java.util.Scanner;

public class Main {

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

            if (input.equalsIgnoreCase("M")) {
                mannschaft.ausgeben();
            } else if ("A".equalsIgnoreCase(input)) {
                System.out.println("Spieler hinzufügen: ");
                System.out.println("Angreifer (A), Verteidiger (V), Goalie (G)");
                input = scanner.next();

                if ("A".equalsIgnoreCase(input)) {
                    System.out.println("Geben Sie den Namen des Angreifers ein:");
                    mannschaft.addAngreifer(scanner.next());
                } else if ("V".equalsIgnoreCase(input)) {
                    System.out.println("Geben Sie den Namen des Verteidigers ein:");
                    mannschaft.addVerteidiger(scanner.next());
                } else if ("G".equalsIgnoreCase(input)) {
                    System.out.println("Geben Sie den Namen des Goalie ein:");
                    String name = scanner.next();
                    System.out.println("Geben Sie die Größe des Goalie ein:");
                    Double größe = scanner.nextDouble();
                    mannschaft.addGoalie(größe, name);
                } else {
                    System.out.println("Ungültige Eingabe.");
                }
            } else if ("S".equalsIgnoreCase(input)) {
                for (Spieler spieler : mannschaft.mannschaft) {
                    spieler.spielen();
                }
            } else {
                System.out.println("Ungültige Eingabe.");
            }
        } while (true);
    }
}

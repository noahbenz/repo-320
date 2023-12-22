package ch.tbz.m320.Fanzun.inheritance;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Human> humanListe = new ArrayList<>();

        humanListe.add(new Apprentice("IT", "Noah"));
        humanListe.add(new Apprentice("KV", "Jann"));
        humanListe.add(new Apprentice("Lehrer", "Marwin"));

        humanListe.forEach(medium -> System.out.println(medium.getName()));
    }
}

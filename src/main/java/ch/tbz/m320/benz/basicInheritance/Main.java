package ch.tbz.m320.benz.basicInheritance;

public class Main {

    public static void main(String[] args) {
        Apprentice apprentice = new Apprentice("Programming", "John");

        String apprenticeName = apprentice.getName();
        System.out.println("Apprentice Name: " + apprenticeName);
    }
}

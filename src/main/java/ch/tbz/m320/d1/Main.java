package ch.tbz.m320.d1;

public class Main {
    public static void main(String[] args) {
        Heizung heizung1 = new Heizung(20, 2);
        Heizung heizung2 = new Heizung(18, 10, 25);
        Heizung heizung3 = new Heizung();

        System.out.println("Heizung 1 - Temperatur: " + heizung1.getTemperature());
        System.out.println("Heizung 2 - Temperatur: " + heizung2.getTemperature());
        System.out.println("Heizung 3 - Temperatur: " + heizung3.getTemperature());

        heizung1.increaseTemperature();
        heizung2.decreaseTemperature();
        heizung3.increaseTemperature();

        System.out.println("Heizung 1 - Neue Temperatur: " + heizung1.getTemperature());
        System.out.println("Heizung 2 - Neue Temperatur: " + heizung2.getTemperature());
        System.out.println("Heizung 3 - Neue Temperatur: " + heizung3.getTemperature());
    }
}
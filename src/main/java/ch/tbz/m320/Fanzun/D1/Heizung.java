package ch.tbz.m320.Fanzun.D1;

public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int initialTemperature, int increment) {
        this.temperature = initialTemperature;
        this.increment = increment;
        this.max = 30;
    }

    public Heizung(int initialTemperature, int min, int max) {
        this.temperature = initialTemperature;
        this.min = min;
        this.max = max;
        this.increment = 1;
    }

    public Heizung() {
        this.temperature = 15;
        this.min = 0;
        this.max = 30;
        this.increment = 1;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature + increment <= max) {
            temperature += increment;
        } else {
            System.out.println("Maximale Temperatur erreicht.");
        }
    }

    public void decreaseTemperature() {
        if (temperature - increment >= min) {
            temperature -= increment;
        } else {
            System.out.println("Minimale Temperatur erreicht.");
        }
    }
}

package ch.tbz.m320.Fanzun.inheritance;

public class Apprentice extends Human{

    private String topic;

    public Apprentice(String topic, String name){
        super(name);
        this.topic = topic;
    }
}

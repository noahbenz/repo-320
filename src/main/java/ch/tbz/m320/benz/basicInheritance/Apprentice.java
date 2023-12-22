package ch.tbz.m320.benz.basicInheritance;

public class Apprentice extends Human {

    private String topic;

    public Apprentice(String topic, String name) {
        super(name);
        this.topic = topic;
    }

    public String getName() {
        return super.getName();
    }
}

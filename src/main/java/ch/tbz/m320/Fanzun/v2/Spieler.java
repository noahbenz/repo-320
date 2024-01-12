package ch.tbz.m320.Fanzun.v2;

public class Spieler {

    private String name;

    public Spieler(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void zeigeName(){
        System.out.println(name);
    }

    public void spielen(){
        System.out.println(getName()+" spielt den Ball");
    }
}

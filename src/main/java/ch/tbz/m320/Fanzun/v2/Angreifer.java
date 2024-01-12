package ch.tbz.m320.Fanzun.v2;

public class Angreifer extends Spieler {

    public Angreifer(String name){
        super(name);
    }

    @Override
    public void spielen() {
        System.out.println(getName()+" ist im Angriff");
    }
}

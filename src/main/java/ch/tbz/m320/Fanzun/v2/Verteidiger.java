package ch.tbz.m320.Fanzun.v2;

public class Verteidiger extends Spieler {

    public Verteidiger(String name){
        super(name);
    }

    @Override
    public void spielen(){
        System.out.println( getName() +" verteidigt sein Tor");
    }
}


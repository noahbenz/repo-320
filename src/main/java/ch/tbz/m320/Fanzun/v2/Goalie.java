package ch.tbz.m320.Fanzun.v2;

public class Goalie extends Spieler {
    private double bodySize;

    public Goalie(double bodySize, String name){
        super(name);
        this.bodySize = bodySize;
    }

    @Override
    public void spielen(){
        System.out.println(getName()+" pariert den Ball");
    }
}

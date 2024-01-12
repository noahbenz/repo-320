package ch.tbz.m320.benz.v2;

public class Angreifer extends Spieler{

    public Angreifer(String name){
        super(name);
    }

    public void jogTraining(){
        System.out.println("Der Angreifer befindet sich im Jog-" +
                "Training");
    }

    @Override
    public void spielen() {
        System.out.println(getName()+" ist im Angriff");
    }
}

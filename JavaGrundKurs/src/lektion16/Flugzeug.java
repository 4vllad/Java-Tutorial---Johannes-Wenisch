package lektion16;

public class Flugzeug extends Vogel implements Flugfähig, Betankbar {
    public void fliegen(){
        System.out.println("Ein Flugzeug fliegt.");
    }

    public void tanken(){
        System.out.println("Ein Flugzeug wird betankt.");
    }

}

package lektion18;

public class Fahrrad extends Fahrzeug{
    public Fahrrad(String name) {
        super(name);
    }

    public void fahren() {
        System.out.println("gleitet leise.");
    }
}

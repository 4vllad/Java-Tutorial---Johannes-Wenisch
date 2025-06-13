package lektion18;

public class Auto extends Fahrzeug{
    public Auto(String name){
        super(name);
    }

    public void fahren(){
        System.out.println("brumt");
    }
}

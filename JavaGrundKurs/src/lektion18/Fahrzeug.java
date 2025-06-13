package lektion18;

public abstract class Fahrzeug {
    String name;

    public Fahrzeug(String name) {
        this.name = name;
    }

    public void sagWasDuBißt() {
        System.out.println("Ich heiße " + this.name + " und bin ein " + this.getClass().getSimpleName());
    }

    public abstract void fahren();

    public static void main(String[] args) {
        //Fahrzeug f = new Fahrzeug("Bobby Car");
        Fahrzeug fahrzeugAuto = new Auto("VW Golf");
        Fahrzeug fahrzeugFahrrad = new Fahrrad("Merida Cheetan");
        Auto auto = new Auto("BMW 1er");
        Fahrrad fahrrad = new Fahrrad("Hercules 8");

        fahrzeugAuto.sagWasDuBißt();
        fahrzeugFahrrad.sagWasDuBißt();
        auto.sagWasDuBißt();
        fahrrad.sagWasDuBißt();
        auto.fahren();
        fahrrad.fahren();
    }
}

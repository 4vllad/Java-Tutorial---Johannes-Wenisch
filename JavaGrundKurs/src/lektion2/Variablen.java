package lektion2;

public class Variablen {
    public static void main(String[] args){
        boolean einBoolean = false;
        System.out.println("Der Boolean ist "+ einBoolean);
        int einInt = 10;
        System.out.println("Der Int ist " + einInt);
        double einDouble = 15.5;
        String einString = "Alex";

        System.out.println("Das ist ein Double" + einDouble);
        System.out.println("Das ist ein String " + einString);
        einInt = 15;
        System.out.println("jetzt ist ein Int " + einInt);
        int einZweiterInt = 222222;
        einInt = einZweiterInt;

        System.out.println("Nach der Zuweisung ist ein Int jetzt " + einInt);

        String name = "Alex";
        System.out.println("Hallo " + name);


    }
}

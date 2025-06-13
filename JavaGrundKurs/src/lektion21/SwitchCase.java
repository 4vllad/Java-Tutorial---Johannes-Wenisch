package lektion21;

public class SwitchCase {
    public static void main(String[] args) {
        int iVersion = 0;

        switch (iVersion){
            case 0 : System.out.println("Die kostenlose Programmversion"); break;
            case 1 : System.out.println("Die Premiumversion"); break;
            default : System.out.println("Eine unbekannte Version");
        }

        String sVersion = "premium";

        switch (sVersion){
            case "free" : System.out.println("Die kostenlose Programmversion"); break;
            case "premium" : System.out.println("Die Premiumversion"); break;
            default : System.out.println("Eine unbekannte Version");
        }

        Version eVersion = Version.FREE;

        switch (eVersion){
            case Version.FREE : System.out.println("Die kostenlose Programmversion"); break;
            case Version.PREMIUM: System.out.println("Die Premiumversion");
        }

        String name = "Dude";

        switch (name){
            case "Frau Schmidt" : System.out.println("Die Lehrering"); break;
            case "Lachslav":
            case "Dude":
            case "What":
            case "Dudster": System.out.println("Ein Schüler");
            default : System.out.println("Unbekannt");
        }
    }
}

enum Version {
    FREE, PREMIUM;
}
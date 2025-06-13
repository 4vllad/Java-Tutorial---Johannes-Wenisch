package lektion6;

public class ForSchleife {

    public static void main (String[] args){
        System.out.println("Hallo Lektion 6!");

        double zufallszahl = Math.random();
        int zahl = 0;
        int kopf = 0;
        int gesamt = 10000;
        for (int i=0; i<gesamt; i++){
            zufallszahl = Math.random();
            System.out.println("Durchlauf Nummmer: " + i);
            if (zufallszahl < 0.5){
                System.out.println("Kopf!");
                zahl++;
            }
            else{
                System.out.println("Zahl!");
                kopf++;
            }
        }
        System.out.println(zahl + " " + kopf + " " +gesamt);
        double zahlProzent = (double) zahl / gesamt;
        double kopfProzent = (double) kopf / gesamt;
        System.out.println("Gesamt waren es " + zahl + " mal Zahl und " + kopf + " mal Kopf.");
        System.out.println("Das sind prozentuall " + (zahlProzent*100) + "% Zahl " + (kopfProzent*100) + "% Kopf");
    }

}

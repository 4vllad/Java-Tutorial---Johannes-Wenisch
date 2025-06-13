package lektion3;

public class Arrays {
    public static void main (String[] args){
        String[] teilnehmerNamen = new String[3];
        teilnehmerNamen[0] = "Alex";
        teilnehmerNamen[1] = "Hubert";
        teilnehmerNamen[2] = "Uber";
        //Das führt zu einem Fehler
        //teilnehmerNamen[3] = "Schmidt";

        for (int i = 0; i<3; i++){
            System.out.println("Teilnehmer " + (i+1) + " ist " + teilnehmerNamen[i]);
        }

        String[] schuelerNamen = { "Huber", "Meyer", "Mueller" };
        System.out.println(schuelerNamen[1]);
        System.out.println(schuelerNamen[2]);
        schuelerNamen[1] = schuelerNamen[2];
        System.out.println(schuelerNamen[1]);

        int[] meineZahlen = new int[3];

        meineZahlen[0] = 1;
        meineZahlen[1] = 2;
        meineZahlen[2] = 3;

        int[] meineLieblingszahlen = { 5, 23, 2};

        meineLieblingszahlen[0] = meineLieblingszahlen[2];

        System.out.println(meineLieblingszahlen[0]);
    }
}

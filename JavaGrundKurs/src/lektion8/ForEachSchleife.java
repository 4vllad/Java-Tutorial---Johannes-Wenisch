package lektion8;

public class ForEachSchleife {
    public static void main (String[] args){
        System.out.println("Hallo Lektion 8!");
        int[] meineZahlen = { 0, 1, 2, 3, 5 };
        System.out.println("Die Länge des Arrays ist " + meineZahlen.length);

        for ( int i = 0; i < meineZahlen.length; i++){
            int meineZahl = meineZahlen[i];
            System.out.println(meineZahl);
        }

        String[] meineWörter = {"Hallo", "Welt", "von", "Java"};
        for (int i = 0; i < meineWörter.length; i++){
            String meinWort = meineWörter[i];
            System.out.println(meinWort);
        }

        for (int meineZahl : meineZahlen) {
            System.out.println(meineZahl);
        }


        for (String meinWort : meineWörter){
            System.out.println(meinWort);
        }
    }
}

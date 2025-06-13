package lektion7;

public class WhileSchleife {
    public static void main (String[] args){
        System.out.println("Hallo Lektion 7!");
        int wiederholungen = 10;
        int zähler = 0;
        while(zähler < wiederholungen){
            System.out.println(zähler);
            zähler++;
        }
        System.out.println("Fertig");

        for(int i = 0; i < wiederholungen; i++){
            System.out.println(i);
        }

        boolean sonneScheint = true;
        int wieOft = 0;
        while(sonneScheint) {
            wieOft++;
            System.out.println("Rasen mähen! " + wieOft );
            sonneScheint = Math.random() < 0.95;

        }
    }
}

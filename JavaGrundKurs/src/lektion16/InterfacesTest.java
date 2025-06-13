package lektion16;

public class InterfacesTest {
    public static void main(String[] args) {
        Vogel v1 = new Vogel();
        Flugzeug f1 = new Flugzeug();
        Auto a1 = new Auto();

        v1.fliegen();
        f1.fliegen();
        f1.tanken();
        a1.tanken();

        Flugfähig flieger1 = new Vogel();
        Flugfähig flieger2 = new Flugzeug();
        Betankbar spritfresser1 = new Flugzeug();
        Betankbar spritfresser2 = new Auto();

        flieger1.fliegen();
        flieger2.fliegen();
        spritfresser1.tanken();
        spritfresser2.tanken();
        System.out.println(" ---- ");
        Betankbar[] alleSpritfresser = {new Flugzeug(), new Auto()};
        for (Betankbar spritfresser : alleSpritfresser){
            spritfresser.tanken();
        }
    }
}

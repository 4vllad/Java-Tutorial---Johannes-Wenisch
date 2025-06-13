package lektion4;

public class Operatoren {
    public static void  main (String[] args) {
        System.out.println("Hallo Lektion 4!");
        int addition = 1+1;
        int subtraktion = 4-addition;
        int multiplikation = 3*subtraktion;
        int division = 20/multiplikation;
        int modulo = 23%division;

        System.out.println("Addition: " + addition + " Subtraktion: " + subtraktion +
                " Multiplikation: " + multiplikation + " Division:  " + division + " Modulo: " + modulo);

        boolean stimmts = 1 < 2;
        stimmts = 1 <= 2;
        stimmts = 1 > 2;
        stimmts = 1 >= 2;
        stimmts = 1 == 2;
        stimmts = 1 != 2;

        boolean esIstSonntag = false;
        boolean dieSonnescheint = true;
        boolean esIstSonntagUndDieSonneScheint = esIstSonntag && dieSonnescheint;
        boolean esIstSonntagOderDieSonneScheint = esIstSonntag || dieSonnescheint;
        boolean esIstEntwederSonntagOderDieSonneScheint = esIstSonntag ^ dieSonnescheint;

        System.out.println(esIstSonntagUndDieSonneScheint);
        System.out.println(esIstSonntagOderDieSonneScheint);
        System.out.println(esIstEntwederSonntagOderDieSonneScheint);

    }
}

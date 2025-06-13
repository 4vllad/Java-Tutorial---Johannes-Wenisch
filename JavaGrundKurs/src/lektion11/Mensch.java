package lektion11;

public class Mensch {
    String name;
    int alter;
    int kalorienvorrat;

    Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.kalorienvorrat = 1000;
    }

    Mensch(String name){
        this.name = name;
        this.alter = 0;
        this.kalorienvorrat = 1000;
    }

    Mensch(){
        this.name = "noch ohne Name";
        this.alter = 0;
        this.kalorienvorrat = 1000;
    }

    void stellDichVor() {
        System.out.println("Hallo ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    void stellDichVor(String nameDesGegenüber){
        System.out.println("Hallo " + nameDesGegenüber + " ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    void stellDichVor(Mensch gegenüber){
        System.out.println("Hallo " + gegenüber.name + " ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    String getName(){
        return this.name;
    }

    int getAlter() {
        return this.alter;
    }

    void iss(Essen essen) {
        System.out.println(this.name + " isst " + essen.name);
        kalorienvorrat = this.kalorienvorrat + essen.kalorien;
    }


    public static void main(String[] args) {
        Mensch m1 = new Mensch("Johannes", 28);
        m1.stellDichVor();
        m1.stellDichVor("Christian");
        String nameVonM1 = m1.getName();
        System.out.println(nameVonM1);
        int alterVonM1 = m1.getAlter();
        System.out.println(alterVonM1);

        Mensch m2 = new Mensch("Julia", 46);
        m2.stellDichVor();
        m2.stellDichVor(m1);

        //Mensch neugeborenes = new Mensch ("Gustav");
        //neugeborenes.stellDichVor();
        //Mensch unbenantes = new Mensch();
        //unbenantes.stellDichVor();

        Essen kuchen = new Essen();
        kuchen.name = "Kuchen";
        kuchen.kalorien = 800;

        m2.iss(kuchen);
        System.out.println(m2.kalorienvorrat);
    }
}

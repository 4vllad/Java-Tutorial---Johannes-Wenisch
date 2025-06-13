package lektion13.paket1;

public class Mensch {
    private String name;
    private int alter;
    private int kalorienvorrat;

    public Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.kalorienvorrat = 1100;
    }

    public Mensch(String name){
        this(name, 0);
    }

   public Mensch(){
        this("noch ohne Name");
    }

    public void stellDichVor() {
        System.out.println("Hallo ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    public void stellDichVor(String nameDesGegenüber){
        System.out.println("Hallo " + nameDesGegenüber + " ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    public void stellDichVor(Mensch gegenüber){
        System.out.println("Hallo " + gegenüber.name + " ich bin " + this.name + " und " + this.alter + " Jahre alt.");
    }

    public String getName(){
        return this.name;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter ) {
        if(alter > 0) this.alter = alter;
    }

    void iss(lektion13.paket1.Essen essen) {
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

        Mensch neugeborenes = new Mensch ("Gustav");
        neugeborenes.stellDichVor();
        Mensch unbenantes = new Mensch();
        unbenantes.stellDichVor();

        lektion13.paket1.Essen kuchen = new lektion13.paket1.Essen();
        kuchen.name = "Kuchen";
        kuchen.kalorien = 800;

        m2.iss(kuchen);
        System.out.println(m2.kalorienvorrat);

        System.out.println(unbenantes.kalorienvorrat);


    }
}

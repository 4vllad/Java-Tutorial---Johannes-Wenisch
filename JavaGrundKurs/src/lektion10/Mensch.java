package lektion10;

public class Mensch {
    String name;
    int alter;

    Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    Mensch(int alter, String name){

    }

    Mensch(String name){
        this.name = name;
        this.alter = 0;
    }

    Mensch(){
        this.name = "noch ohne Name";
        this.alter = 0;
    }

    void stellDichVor() {
        System.out.println("Hallo ich bin " + this.name + " und " + this.alter + " Jahre alt.");

    }

    public static void main(String[] args) {
        Mensch m1 = new Mensch("Johannes", 28);
        m1.stellDichVor();

        Mensch m2 = new Mensch("Julia", 46);
        m2.stellDichVor();

        Mensch neugeborenes = new Mensch ("Gustav");
        neugeborenes.stellDichVor();

        Mensch unbenantes = new Mensch();
        unbenantes.stellDichVor();
    }
}

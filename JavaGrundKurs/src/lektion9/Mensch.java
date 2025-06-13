package lektion9;

public class Mensch {
    String name;
    int alter;

    Mensch() {
        this.name = "Mensch";
        this.alter = 0;
    }

    void stellDichVor() {
        System.out.println("Hallo ich bin der " + this.name + " und " + this.alter + " Jahre alt.");

    }

    public static void main(String[] args) {
        Mensch m1 = new Mensch();
        m1.stellDichVor();
        m1.name = "Johannes";
        m1.alter = 29;
        m1.stellDichVor();

        Mensch m2 = new Mensch();
        m2.name = "Holga";
        m2.alter = 50;
        m2.stellDichVor();
    }
}

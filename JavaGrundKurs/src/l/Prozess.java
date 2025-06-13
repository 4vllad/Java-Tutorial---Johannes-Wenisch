package l;

public class Prozess extends Monster{
    Object o1;
    Object o2;

    Prozess(String name, int health, int power){
        super(name, health, power);
    }
    /*s
    public void sim(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;

        for(int i = 1; i < 11; i++){
            o2.setHealth(o2.getHealth() - o1.getPower());
            o1.setHealth(o1.getHealth() - o2.getPower());
            System.out.print("Runde: " + i + " ");
            System.out.print("Monster: ♡" + o2.getHealth() + " ");
            System.out.print("Hero: ♡" + o1.getHealth());
            System.out.println(" ");
            if (o2.getHealth() < 0){
                System.out.println("Hero " + o1.getName() +" won with " + o1.getHealth() + " Life left");
                break;
            }
            if (o1.getHealth() < 0){
                System.out.println("Monster won with " + o2.getHealth() + " Life left");
                break;
            }
        }
    }
    /*
    public void sim(Object o1, Object o2){
        for(int i = 1; i < 11; i++){
            m2.setHealth(m2.getHealth() - h1.getPower());
            h1.setHealth(h1.getHealth() - m2.getPower());
            System.out.print("Runde: " + i + " ");
            System.out.print("Monster: ♡" + m2.getHealth() + " ");
            System.out.print("Hero: ♡" + h1.getHealth());
            System.out.println(" ");
            if (m2.getHealth() < 0){
                System.out.println("Hero " + h1.getName() +" won with " + h1.getHealth() + " Life left");
                break;
            }
            if (h1.getHealth() < 0){
                System.out.println("Monster won with " + m2.getHealth() + " Life left");
                break;
            }
        }
    } */
}

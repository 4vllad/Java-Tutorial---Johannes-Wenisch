package l;

public class Test3 {
    public static void main(String[] args) {

        //TESTING
        System.out.println("Hello Testing Monster! ");
        Monster m1 = new Monster("pixel");
        System.out.println(m1.getName());
        Monster m2 = new Monster("cell", 100, 10);
        m2.setHealth(50);
        System.out.println("Ich bin " + m2.getName() + " und habe " + m2.getHealth() + " Leben und " + m2.getPower() + " Stärke");
        m2.info();
        Hero h1 = new Hero("Brad", 200, 20);
        h1.info();
        //TESTING END

        System.out.println("-------------START---------------- ");
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
        System.out.println("-------------END----------------");


    }
}

package lektion20;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 10) continue;
            System.out.println(i);
        }
        for (int i = 0; i < 20; i++) {
            if (i == 10) break;
            System.out.println(i);
        }
        System.out.println("----------------------");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}

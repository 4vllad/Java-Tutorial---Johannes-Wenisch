package lektion5;

public class Verzweigungen {
    public static void main (String[] args){
        System.out.println("Hallo Lektion 5!");
        int alter = 16;

        if(alter >= 18) {
            System.out.println("Person ist volljährig");
        }
        else {
            System.out.println("Person ist NICHT volljährig");
        }

        if (alter >= 18){
            System.out.println("Person ist geschäftsfähig");
        }
        else if (alter >= 7) {
            System.out.println("Person ist beschränkt geschäftsfähig");
        }
        else {
            System.out.println("Person ist geschäftsunfähig");
        }
    }
}

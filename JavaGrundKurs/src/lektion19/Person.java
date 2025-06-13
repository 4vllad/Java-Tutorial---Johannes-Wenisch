package lektion19;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Person {
    int alter;

    public void setAlter(int neuesAlter) {
        if (neuesAlter >= 0) {
            this.alter = neuesAlter;
        }
        else {
            //System.out.println("Alter unter 0!");
            throw new IllegalArgumentException("Alter unter 0!");
        }



    }

    public static void main(String[] args) throws Exception {
        // int einsDurchNull = 1 / 0;
        try {
            FileReader fileReader = new FileReader("exestiert.nicht");
        }
        catch(FileNotFoundException fnfex) {
            System.out.println("FNFEX: " + fnfex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("allgemeine Exception: " + ex.getMessage());
        }

        Person p1 = new Person();
        //try{
            p1.setAlter(-5);
        //}
        //catch (Exception ex){
        //    System.out.println(ex.getMessage());
        //}


        System.out.println("Ende des Programms");
    }
}

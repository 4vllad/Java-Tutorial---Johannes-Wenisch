package l;

import lektion3.Arrays;

import java.lang.reflect.Array;

public class Test2 {
    public static void main(String[] args){

        System.out.println("Hello! Testing Arrays and forEach loops!"); //Start
        String container = ""; // Container for Strings
        for (int i = 0; i <= 10; i++){
            container = container + i;
            System.out.println(container);
        }
        String[] mobs = new String[10];

        int i = 0;

        for(String mob : mobs){
            mobs[i] = "mob "  + i;
            System.out.println(mobs[i]);
            i++;
        }
    }
}

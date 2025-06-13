package org.example;

import javax.swing.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Testing");
        System.out.println(2);
        System.out.println(2+95);
        System.out.println(90);
        int a = 10;
        int b = 10;
        System.out.println(a + b);
        int c = 10;
        Integer d = 15;
        System.out.println("c= " + c );
        System.out.println("d= " + d);

        System.out.println(d.byteValue());
        Consumer<String> m = string -> System.out.println(string);
        Supplier<Double> n = () -> Math.random();

        DoubleStream unendlichVieleZufallszahlen = DoubleStream.generate(Math::random).limit(10);
        unendlichVieleZufallszahlen.forEach(System.out::println);

        int start = 2;
        int kosten = -10;
        int level = 1;
        int gesamt = 0;
        int schulden = 0;
        for (int i = 0; i<20; i++){
            gesamt = kosten + start + schulden;
            System.out.println("Gesamte Seelen: " + (gesamt) + " bei level: " + level + " Bei der Belohnung: " + start);
            start = start + 2;
            level = level + 1;
            schulden = gesamt;
        }
    }
}
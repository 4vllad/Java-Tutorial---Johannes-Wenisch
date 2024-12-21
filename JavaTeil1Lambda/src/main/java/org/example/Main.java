package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Comparator<String> comparatorAnonymeInnereKlasse = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        String name1 = "Alex";
        String name2 = "Hendrik";

        System.out.println(comparatorAnonymeInnereKlasse.compare(name1,name2));


        Comparator<String> comparatorLambda = (String s1, String s2) -> { return s1.length() - s2.length(); };
        System.out.println(comparatorLambda.compare("Olaf", "Olga"));

        Comparator<String> comparatorLambda2 = (s1, s2) -> {return s1.length() - s2.length();};
        System.out.println(comparatorLambda2.compare("A", "ABC"));

        Comparator<String> comparatorLambda3 = (s1,s2) -> s1.length() - s2.length();
        System.out.println(comparatorLambda3.compare("Bro","Brodette"));

        List<String> wörter = Arrays.asList("Za", "bZ", "Boooo", "A", "B", "CD", "Dude", "Guy");

        System.out.println(wörter);

        //Collections.sort(wörter,comparatorAnonymeInnereKlasse);
        //Collections.sort(wörter,comparatorLambda);
        //Collections.sort(wörter,comparatorLambda2);
        Collections.sort(wörter,comparatorLambda3);

        System.out.println(wörter);

        Predicate<String> wörterLängerAlsFünfBuchstaben = (String s) -> s.length()>5;

        wörterLängerAlsFünfBuchstaben = (s) -> s.length() > 5;
        wörterLängerAlsFünfBuchstaben = s -> s.length() > 5;
        System.out.println(wörterLängerAlsFünfBuchstaben.test("hey"));
        System.out.println(wörterLängerAlsFünfBuchstaben.test("hey whey"));

        Runnable runnable = () -> System.out.println("Hallo Welt!");

        runnable.run();
    }
}
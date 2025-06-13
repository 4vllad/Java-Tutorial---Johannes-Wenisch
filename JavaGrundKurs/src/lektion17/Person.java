package lektion17;

public class Person {
    String name;
    Geschlecht geschlecht;

    public Person (String name, Geschlecht geschlecht){
        this.name = name;
        this.geschlecht = geschlecht;
    }

    public static void main(String[] args){
        Person p1 = new Person("A", Geschlecht.WEIBLICH);
        Person p2 = new Person("B", Geschlecht.WEIBLICH);
        System.out.println(p1.geschlecht == p2.geschlecht);
    }
}

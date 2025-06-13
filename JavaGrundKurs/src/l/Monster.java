package l;

import javax.xml.transform.Source;

public class Monster {
    private String name;
    private int health;
    private int power;
    private int stamina;

    //Konstruktoren
    Monster(){
    }

    Monster(String name){
        this.name = name;
    }

    Monster(String name, int health, int power){
        this.name = name;
        this.health = health;
        this.power = power;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setPower(int power){
        this.power = power;
    }

    public  void setStamina(int stamina){
        this.stamina = stamina;
    }

    //Getter
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getPower(){
        return power;
    }

    public int getStamina(){
        return stamina;
    }

    //Methoden
    public void info(){
        System.out.println("Name: " + this.name + " Leben: " + this.health + " Stärke: " + this.power);
    }

}

package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;
    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    public Animal(){
        this.name="";
        this.legs=0;
    }
    public abstract String getDescription();
    public abstract int getLegs();
    public abstract void makeSound();
    };


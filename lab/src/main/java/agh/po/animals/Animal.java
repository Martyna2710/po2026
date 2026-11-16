package agh.po.animals;

abstract class Animal {
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
    };


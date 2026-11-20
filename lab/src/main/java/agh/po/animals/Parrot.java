package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name){
        super(name, 2);
    }
    @Override
    public String getDescription() {
        return name;
    }
    public int getLegs() {return legs;}
    public void makeSound() {System.out.println("nie mam zielonego pojęcia jak defaultowo robi papuga"); }
}


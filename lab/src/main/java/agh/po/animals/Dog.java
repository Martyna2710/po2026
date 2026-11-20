package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name){
        super(name, 4);
    }
    @Override
    public String getDescription() {return name;}
    public int getLegs() {return legs;}
    public void makeSound() {System.out.println("Hau");}
}

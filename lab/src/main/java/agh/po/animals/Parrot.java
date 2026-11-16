package agh.po.animals;

class Parrot extends Animal {
    public Parrot(String name){
        super(name, 2);
    }
    @Override
    public String getDescription() {
        return name + " " + legs;
    }
}


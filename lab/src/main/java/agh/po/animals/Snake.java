package agh.po.animals;

class Snake extends Animal {
    public Snake(String name){
        super(name, 0);
    }
    @Override
    public String getDescription() {
        return name + " " + legs;
    }
}

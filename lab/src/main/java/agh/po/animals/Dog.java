package agh.po.animals;

class Dog extends Animal {
    public Dog(String name){
        super(name, 4);
    }
        @Override
        public String getDescription() {
            return name + " " + legs;
        }
}
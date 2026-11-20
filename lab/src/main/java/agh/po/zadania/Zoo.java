package agh.po.zadania;
import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void wypelniamy_zoo() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int wylosowany_numerek = random.nextInt(3);
            if (wylosowany_numerek == 0) {
                animals[i] = new Parrot("Mirek");
            } else if (wylosowany_numerek == 1) {
                animals[i] = new Snake("Kajtek");
            } else {
                animals[i] = new Dog("Puszek");
            }
        }
    }

    public int ile_nog() {
        int suma_nog = 0;
        for (int i = 0; i < animals.length; i++) {
            suma_nog += animals[i].getLegs();
        }
        return suma_nog;
    }

    public void opis_zwierzaka() {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            int legs = animal.getLegs();
            System.out.print(animal.getDescription()+", "+ legs+", ");
            animal.makeSound();
        }
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.wypelniamy_zoo();
        System.out.println("Suma nóg: " + zoo.ile_nog());
        zoo.opis_zwierzaka();
    }
}


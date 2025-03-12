package entities;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Animal monAnimal = new Dog();
        Dog dog = new Dog();
        dog.cry();

        if(monAnimal instanceof Dog){
            Dog dog1 = (Dog) monAnimal;
            dog1.cry();
        }

    }
}

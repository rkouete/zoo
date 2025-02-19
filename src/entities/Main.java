package entities;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal(); // je crée un nouvel objet de type Animal
        dog.setSpecies("Dog"); // je définis l'espèce de l'animal
        dog.setName("Medor");  //
        dog.setAge(5); //

        dog.move(); //
        dog.cry(); // WOUH wouh WOUH

        Animal cat = new Animal(); // je crée un nouvel objet de type Animal
        cat.setSpecies("Cat"); // je définis l'espèce de l'animal
        cat.setName("Minou");  //
        cat.move(); //
        cat.cry(); // Miaou Miaou

        Animal chicken = new Animal("Chicken", 1); // je crée un nouvel objet de type Animal
        chicken.setName("Coco");  //
        chicken.move(); //
        chicken.cry(); // Cot Cot Cot


    }
}

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal(); // je crée un nouvel objet de type Animal
        dog.species = "Dog"; // je définis l'espèce de l'animal
        dog.name = "Medor";  //
        dog.age = 5; //

        dog.move(); //
        dog.cry(); // WOUH wouh WOUH

        Animal cat = new Animal(); // je crée un nouvel objet de type Animal
        cat.species = "Cat"; // je définis l'espèce de l'animal
        cat.name = "Minou";  //
        cat.move(); //
        cat.cry(); // Miaou Miaou

        Animal chicken = new Animal("Chicken", 1); // je crée un nouvel objet de type Animal
        chicken.name = "Coco";  //
        chicken.move(); //
        chicken.cry(); // Cot Cot Cot


    }
}

package entities;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Medor");
        dog1.setAge(5);

        dog1.move(); //
        dog1.cry(); // WOUH wouh WOUH

        Cat cat = new Cat();
        cat.setName("Felix");
        cat.setAge(3);
        cat.cry();

        Chicken chicken = new Chicken();
        chicken.setName("Coco");
        chicken.cry();

    }
}

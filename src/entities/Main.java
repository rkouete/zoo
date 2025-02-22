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
        System.out.println(cat);

        Chicken chicken = new Chicken();
        chicken.setName("Coco");
        chicken.setAge(2);
        chicken.cry();

        Chicken chicken2 = new Chicken();
        chicken2.setName("Coco 1");
        chicken2.setAge(2);
        chicken2.cry();

        if(chicken.equals(chicken2)){
            System.out.println("Les deux poulets sont identiques");
        }else{
            System.out.println("Les deux poulets ne sont pas identiques");
        }


        System.out.println(chicken);

    }
}

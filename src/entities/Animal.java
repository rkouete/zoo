package entities;

public class Animal {

    private String species;
    private int age;
    private String name;

    public Animal(){
    }

    public Animal(String species){
        this.species = species;
    }

    public Animal(String species, int age){
        this.species = species;
        this.age = age;
    }

    public Animal(String species, int age, String name){
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(name +" is moving");
    }

    public void feed(){
        System.out.println("I am eating");
    }

    public void cry(){
        if(species.equals("Dog"))
            System.out.println("WOUH wouh WOUH");

        if(species.equals("Cat"))
            System.out.println("Miaou Miaou Miaou");

        if (species.equals("Chicken"))
            System.out.println("Cot Cot Cot");

        }
    }


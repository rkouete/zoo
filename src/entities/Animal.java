package entities;

public abstract class Animal {

    private String species;
    protected int age;
    protected String name;

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

    @Override
    public String toString(){
        return "Animal [Name: " + name + " Age: " + age + " ans]";
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Animal animal && this.age == animal.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    public abstract void cry();

    }


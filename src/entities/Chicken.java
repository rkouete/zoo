package entities;

public class Chicken extends Animal{
    @Override
    public void cry() {
        System.out.println("Cot Cot Cot");
    }

    @Override
    public String toString(){
        return "Chicken [Name: " + name + " Age: " + age + " ans]";
    }

}

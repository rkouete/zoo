package entities;

public class Epervier extends Bird {
    @Override
    public void fly() {
        System.out.println("I'm flying !!");
    }

    @Override
    public void cry() {
        System.out.println("Cui cui cui");
    }
}

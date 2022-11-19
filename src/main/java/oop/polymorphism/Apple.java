package oop.polymorphism;

public class Apple extends Fruit {

    @Override
    public int getCalories() {
        return 11;
    }

    public void peal() {
        System.out.println("Pealing");
    }
}

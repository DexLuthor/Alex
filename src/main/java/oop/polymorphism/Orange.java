package oop.polymorphism;

import java.util.Random;

public class Orange extends Fruit {
    @Override
    public int getCalories() {
        return new Random().nextInt(100);
    }
}

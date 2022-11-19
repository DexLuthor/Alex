package oop.polymorphism;

import java.util.Random;

public class Banana extends Fruit{
    @Override
    public int getCalories() {
        return new Random().nextInt(50);
    }
}

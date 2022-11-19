package oop.inheritance;

import java.util.Random;

@SuppressWarnings("all")
public abstract class Fruit {
    private double gramm;

    public int getCalories() {
        return new Random().nextInt(100);
    }
    public abstract String getSort();
    public abstract String getColor();
}

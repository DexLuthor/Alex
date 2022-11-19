package oop.polymorphism;

import java.util.Arrays;

public class Basket {
    Fruit[] fruits = new Fruit[0];

    public void addFruit(Fruit fruit) {
        Fruit[] newArray = Arrays.copyOf(fruits, fruits.length + 1);
        newArray[newArray.length - 1] = fruit;

        fruits = newArray;
    }

    public int calculateCalories() {
        int overall = 0;

        for (int i = 0; i < fruits.length; i++) {
            Fruit fruit = fruits[i];

            //To put it simply, polymorphism in Java allows us to perform the same action(.getCalories) in many different ways.
            int calories = fruit.getCalories();

            overall += calories;
        }

        return overall;
    }
}

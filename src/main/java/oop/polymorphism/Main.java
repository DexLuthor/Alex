package oop.polymorphism;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruit(new Apple());
        basket.addFruit(new Apple());
        basket.addFruit(new Apple());
        basket.addFruit(new Apple());
        basket.addFruit(new Orange());
        basket.addFruit(new Banana());
        basket.addFruit(new Banana());
        basket.addFruit(new Apple());
        basket.addFruit(new Banana());

        int calories =
                basket.calculateCalories();
        System.out.println(calories);

        Apple apple1 = new Apple();
        apple1.getCalories();
        apple1.peal();

        Fruit fruit = new Apple();
        fruit.getCalories();
//        fruit.peal(); Нельзя
        fruit.xxx();


        //autocasting
//        int integer = 100;
//        long hugeinteger = integer;

        //manual casting
        long hugeinteger = 5000;
        int integer = (int) hugeinteger;

        System.out.println(hugeinteger);
        System.out.println(integer);


//        Fruit f = new Orange();
        Fruit f = new Apple();
        Apple a = (Apple) f;
    }
}

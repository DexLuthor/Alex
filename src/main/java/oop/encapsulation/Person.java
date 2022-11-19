package oop.encapsulation;

import java.util.Arrays;
import java.util.Random;

// Encapsulation
// 1. privatize
// 2. accessors: getters + setters

@SuppressWarnings("all")
public class Person {
    private int pos = 0;
    private String alias = "Zheka";
    private int[] phoneNumbers = {123456789, 987654321};

    public int[] getPhoneNumbers() {
        return phoneNumbers.clone();
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String newAlias) {
        if (newAlias == null || newAlias.equals("")) {
            throw new IllegalArgumentException("Alias must not be null or empty");
        }
        if (newAlias.length() > 15) {
            throw new IllegalArgumentException("Alist must not be >15");
        }

        alias = newAlias;
    }
    public int getPosition() {
        return pos;
    }
    public void walk() {
        Random random = new Random();
        if (random.nextInt(10) < 5) {
            System.out.println(alias + " walking");
            pos += 50;
        }
    }
}

@SuppressWarnings("all")
class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAlias("Drunken");
        p.walk();
        p.walk();
        int position = p.getPosition();
        String alias = p.getAlias();

        int[] xx = p.getPhoneNumbers();
        System.out.println("Before" + Arrays.toString(xx));

        xx[0] = -1;

        int[] phoneNumbers2 = p.getPhoneNumbers();
        System.out.println("After" + Arrays.toString(phoneNumbers2));
    }
}
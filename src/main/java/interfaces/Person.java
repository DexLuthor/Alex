package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

interface Developer {
    void build();
}

interface Builder {
    public static final String x = "Hello";

    public void build();
}

public abstract class Person {
    private double x;
    private double y;
}

class Student extends Person implements Developer, Builder, Comparable<Student> {
    int age = new Random().nextInt(0, 100);

    @Override
    public void build() {
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }

    @Override
    public int compareTo(Student otherStudent) {
        //if this < otherStudent -> return negative number (-1)
        //if this > otherStudent -> return positive number (1)
        //if this == otherStudent -> return 0
        if(age > otherStudent.age){
            return 1;
        } else if(age < otherStudent.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age > o2.age){
            return 1;
        } else if(o1.age < o2.age) {
            return -1;
        }
        return 0;
    }
}
class MMM {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student());
        list.add(new Student());

        //old
        Collections.sort(list);//comparable

        //new
        list.sort(new AgeComparator());


        System.out.println(list);
    }
}

//Abstract vs interface
//1. only 1 abstract class vs multiple interfaces
//2. private state in abstract classes vs constants in interfaces
//3. in interfaces no protected/default modifiers
//4. in interfaces no modifier implies public

//==== in common
// cant do new AbClass() and new Interface()

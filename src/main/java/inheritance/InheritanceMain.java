package inheritance;

import encapsulation.Person;

@SuppressWarnings("all")
public class InheritanceMain {
    //1. reduce code duplicity == increase reusability
    //2. we can override children behavior (@Override)
    //3. abstract methods
    //4. having abstract method within a class forces us
    //          to make this class abstract
    //4.1. abstract methods must be implemented by children
    //4.2. it's forbidden to create abstract object
    public static void main(String[] args) {
        Orange o = new Orange();
        System.out.println(o.getSort());
        Banana banana = new Banana();
        banana.hashCode();
    }
}

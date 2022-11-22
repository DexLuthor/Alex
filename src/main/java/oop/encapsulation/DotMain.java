package oop.encapsulation;

public class DotMain {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 1);
        double Distance = dot.distance(4, 5);
        System.out.println("The distance between these points is " + Distance + " untits");


        Dot3D newDot = new Dot3D(7, 4, 3);
        double newDistance = newDot.distance(7, 4);
        System.out.println("The distance between these points is " + newDistance + " untits");
    }
}
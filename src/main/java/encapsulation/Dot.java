package encapsulation;

import java.util.Scanner;

public class Dot {
    public double a;
    public double b;
    public double a2;
    public double b2;

    public Dot(double x, double y) {
        a = x;
        b = y;
        System.out.println("input second x coordinate");
        a2 = scanner.nextInt();
        System.out.println("input second y coordinate");
        b2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(a2 - a, 2) + (Math.pow(b2 - b, 2)));
        System.out.println(distance + " cm");
    }

    public Dot(double x) {
        b = x;
        System.out.println("input second x coordinate");
        a2 = scanner.nextInt();
        System.out.println("input second y coordinate");
        b2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(a2 - a, 2) + (Math.pow(b2 - b, 2)));
        System.out.println(distance + " cm");
    }

    public Dot() {
        System.out.println("input second x coordinate");
        a2 = scanner.nextInt();
        System.out.println("input second y coordinate");
        b2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(a2 - a, 2) + (Math.pow(b2 - b, 2)));
        System.out.println(distance + " cm");
    }

    @Override
    public String toString() {
        return "Dot (" + a + ',' + b + ')';
    }

    public static void main(String[] args) {
        Dot newDot = new Dot( 6);
        System.out.println(newDot);


    }

    Scanner scanner = new Scanner(System.in);
}

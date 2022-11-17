package encapsulation;

import java.util.Scanner;

public class Dot3D extends Dot {
    public double a, b, c, a2, b2, c2;

    public Dot3D(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
        System.out.println("input second X coordinate");
        a2 = scanner.nextInt();
        System.out.println("input second Y coordinate");
        b2 = scanner.nextInt();
        System.out.println("input second Z coordinate");
        c2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(a2 - a, 2) + (Math.pow(b2 - b, 2) + (Math.pow(c2 - c, 2))));
        System.out.println(distance + " cm");




    }
    @Override
    public String toString() {
        return "Dot (" + a + ',' + b + ',' + c +')';
    }

    public static void main(String[] args) {
        Dot3D newDot = new Dot3D( 7,4,3);
        System.out.println(newDot);


    }

    Scanner scanner = new Scanner(System.in);
}




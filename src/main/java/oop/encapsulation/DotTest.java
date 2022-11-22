//package oop.encapsulation;
//
//public class DotTest {
//
//    private double X;
//    private double Y;
//    private double Z;
//    private double x3;
//    private double y3;
//    private double z3;
//
//    public static void main(String[] args) {
//        Dot dot = new Dot(1, 1);
//        double Distance = dot.distance(4, 5);
//        System.out.println("The distance between these points is " + Distance + " untits");
//    }
//
//    public DotTest(double X, double Y, double Z) {
//        this.X = X;
//        this.Y = Y;
//        this.Z = Z;
//    }
//
//    public void dot3(int x3, int y3, int z3) {
//        this.x3 = x3;
//        this.y3 = y3;
//        this.z3 = z3;
//    }
//
//    public void dot2(double X, double Y) {
//        this.X = X;
//        this.Y = Y;
//    }
//
//    public double testDistance() {
//        return Math.sqrt(Math.pow(X - x, 2) + (Math.pow(Y - y, 2) + (Math.pow(Z - z, 2))));
//    }
//}
//
//
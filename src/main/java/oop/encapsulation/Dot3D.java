package oop.encapsulation;

public class Dot3D extends Dot {
    private double x;
    private double y;
    private double z;

    public Dot3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Dot (" + x + ',' + y + ',' + z + ')';
    }


    public double distance(double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + (Math.pow(y2 - y, 2) + (Math.pow(z2 - z, 2))));
    }
    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + (Math.pow(y2 - y, 2) + (Math.pow(0 - z, 2))));
    }
//    public double distance(double x2, int z2) {
//        return Math.sqrt(Math.pow(x2 - x, 2) + (Math.pow(0 - y, 2) + (Math.pow(z2 - z, 2))));
//    }
//    public double distance(int y2, double z2) {
//        return Math.sqrt(Math.pow(0 - x, 2) + (Math.pow(y2 - y, 2) + (Math.pow(z2 - z, 2))));
//    }
}



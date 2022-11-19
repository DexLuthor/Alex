package oop.encapsulation;

public class Dot {
    private double x;
    private double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Dot(double x) {
        this.x = x;
    }

    public Dot(int y) {
        this.y = y;
    }
    public Dot() {

    }
    public void setDot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y, 2) + (Math.pow(x2 - x, 2)));
    }



    @Override
    public String toString() {
        return "Dot (" + x + ',' + y + ')';
    }
}





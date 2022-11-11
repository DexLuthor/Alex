import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

import java.awt.*;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        WinPane pane = new WinPane(0, 0, 600, 600, "Alex");
        ImprovedTurtle t1 = new ImprovedTurtle();
//        ImprovedTurtle t2 = new ImprovedTurtle(Color.RED);
//        ImprovedTurtle t3 = new ImprovedTurtle(Color.BLUE, 300, 300);
//        pane.add(t1);
//        pane.add(t2);
//        pane.add(t3);
//        t1.moveTo(200, 200);
        t1.print(5);
        t1.print("51");
        t1.print('5');
        System.out.println("");
        System.out.println(true);
    }
}

@SuppressWarnings("all")
class ImprovedTurtle extends Turtle {
    //OVERLOADING
    public ImprovedTurtle(Color color, double x, double y) {
        this.setPenColor(color);
        this.setX(x);
        this.setY(y);
    }

    public ImprovedTurtle(Color defaultPenColor) {
        this.setPenColor(defaultPenColor);
    }

    public ImprovedTurtle() {
    }

    public void print(int i) {
    }

    public void print(String i) {
    }

    public void print(char i) {
    }
}
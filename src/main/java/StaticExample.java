import sk.upjs.jpaz2.Turtle;

import java.awt.*;
import java.util.Random;

public class StaticExample {
    public static long j;
    public long i = 10;
}

class MM {
    public static void main(String[] args) {
        //nonstatic
        StaticExample obj = new StaticExample();
        obj.i = 10;

        //static
        StaticExample.j = 10;
        //==========================

        Random random = new Random();
        int i = random.nextInt(0, 100);

        Math.sqrt(16);

        Turtle t = new Turtle();
        t.setPenColor(Color.RED);

        //static - something belongs to the class


    }
}

class Human {
    static int headCount = 1;
    int age;
    String name;
    double weight;
    double height;

    public static java.util.List<String> getChromosomes() {
        return java.util.List.of("XX", "XY");
    }

    public void x() throws RuntimeException {}

    public void getOld() {
        age++;
    }
}
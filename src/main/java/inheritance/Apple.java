package inheritance;

import java.util.Random;

@SuppressWarnings("all")
public class Apple extends Fruit {
    @Override
    public String getSort() {
        return "Golden";
    }

    @Override
    public String getColor() {
        String c1 = "green";
        String c2 = "red";

        Random random = new Random();
        int r = random.nextInt(10);

        if (r < 5) {
            return c1;
        } else {
            return c2;
        }
    }
}

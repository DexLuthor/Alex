import sk.upjs.jpaz2.Turtle;

public class ImprovedTurtle extends Turtle {
    //create own methods

    public void shape(int length, int angle, int numberOfTimes) {
        for (int j = 0; j < numberOfTimes; j++) {
            this.step(length);
            this.turn(angle);
        }
    }

    public void triangle() {
        //....
    }

    public void psychoticWalking() {
        for (int i = 0; i < 100000; i++) {
            double randomDirection = Math.random() * 360; //[0, 1)
            this.turn(randomDirection);
            this.step(15);
        }
    }

    public void spiral() {
        double initialSize = 120;

        //do { ... } while();

        while (initialSize > 50) {
            this.step(initialSize);
            initialSize = initialSize * 0.95;
//            initialSize *= 0.95; shorcut

//            int i = 5;
//            i = i + 1;
//            i += 1
//            i++
            this.turn(90);
        }
    }

    public void circleWalk() {
        for (int i = 0; i < 1_000_000; i++) {

            if (this.distanceTo(150, 150) < 50) {
                double randomDirection = Math.random() * 360; //[0, 1)
                this.turn(randomDirection);
                this.step(1);
            } else {
                this.step(-1);
            }

        }
    }

    public void x() {
        double money = 100;
        int numberOfPpl = 7;
        boolean tomorrowWork = true;

        if (money <= 10) {
            //...
        } else if (money <= 20) {
            //...
        } else if (money <= 100 && numberOfPpl == 5 && !tomorrowWork) {
            // && - and
            // || - or
            // ! - negations
            // (tomorrowWork == true) may be simplified to (tomorrowWork)
        } else {
            //...
        }

    }

    public double min(double a, double b) {
        if (a < b) {
            return a; // a is smaller
        }

        return b; // b is smaller
    }

    public boolean checkStringToContainOnlyLetters(String word) {
        for (int i = 0; i < word.length(); i++) {
            char charAtIndex = word.charAt(i);

            //type casting
            int charCode = (int) charAtIndex;

            if(charCode < 97 || charCode > 122) {
                return false;
            }
        }
        return true;
    }
}

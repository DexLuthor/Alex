import sk.upjs.jpaz2.Turtle;

public class BetterDmitriy extends Turtle {
    public void shape(int length, int angle, int numberOfTimes) {
        for (int j = 0; j < numberOfTimes; j++) {
            this.step(length);
            this.turn(angle);
        }
    }

    public void triangle(int sideLength) {
        this.turn(30);
        for (int i = 0; i < 3; i++) {
            this.step(sideLength);
            this.turn(120);

        }
    }

    public void betterchain(int radius, int quantity) {
        this.turn(90);
        this.penUp();
        this.step(-radius * quantity); // centres the chain in the window
        for (int j = 0; j < quantity; j++) {
            this.dot(radius);
            this.step(radius * 2);
        }
        this.step(-radius * 0.5); // moves the turtle closer to the chain
    }

    public void pattern(int quantity, int length, int angle, int numberOfSides) {
        for (int p = 0; p < quantity; p++) {
            if (p < numberOfSides) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
            } else if (p < numberOfSides*2) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
                this.step(length);
            } else if (p < numberOfSides*3) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
                this.step(length*2);
            } else if (p < numberOfSides*4) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
                this.step(length*3);
            } else if (p < numberOfSides*5) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
                this.step(length*4);
            } else if (p < numberOfSides*6) {
                this.shape(length, angle, numberOfSides);
                this.turn(angle);
                this.step(length*5);
            }
        }
    }


}


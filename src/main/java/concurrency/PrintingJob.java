package concurrency;

import java.util.Random;

public class PrintingJob implements Runnable {
    @Override
    public void run() {
        int r = new Random().nextInt();
        System.out.println(r);
    }
}

package concurrency.readmodifywrite;

import java.util.Random;

public class DebitJob implements Runnable {
    private final Account account;

    public DebitJob(Account account) {
        this.account = account;
    }

    //atomicity
    @Override
    public void run() {
        //....
        synchronized (account) {
            double balance = account.getBalance(); //read
            int r = new Random().nextInt(50, 100);
            double newBalance = balance + r;//modify
            System.out.println(r);
            account.setBalance(newBalance);//write
        }
        //....
    }
}

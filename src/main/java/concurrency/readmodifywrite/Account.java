package concurrency.readmodifywrite;

import java.math.BigDecimal;


public class Account {
    private double balance;
    private String holderName;
    //...

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

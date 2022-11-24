package concurrency.readmodifywrite;

public class RMWMain {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        Thread thread1 = new Thread(new DebitJob(account));
        Thread thread2 = new Thread(new DebitJob(account));

        thread1.start();
        thread2.start();

        Thread.sleep(500);
        System.out.println(account.getBalance());
    }
}

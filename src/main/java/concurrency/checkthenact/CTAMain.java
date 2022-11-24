package concurrency.checkthenact;

public class CTAMain {
    public static void main(String[] args) throws InterruptedException {
        LamborghiniFactory factory = new LamborghiniFactory();

        Thread thread1 = new Thread(new PersonJob(factory));
        Thread thread2 = new Thread(new PersonJob(factory));

        thread1.start();
        thread2.start();

        Thread.sleep(500);
    }
}

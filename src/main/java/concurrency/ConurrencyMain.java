package concurrency;

// concurrency = multithreading
@SuppressWarnings("unused")
public class ConurrencyMain {
    public static void main(String[] args) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        String name = Thread.currentThread().getName();
        Thread.sleep(30);

        System.out.println(name);
        PrintingJob job = new PrintingJob();
        Thread myThread1 = new Thread(job);
        Thread myThread2 = new Thread(job);
        Thread myThread3 = new Thread(job);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        System.out.println(name);
    }
}

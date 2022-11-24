package concurrency.checkthenact;

public class LamborghiniFactory {
    private Object lamborghini = null;

//    public void manufacture() {
//        synchronized (this) {
//            if (lamborghini == null) {
//                lamborghini = new Object();
//                System.out.println("Created");
//            }
//        }
//    }
    public synchronized void manufacture() {
        if (lamborghini == null) {
            lamborghini = new Object();
            System.out.println("Created");
        }
    }
}

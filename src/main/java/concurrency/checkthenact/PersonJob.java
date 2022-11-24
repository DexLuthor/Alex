package concurrency.checkthenact;

public class PersonJob implements Runnable {

    private final LamborghiniFactory factory;

    public PersonJob(LamborghiniFactory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        factory.manufacture();
    }
}

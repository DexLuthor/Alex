@SuppressWarnings("all")
public class FinalExample {

    // final var - cant change
    // final method - cant @Override
    // final class - cant extend
    public final void test() {
        final double pi = 3.14;

//        i++;
    }
}

//class Child extends FinalExample {
//    @Override
//    public void test() {
//    }
//}


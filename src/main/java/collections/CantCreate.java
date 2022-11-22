package collections;

public class CantCreate {
    private CantCreate() {}

    class M {
        public static void main(String[] args) {
            CantCreate x = new CantCreate();
        }
    }
}

package oop.inheritance;

@SuppressWarnings("all")

//is a
public class Orange extends Fruit {
    @Override//annotation
    public String getSort() {

        return "Tasty";
    }
    @Override
    public String getColor() {
        return "Orange";
    }
}

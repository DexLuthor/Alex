import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

public class Starter {
    //main method
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // immutable
//        String s = "Hello ";
//        for (int i = 0; i < 3; i++) {
//          s = s + "World";
//            s += "World";
//        }
//        StringBuilder sb = new StringBuilder("Hello ");
//        for (int i = 0; i < 1000; i++) {
//            sb.append("World");
//        }
//        String s1 = sb.toString();


        String s1 = new String("Hello");
        String s2 = new String("Hello");
        boolean areEqualWrong = s1 == s2;
        boolean areEqualCorrect = s1.equals(s2);
        System.out.println(areEqualCorrect);

        int i1 = 1;
        int i2 = 1;
        boolean areEqual2 = i1 == i2;
        System.out.println(areEqual2);

        char letter = 'a';
        char digit = '1';
        char plus = '+';
        char enter = '\n';
        char tab = '\t';
        char space = ' ';

        System.out.println(letter);
        System.out.println((int) letter);


        boolean containsOnlyLetters = new ImprovedTurtle()
                .checkStringToContainOnlyLetters("Alex");

        System.out.println(
                "Contains only letters " + containsOnlyLetters
        );
    }


}

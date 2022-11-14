package words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. vocabulary - so that computer can answer
        //2. be able to input - scanner
        //3. consider for or while(true) - infinite loop
        //4. validate correct answers
        //5. used words
        //6. existing words validation

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        System.out.println("You entered " + next);
    }
}

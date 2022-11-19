package words;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        1. vocabulary - so that computer can answer
//        2. be able to input - scanner
//        3. consider for or while(true) - infinite loop
//        4. validate correct answers
//        5. used words
//        6. existing words validation
//
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//
//        System.out.println("You entered " + next);
//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] NATOAlphabet =
                {"alpha", "bravo", "charlie",
                        "delta", "echo", "foxtrot", "golf",
                        "hotel", "india", "juliet",
                        "kilo", "lima", "mike", "november",
                        "oscar", "papa", "quebec", "romeo",
                        "sierra", "tango", "uniform", "victor",
                        "whiskey", "x-ray", "yankee", "zulu"};


        for (int c = 0; c < 100; c++) {
            String next = scanner.next();
            System.out.println("Player: " + next);

            char lastLetter = next.charAt(next.length() - 1);
            char firstLetter = next.charAt(0);
            for (int i = 0; i < NATOAlphabet.length; i++) {
                String word = NATOAlphabet[i];

                if (lastLetter == word.charAt(0)) {
                    System.out.println("Computer: " + word);
                    if (c > 0 && firstLetter != word.charAt(word.length() - 1)) {
                        System.out.println("Wrong!");
                    }
                    break;
                }
            }
        }
    }
}

//for (int i = 0; i < NATOAlphabet.length; i++) {
//        if (lastLetter == NATOAlphabet[i].charAt(0)) {
//        System.out.println("Computer: " + NATOAlphabet[i]);
//        if (firstLetter == NATOAlphabet[i].charAt(3)) {
//        break;
//        }
//        System.out.println("Wrong!");




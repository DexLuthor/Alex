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
                         {  "alpha", "bravo", "charlie",
                            "delta", "echo", "foxtrot", "golf",
                            "hotel", "india", "juliet",
                            "kilo", "lima", "mike", "november",
                            "oscar", "papa", "quebec", "romeo",
                            "sierra", "tango", "uniform", "victor",
                            "whiskey", "x-ray", "yankee", "zulu"     };


            //while(true) {
            for (int i = 0; i < NATOAlphabet.length; i++) {
                String next = scanner.next();
                System.out.println("You entered " + next);
                if (next.charAt(next.length() - 1) != NATOAlphabet[i].charAt(i)){
                    return;
                }
                System.out.println(NATOAlphabet[i]);

            }
        }
    }



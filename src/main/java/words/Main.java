package words;

//import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        List<String> vocabulary = new ArrayList<>();
        try(Scanner vocabularyScanner = new Scanner(new File("src/main/resources/words.txt"))) {
            while (vocabularyScanner.hasNext()) {
                String vocabWord = vocabularyScanner.next();
                if (vocabWord.length() > 3){
                    vocabulary.add(vocabWord);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("couldn't load vocabulary");
            return;
        }
        Scanner inputScanner = new Scanner(System.in);
        String computerWord = null;
        Set<String> pastWords = new HashSet<>();
        while (true) {
            String playerWord = inputScanner.next();
            if (computerWord != null && playerWord.charAt(0) != computerWord.charAt(computerWord.length() - 1) && pastWords.contains(playerWord)) {
                System.out.println("\033[93mPlease enter another word that starts with " + computerWord.charAt(computerWord.length() - 1) + "\033[0m ");
                continue;

            }
            computerWord = lookup(vocabulary, playerWord, pastWords);
            if (computerWord == null) {
                System.out.println("Computer: You beat me");
                break;
            }
            System.out.println("Coumputer: " + computerWord);
            pastWords.add(computerWord);
            pastWords.add(playerWord);

        }
    }


    private static String lookup(List<String> vocabulary, String next, Set<String> pastWords) {
        for (String potentialWord : vocabulary) {
            if (next.charAt(next.length() - 1) == potentialWord.charAt(0) && !pastWords.contains(potentialWord)) {
                return potentialWord;
            }
        }
        return null;
    }
}

//for (int i = 0; i < NATOAlphabet.length; i++) {
//        if (lastLetter == NATOAlphabet[i].charAt(0)) {
//        System.out.println("Computer: " + NATOAlphabet[i]);
//        if (firstLetter == NATOAlphabet[i].charAt(3)) {
//        break;
//        }
//        System.out.println("Wrong!");




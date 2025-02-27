package com.bridgelabz.builtinfunction.level2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String userFeedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Enter 'h' if my guess is too high, 'l' if too low, and 'c' if correct.");

        while (true) {
            guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "? (Enter 'h', 'l', or 'c')");

            userFeedback = scanner.next().toLowerCase();

            if (userFeedback.equals("c")) {
                System.out.println("Yay! I guessed your number correctly.");
                break;
            } else if (userFeedback.equals("h")) {
                upperBound = guess - 1;  // Reduce the upper bound
            } else if (userFeedback.equals("l")) {
                lowerBound = guess + 1;  // Increase the lower bound
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }

            // If the bounds are incorrect, break the loop
            if (lowerBound > upperBound) {
                System.out.println("Hmm, something went wrong! Are you sure about your inputs?");
                break;
            }
        }

        scanner.close();
    }

    // Function to generate a guess between lowerBound and upperBound
    private static int generateGuess(int lowerBound, int upperBound, Random random) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}

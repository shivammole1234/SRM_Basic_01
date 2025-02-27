package com.bridgelabz.builtinfunction.level2;

import java.util.Scanner;

public class PrimeNumberChecker {
    // Function to take user input
    private static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Function to check if a number is prime
    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Loop up to √num for efficiency
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, number is prime
    }
    public static void main(String[] args) {
        // Take user input
        int number = takeInput();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }




}

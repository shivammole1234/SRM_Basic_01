package com.bridgelabz.builtinfunction.level2;

import java.util.Scanner;

public class FibonacciGenerator {


    // Function to generate and print Fibonacci sequence
    private static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Function to take user input
    private static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    public static void main(String[] args) {
        // Take user input
        int terms = takeInput();

        // Generate and print Fibonacci sequence
        generateFibonacci(terms);
    }



}

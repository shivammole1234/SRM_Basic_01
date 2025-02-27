package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        // Define an array to store multiplication results
        int[] multiplicationTable = new int[10];
        // Fill the array with multiplication results from 1 to 10
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }
        // Displaying the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        scanner.close();
    }
}
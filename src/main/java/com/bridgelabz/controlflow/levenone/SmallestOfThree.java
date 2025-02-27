package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class SmallestOfThree {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // object of scanner class

            // input for first number
            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            // input for second number
            System.out.print("Enter second number: ");
            int number2 = input.nextInt();

            // input for third number

            System.out.print("Enter third number: ");
            int number3 = input.nextInt();

            boolean isFirstSmallest = (number1 < number2) && (number1 < number3); // calculating the smallest

            System.out.println("Is the first number the smallest? " + isFirstSmallest);
        }
    }


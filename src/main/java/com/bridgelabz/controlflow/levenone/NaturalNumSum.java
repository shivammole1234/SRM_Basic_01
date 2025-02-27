package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class NaturalNumSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // enter the number
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // check whether it's greater than zero or not
            if (n > 0) {
                int sum = 0;
                int i = 1;
                while (i <= n) {
                    sum = sum + i;
                    i++;
                }
                // calculate sum using formula
                int formulaSum = (n * (n + 1)) / 2;

                System.out.println("Sum using while loop: " + sum);
                System.out.println("Sum using formula: " + formulaSum);
                // verify both results
                if (sum == formulaSum) {
                    System.out.println("Both are same, so correct!");
                } else {
                    System.out.println("Something went wrong.");
                }
            } else {
                System.out.println("Enter a natural number (greater than 0).");
            }
            // close scanner object
            sc.close();
        }
    }

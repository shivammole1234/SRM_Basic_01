package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class NaturalNumberSumForLoop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            // Reading user input and storing it in variable n.
            int n = sc.nextInt();
            // Checking whether the entered number is greater than zero or not.
            if (n > 0) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum = sum + i;
                }
                // Calculating sum of first n natural numbers using formula.
                int formulaSum = (n * (n + 1)) / 2;
                System.out.println("Sum using for loop: " + sum);
                System.out.println("Sum using formula: " + formulaSum);
                // Comparing both sums.
                if (sum == formulaSum) {
                    System.out.println("Both are same, so correct!");
                } else {
                    System.out.println("Something went wrong.");
                }
            } else {
                System.out.println("Enter a natural number (greater than 0).");
            }
            // Closing scanner object.
            sc.close();
        }
}

package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}

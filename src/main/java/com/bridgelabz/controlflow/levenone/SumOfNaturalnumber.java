package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class SumOfNaturalnumber {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // scanner class object
            System.out.print("Enter a number: ");
            int number = input.nextInt();  // taking input

            if (number > 0) {
                int sum = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + number + " is not a natural number.");
            }
        }
    }


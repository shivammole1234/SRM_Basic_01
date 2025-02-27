package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class VoteEglibileChecking {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // scanner class object
            System.out.print("Enter age: ");
            int age = input.nextInt();  // taking age as input from user

            // checking condition
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }
        }
    }


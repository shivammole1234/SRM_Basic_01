package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int input1; // taking input from user
        Scanner scanner=new Scanner(System.in); // scanner object
        input1= scanner.nextInt();

        // checking condition for less than zero
        if(input1 <0)
            System.out.println("number is negative ");
        else if (input1>0)
            System.out.println("number is positive");
        else
            System.out.println("number is equal to zero");
    }
}

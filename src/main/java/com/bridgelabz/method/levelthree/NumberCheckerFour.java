package com.bridgelabz.method.levelthree;

import java.util.Scanner;

public class NumberCheckerFour {

    public static boolean checkNumberIsPrime(int number){ // Method Declaration and definition for checking prime or not
        if(number <= 0) // Checking whether the given number is positive or negative
            return false;   // If it is negative then returning false

        for (int i=2;i<number;i++){  // Looping from 2 to n-1 to check whether any factor exists or not
            if((number%i)==0) // Checking whether there exist any factor other than itself
                return false;
        }
        return true;
    }

    public static boolean checkNumberIsNeonOrNot(int number){
        int square = number*number; // Calculating square of the given number
        int [] digits=new int[String.valueOf(square).length()]; // Creating an integer array with length equal to number of digits present in square
        int sum=0; // Initializing variable as zero
        for(int i=digits.length-1;i>=0;i--){ // Storing each digit in array
            digits[i]=square%10;
            square/=10;
            sum+=digits[i];

        }
        if(sum==number) // Comparing sum of digits with original number
            return true; // Returning true if condition satisfies
        else
            return false;  // Else returning false

    }

    public static boolean checkNumberIsSpyOrNot(int number){
        int product=1,sum=0,digit; // Declaring variables
        while(number!=0){ // Looping until number becomes zero
            digit=number%10; // Extracting last digit of number using modulo operator
            product*=digit; // Multiplying extracted digit with product variable
            sum+=digit;     // Adding extracted digit with sum variable
            number/=10;      // Removing last digit from number using division operator
        }
        if(product==sum) // Comparing both values
            return true; // Returning true if condition satisfies
        else
            return false;// Else returning false
    }

    public static boolean checkNumberIsAutomorphicOrNot(int inputNumber){
        int square=inputNumber*inputNumber; // Calculating square of the given number
        String str=Integer.toString(square); // Converting square into string type
        String subStr=str.substring(str.length()-String.valueOf(inputNumber).length()); // Substring operation to extract substring from end of string
        int num=Integer.parseInt(subStr); // Converting substring back to integer type
        if(num==inputNumber) // Comparing both numbers
            return true; // Returning true if condition satisfies
        else
            return false;  // Else returning false
    }

    public static boolean checkNumberIsBuzzOrNot(int inputNumber){
        if(inputNumber%7==0 || inputNumber/10==7) // Checking whether number is divisible by either 5 or 7
            return true; // Returning true if condition satisfies
        else
            return false; // Else returning false
    }
    public static void main(String[] args) {

        int inputNumber; // Variable declaration and initialization
        Scanner scanner = new Scanner(System.in); // Creating object of Scanner class
        System.out.println("Enter the number : ");  // Printing statement on console
        inputNumber = scanner.nextInt(); // Reading user input

        // checking for prime or not
        if(checkNumberIsPrime(inputNumber)) { // Calling method by passing argument
            System.out.println("The entered number "+inputNumber+" is Prime"); // Printing statement on console
        }else{
            System.out.println("The entered number "+inputNumber+" is Not Prime"); // Printing statement on console
        }

        // checking for neon or not
        if(checkNumberIsNeonOrNot(inputNumber)){ // Calling method by passing argument
            System.out.println("The entered number "+inputNumber+" is Neon"); // Printing statement on console
        }else {
            System.out.println("The entered number "+inputNumber+" is Not Neon"); // Printing statement on console
        }

        // checking for spy or not
        if(checkNumberIsSpyOrNot(inputNumber)){ // Calling method by passing argument
            System.out.println("The entered number "+inputNumber+" is Spy"); // Printing statement on console
        }else {
            System.out.println("The entered number "+inputNumber+" is Not Spy"); // Printing statement on console
        }

        // checking for automorphic or not
        if(checkNumberIsAutomorphicOrNot(inputNumber)){ // Calling method by passing argument
            System.out.println("The entered number "+inputNumber+" is Automorphic"); // Printing statement on console
        }else {
            System.out.println("The entered number "+inputNumber+" is Not Automorphic"); // Printing statement on console
        }

        //checking for checkNumberIsBuzzOrNot
        if(checkNumberIsBuzzOrNot(inputNumber))
            System.out.println("The enter number "+inputNumber+" is buzz number");
        else
            System.out.println("the enter number "+inputNumber+" is not buzz number");



    }
}

package com.bridgelabz.method.levelthree;
import java.util.Scanner;
public class CheckNumberThree {
    public static int[] storeDigits(int number) { // method for storing each digit in an array

        int length = String.valueOf(number).length();  // to get the length of the given number
        int[] digits = new int[length];   // creating an array with the same length as that of the number
        int index = 0;                    // initializing index value to zero
        while (number > 0) {
            digits[index] = number % 10;     // storing the last digit of the number into the array
            number /= 10;                   // removing the last digit from the number
            index++;                        // incrementing the index by one after every iteration
        }
        return digits; //return digits;
    }

    public static int[] reverseDigits(int[] digits){ // method for reversing the array
        int[] reverseDigits = new int[digits.length];
        int j=0;
        for(int i=digits.length-1;i>=0;i--){ // iterating over the array
            reverseDigits[j++]=digits[i];  //storing element at ith position into jth position
        }
        return reverseDigits;   // returning reverseDigits
    }

    public static boolean isArraySame(int[] digits,int[] reverseDigits){ //method for comparing two arrays
        if(digits.length!=reverseDigits.length){  //comparing lengths of both arrays
            return false;
        }else{
            for(int i=0;i<digits.length;i++){ // iterating over the array
                if(digits[i]!=reverseDigits[i]){ // comparing elements of both arrays
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isDuckNumber(int[] digits){ //method for finding whether it is duck number or not
        for(int i=0;i<digits.length;i++){ //iterating over the array
            if(digits[i]==0){
                return true;  //if any element is zero then return true
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int inputNumber; // declaring variable
        Scanner scanner = new Scanner(System.in); //creating object of scanner class
        System.out.println("Enter the number : ");
        inputNumber = scanner.nextInt(); // taking user input
        int[] digits = storeDigits(inputNumber); // calling storeDigits() method and passing argument
        System.out.print("The digits are : ");

        for (int i = 0; i < digits.length; i++) { // iterating over the array
            System.out.print(digits[i]);
        }

        int [] reverseDigits = reverseDigits(digits); //calling reverseDigits() method and passing argument
        System.out.println("\nThe reversed digits are : "); // printing statement
        for(int i=0;i<reverseDigits.length;i++){ // iterating over the array
            System.out.print(reverseDigits[i] +",");
        }
        System.out.println("\n");

        boolean isTwoArrayEqual=isArraySame(digits,reverseDigits); // calling isArraySame() method and passing arguments

        if(isTwoArrayEqual)  // checking condition
            System.out.println("both array are eqaual"); //printing statement
        else
            System.out.println("both array are not equal");

        boolean isPalindrome=isTwoArrayEqual;  // assigning value to boolean variable
        if(isPalindrome)                       //checking condition
            System.out.println("the number is palindrome");
        else
            System.out.println("the number is not palindrome");

        boolean isDuckNumber=isDuckNumber(digits); // calling isDuckNumber() method and passing argument
        if(isDuckNumber)   // checking condition
            System.out.println("the number is duck number");
        else
            System.out.println("the number is not duck number");

    }
}

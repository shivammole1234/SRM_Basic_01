package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); // creating the object of scanner class
        System.out.println("Enter the input number to check the number of digit :- ");
        int numberInput=scanner.nextInt();// taking the inpuit from user
        int count=0;  // intilize the count to zero

        int tempNumber=numberInput;
        while(tempNumber !=0){
            tempNumber = tempNumber/10; // removing the last digit
            count++; // incrasing the count

        }
        System.out.println("number of digit in "+numberInput+" are "+count);
    }
}

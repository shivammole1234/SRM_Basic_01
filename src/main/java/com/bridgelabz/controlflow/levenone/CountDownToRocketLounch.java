package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class CountDownToRocketLounch {
    public static void main(String[] args) {

        int num;
        int cnt=0; // count variable
        System.out.println("enter the number to check the count");
        Scanner scanner=new Scanner(System.in); // scanner object
        num=scanner.nextInt();

       for(int i=0;i<num;i++) // for loop to increase count
            cnt++;

       System.out.println("final count down is :- "+cnt);
    }
}

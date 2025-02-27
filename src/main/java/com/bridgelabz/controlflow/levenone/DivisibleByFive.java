package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// object of scanner class

        System.out.println("enter the number :-"); // taking the inout from user
        int num=sc.nextInt();
        if(num%5==0)
            System.out.println(num+" is dividibke by 5 ");
        else
            System.out.println("not divisible by 5");
    }
}

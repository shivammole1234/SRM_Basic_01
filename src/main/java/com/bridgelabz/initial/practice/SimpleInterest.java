package com.bridgelabz.initial.practice;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        double rate=12;
        double principle;
        double time;
        double simple_Interest;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Principal amount: ");
        principle = scanner.nextDouble();
                System.out.print("Enter Rate of interest: ");
                 rate = scanner.nextDouble();
                System.out.print("Enter Time period: ");
                 time = scanner.nextDouble();
        simple_Interest = (principle * rate * time) / 100;
                System.out.println("Simple Interest: " + simple_Interest);
            }
        }





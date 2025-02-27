package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class DiscountedFeeCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // object of scnner class
            // Taking user input for fee and discount percent
            System.out.print("Enter the fee: ");
            double fee = input.nextDouble();
            System.out.print("Enter the discount percentage: ");
            double discountPercent = input.nextDouble();// taking discount %age
            double discount = (fee * discountPercent) / 100; // calciulatingt the discount
            double finalFee = fee - discount;  // total fee to pay
            System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        }
    }


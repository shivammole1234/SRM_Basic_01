package com.bridgelabz.elements.levelone;


public class ProfitLossCalculator {

        public static void main(String[] args) {
            double costPrice = 129;  // hardcoded value
            double sellingPrice = 191; // selling price of product
            double profit = sellingPrice - costPrice; // calculating profit
            double profitPercentage = (profit / costPrice) * 100;

            System.out.println("The Cost Price is INR " + String.format("%.3f",costPrice) + " and Selling Price is INR " + String.format("%.3f",sellingPrice));
            System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.3f",profitPercentage)  + "%");
        }
    }


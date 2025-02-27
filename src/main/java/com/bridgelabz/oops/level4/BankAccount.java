package com.bridgelabz.oops.level4;

public class BankAccount {

    private static String bankName; // static variable to share accross the class
    private  static  int totalAccount=0; // variable to store number of totalAccount

    private final int accountNumber; // final variable accountNumber

    private String accountHolderName; // account holder name
    private double bankBalance; // variable to store the bank balance

    //constructor
    public BankAccount(int accountNumber, double bankBalance,String accountHolderName){
        this.accountNumber=accountNumber;
        this.bankBalance=bankBalance;
        this.accountHolderName=accountHolderName;
        totalAccount++;
    }

    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank name :- "+bankName);
            System.out.println("Account Number:- "+accountNumber);
            System.out.println("Account Holder Name:- "+accountHolderName);
            System.out.println("Bank Balance :- "+bankBalance);
        }
    }
    public static void getTotalNumberOfAccount(){
        System.out.println("Total number of Account are:- "+totalAccount);
    }


    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(789654,963.02,"Aditya"); //create the object of BankAccount
        BankAccount bankAccount1=new BankAccount(963258,456.20,"Ketan");

        bankAccount1.displayAccountDetails(); // display account details of bankAccount1
        bankAccount.displayAccountDetails(); // display account details of bankAccount
        getTotalNumberOfAccount();
    }
}

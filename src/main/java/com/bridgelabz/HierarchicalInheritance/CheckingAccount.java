package com.bridgelabz.HierarchicalInheritance;

// Subclass: CheckingAccount
public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("\n🔹 Checking Account:");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

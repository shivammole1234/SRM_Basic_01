package com.bridgelabz.HierarchicalInheritance;

// Subclass: FixedDepositAccount
public class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("\n🔹 Fixed Deposit Account:");
        displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }
}

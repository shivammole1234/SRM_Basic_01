package com.bridgelabz.HierarchicalInheritance;

// Main class to test the hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 50000, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 30000, 20000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(1003, 100000, 5);

        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}

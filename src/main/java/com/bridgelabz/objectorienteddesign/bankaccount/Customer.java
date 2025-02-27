package com.bridgelabz.objectorienteddesign.bankaccount;

import java.util.List;

public class Customer {
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String openAccount(double initialDeposit) {
        return bank.openAccount(this, initialDeposit);
    }

    public String viewBalance(String accountNumber) {
        List<Account> accounts = bank.getCustomerAccounts(this);
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return String.format("Account %s balance: $%.2f",
                        accountNumber, account.getBalance());
            }
        }
        return "Account not found";
    }

    public String deposit(String accountNumber, double amount) {
        if (bank.deposit(this, accountNumber, amount)) {
            return String.format("Deposited $%.2f to account %s", amount, accountNumber);
        }
        return "Deposit failed - account not found";
    }

    public String withdraw(String accountNumber, double amount) {
        if (bank.withdraw(this, accountNumber, amount)) {
            return String.format("Withdrew $%.2f from account %s", amount, accountNumber);
        }
        return "Withdrawal failed - insufficient funds or account not found";
    }

    public String getName() {
        return name;
    }
}

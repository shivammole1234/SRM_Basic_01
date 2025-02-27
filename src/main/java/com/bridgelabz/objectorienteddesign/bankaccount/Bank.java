package com.bridgelabz.objectorienteddesign.bankaccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private String name;
    private Map<Customer, List<Account>> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new HashMap<>();
    }

    public String openAccount(Customer customer, double initialDeposit) {
        String accountNumber = String.format("%s-%04d",
                name.substring(0, 3), customers.size() + 1);
        Account newAccount = new Account(accountNumber, initialDeposit);

        customers.putIfAbsent(customer, new ArrayList<>());
        customers.get(customer).add(newAccount);
        return accountNumber;
    }

    public List<Account> getCustomerAccounts(Customer customer) {
        return customers.getOrDefault(customer, new ArrayList<>());
    }

    public boolean deposit(Customer customer, String accountNumber, double amount) {
        List<Account> accounts = customers.get(customer);
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.deposit(amount);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean withdraw(Customer customer, String accountNumber, double amount) {
        List<Account> accounts = customers.get(customer);
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account.withdraw(amount);
                }
            }
        }
        return false;
    }
}
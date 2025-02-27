package com.bridgelabz.objectorienteddesign.bankaccount;
// this is association between classes
// one to many relationship
// one customer can have multiple accounts in a single bank
public class BankSystem {
    public static void main(String[] args) {
        Bank myBank = new Bank("SBI");
        Customer bhikaPatil = new Customer("Bhika Patil", myBank);
        Customer aliceWaghmare = new Customer("Alice Waghmare", myBank);

        String aliceAcc1 = aliceWaghmare.openAccount(1000.0);
        String aliceAcc2 = aliceWaghmare.openAccount(0.0);
        String bhikaAcc1 = bhikaPatil.openAccount(500.0);

        System.out.println(aliceWaghmare.viewBalance(aliceAcc1));
        System.out.println(aliceWaghmare.deposit(aliceAcc1, 500.0));
        System.out.println(aliceWaghmare.viewBalance(aliceAcc1));
        System.out.println(aliceWaghmare.withdraw(aliceAcc1, 200.0));
        System.out.println(aliceWaghmare.viewBalance(aliceAcc1));
        System.out.println(bhikaPatil.viewBalance(bhikaAcc1));
        System.out.println(aliceWaghmare.viewBalance(aliceAcc2));
    }
}
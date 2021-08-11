package com.yasin;


public class SavingAccount extends Account {


    SavingAccount(String accountID, double balance) {
        super(accountID, balance);
        Bank.listOfAccounts.add(accountID);

    }

    @Override
    boolean withdraw(double amount) {
        if (balance-amount>=10) {
            balance -= amount - 3;
            return true;
        } else { return false; }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        if (amount > 1000) {
            balance += 10.00;
        }
    }

    double rateVar = 0;
    public double addInterest (double rate) {
        double accountInterest = balance*(rate/100);
        balance += accountInterest;
        rateVar = rate;
        return accountInterest;
    }

    public String toString() {
        return "accountID = " + accountID + " Balance= " + balance + " Interest Rate = " + rateVar;
    }




}

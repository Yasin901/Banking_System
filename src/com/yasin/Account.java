package com.yasin;

public abstract class Account {
    String accountID;
    double balance;


    Account(String accountID, double balance ) {
        this.accountID = accountID;
        this.balance = balance;
        Bank.listOfAccounts.add(this);

    }

    public String toString() {
        return "accountID = " + accountID + " Balance= " + balance;
    }

    abstract boolean withdraw (double amount);

    abstract void deposit (double amount);











}



package com.yasin;

public class CurrentAccount extends Account {

    int numberOfChecksUsed;

    CurrentAccount(String accountID, double balance, int numberOfChecksUsed) {
        super(accountID, balance);
        this.numberOfChecksUsed = numberOfChecksUsed;
        Bank.listOfAccounts.add(accountID);
    }

    @Override
    boolean withdraw(double amount) {
        if (balance-amount<0) {
            return false;
        }
        balance -= amount - 1;
        return true;
    }

    @Override
    void deposit(double amount) {
        balance += amount -1;
    }

    public void resetChecksUsed () {
        numberOfChecksUsed = 0;
    }

    public boolean withdrawUsingCheck(double amount) {
        if (balance - amount < 10) {
            return false;
        } else if (numberOfChecksUsed>3) {
            balance -= amount - 2;
            numberOfChecksUsed++;
            return true;
        } else {
            balance -= amount;
            numberOfChecksUsed++;
            return true;
        }
    }


    public String toString() {
        return "accountID = " + accountID + " Balance= " + balance + " Number of checks= " + numberOfChecksUsed;
    }



}

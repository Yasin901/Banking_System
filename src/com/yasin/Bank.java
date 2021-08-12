package com.yasin;

import java.util.ArrayList;

public class Bank {
    String bank;
    double savingsInterestRate;
    static ArrayList<Account> listOfAccounts;


    public boolean deposit(String accountID, double amount) {
        Account account = findAccount(accountID);
        if (account == null){
            return false;
        }
        account.balance += amount;
        return true;
    }


    public boolean withdraw(String accountID, double amount) {
        Account account = findAccount(accountID);
        if (account == null){
            return false;
        }
        account.balance -= amount;
        return true;
    }



    private Account findAccount(String checkAccountID) {
        for (Account account : listOfAccounts) {
            if (account.accountID.equals(checkAccountID)) {
                return account;
            }
        }
        return null;
    }



    public boolean transfer(String fromAccountID, String toAccountID, double amount) {


        Account fromAccount = findAccount(fromAccountID);
        Account toAccount = findAccount(toAccountID);
        if (fromAccount == null  || toAccount == null) {
            return false;
        }
        fromAccount.balance -= amount;
        toAccount.balance += amount;
        return true;
    }
}








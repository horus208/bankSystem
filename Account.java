package com.company;
import java.util.Date;

public class Account {
    // instance variables ---7
    private Customer accountOwner = null;
    private String accountType;
    private double balance;
    private double interestRate;
    static private long  id =1;
    private long accountId=0;
    private Date date= new Date() ;
    // constructor for the class
    public Account(Customer accountOwner, String accountType, double balance, double interestRate) {
        this.accountOwner = accountOwner;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        //this.date = date.;
        this.accountId = id;
        // this adds the account to the account list of the owner
        this.accountOwner.addAccount(accountId);
        id++;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public long getAccountId()
    {
        return this.accountId;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

    public Date getDate()
    {
        return this.date;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}

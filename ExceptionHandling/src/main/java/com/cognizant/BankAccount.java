package com.cognizant;

public class BankAccount {
  private String accountHolder;
  private long accountNumber;
  private float balance = 0;
  
  public BankAccount(long accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
  }
  
  /* Getters: */
  public String getAccountHolder() {
    return accountHolder;
  }//getAccountHolder()
  public long getAccountNumber() {
    return accountNumber;
  }//getAccountNumber()
  public float getBalance() {
    return balance;
  }//getBalance()
  
  /* Setters: */
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }//setAccountHolder()
  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }//setAccountNumber()
  public void setBalance(int balance) {
    this.balance = balance;
  }//setBalance()
  
  /* Instance methods: */
  public float checkBalance() throws NoFundsException {
    if (balance == 0) {
      throw new NoFundsException();
    }//if
    return balance;
  }//checkBalance()
  public boolean deposit(double amount) throws InvalidAmountException {
    if (amount <= 0) {
      throw new InvalidAmountException();
    }
    balance += amount;
    return true;
  }//deposit()
  public boolean withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
    if (amount <= 0) {
      throw new InvalidAmountException();
    }//if
    if (balance-amount < 0) {
      throw new InsufficientFundsException();
    }//if
    balance -= amount;
    return true;
  }//withdraw()
}//BankAccount

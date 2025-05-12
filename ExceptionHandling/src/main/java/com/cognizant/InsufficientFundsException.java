package com.cognizant;

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException() {
    super("***** Transaction failed *****".toUpperCase() + "\nInsufficient funds.");
  }
}

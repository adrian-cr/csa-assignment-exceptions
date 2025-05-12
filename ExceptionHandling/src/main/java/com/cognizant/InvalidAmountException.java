package com.cognizant;

public class InvalidAmountException extends Exception {
  public InvalidAmountException() {
    super("***** Transaction failed *****".toUpperCase() + "\nAmount cannot be zero or negative.");
  }
}

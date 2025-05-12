package com.cognizant;

public class NoFundsException extends Exception {
  
  public NoFundsException() {
    super("You have no funds at the moment.");
  }
}

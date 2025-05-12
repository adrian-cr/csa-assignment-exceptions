package com.cognizant;

import java.util.Scanner;

import static java.util.Arrays.asList;

public class BankingApp {
  
  public static void printBankingMenu() {
    System.out.println("What would you like to do today?");
    System.out.println("1. Check balance");
    System.out.println("2. Deposit funds");
    System.out.println("3. Withdraw funds");
    System.out.println("4. Exit");
  } //printBankingMenu()
  public static int getChoice() {
    int input;
    while (true) {
      try {
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if (asList(1, 2, 3, 4).contains(input)) return input;
      } catch (Exception e) {
        System.out.println("\nInvalid input. Try again.");
        continue;
      }//try-catch
      System.out.println("\nPlease enter a valid choice (1, 2, 3, 4)");
    }//while
  }//getChoice()
  public static double getAmount(String action) {
    double amount;
    while (true) {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount to " + action + ": ");
        amount = sc.nextDouble();
        return amount;
      } catch (Exception e) {
        System.out.println("Invalid input. Try again.");
      }//try-catch
    }//while
  }//getAmount()
  public static void handleChoice(int choice, BankAccount acc) {
    double amount;
    switch (choice) {
      case 1:
        System.out.println();
        try {
          System.out.println("Your balance is: $ " + acc.checkBalance());
        } catch (NoFundsException e) {
          System.out.println(e.getMessage());
        } finally {
          System.out.println();
          try {
            Thread.sleep(2000);
          } catch (Exception e) {}
        }//try-catch-finally
        break;
      case 2:
        System.out.println();
        amount = getAmount("deposit");
        try {
          acc.deposit(amount);
          System.out.println("You have added $" + amount + " to your account.");
        } catch (InvalidAmountException e) {
          System.out.println(e.getMessage());
        } finally {
          System.out.println();
          try {
            Thread.sleep(2000);
          } catch (Exception e) {}
        }//try-catch-finally
        break;
      case 3:
        amount = getAmount("withdraw");
        System.out.println();
        try {
          acc.withdraw(amount);
          System.out.println("You have withdrawn $" + amount + " from your account.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
          System.out.println(e.getMessage());
        }finally {
          System.out.println();
          try {
            Thread.sleep(2000);
          } catch (Exception e) {}//try-catch
        }//try-catch-finally
        break;
    }
  }//handleChoice()
  
  public static void main(String[] args) throws InterruptedException {
    BankAccount acct = new BankAccount(1234567890, "Ivana Partie");
    System.out.println("Welcome to your banking app, " + acct.getAccountHolder());
    
    while (true) {
      printBankingMenu();
      int choice = getChoice();
      if (choice!=4) {
        handleChoice(choice, acct);
        continue;
      }//if
      break;
    }//while
    System.out.println("Thanks for using out banking app. Goodbye! :)");
    Thread.sleep(2000);
  }//main()
}//BankingApp
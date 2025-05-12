# Assignment: Exceptions

This Java project contains the necessary functionality
to run a simple banking application that manages
customer accounts. It allows users to perform 
basic operations such as checking balances, 
depositing funds, and withdrawing funds while
handling various exceptions which ensure smooth
error handling and prevent any undesired crashes.
Here are the projects key features:

## Classes and Exceptions

* A class `com.cognizant.BankAccount` with attributes:
  * `accountNumber`
  * `accountHolder`
  * `balance`
    
  and methods:
  * `checkBalance()`
  * `deposit()`
  * `withdraw()`.
  
* Custom exceptions `InsufficientFundsException`
and `InvalidAmountException`.

## Exception Handling
* The program uses `try`-`catch` blocks to handle
scenarios where an invalid amount is entered for
deposit or withdrawal.
* `InsufficientFundsException` is thrown if the 
withdrawal amount exceeds the account balance
handling it with an detailed error message.
* The `throws` keyword is used in method signatures
where appropriate.
* `finally` blocks are implemented where necessary

## Implementation
The project can ber run from the `BankingApp`
class by executing its `main()` method.
Design a class BankAccount with the following specification :

Attributes :

accountNumber (string) : Represents the account number of the user's account
balance (double) : Represents the balance of the account
Constructor :

Implement a parameterised constructor to have the accountNmber and balance initialised while creating the object.
Methods :

deposit (double amount) : It adds the amount to the balance of the user's account.
withdraw (double amount) : It deduct the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
displayDetails() : It diplays th accuntNumber and balance of the account.

Platform:TUF

explanation:
Here's a brief explanation of the `BankAccount` class:

1. Class Declaration:  
   The class `BankAccount` models a bank account with features like deposits, withdrawals, and displaying account details.

2. Attributes :  
   - `accountNumber` (private): Stores the account number of the bank account.  
   - `balance` (private): Tracks the current balance in the account.

3. Constructor:  
   - Initializes a `BankAccount` object using the `accountNumber` and `balance` provided as parameters.

4. Methods:  
   - **`deposit(double amount)`**: Adds money to the balance if the amount is positive. Prints an error message for invalid inputs.  
   - **`withdraw(double amount)`**: Deducts money from the balance if there are sufficient funds. Otherwise, prints an "Insufficient funds!" message.  
   - **`displayDetails()`**: Displays the account number and balance in a formatted way.

5. Encapsulation:  
   - The `private` access modifier ensures the account number and balance are only accessible and modifiable through the provided methods, ensuring data security.
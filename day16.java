// BankAccount class demonstrating Encapsulation and Abstraction
class BankAccount {
    // Private data members (Encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to test the BankAccount class
public class BankApp {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("Alice", 5000);

        // Performing operations
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}

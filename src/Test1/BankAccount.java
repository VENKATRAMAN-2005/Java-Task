package Test1;

public class BankAccount {

	    // Fields are kept private to protect them from direct modification (Encapsulation)
	    private String accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = (initialBalance >= 0) ? initialBalance : 0;
	    }

	    // Getter method to read the balance without modifying it directly
	    public double getBalance() {
	        return this.balance;
	    }

	    // Getter for account number
	    public String getAccountNumber() {
	        return this.accountNumber;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            System.out.println("Successfully deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to withdraw money with validation
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else if (amount > this.balance) {
	            // Preventing withdrawal when amount exceeds available balance
	            System.out.println("Transaction Denied: Insufficient balance!");
	        } else {
	            this.balance -= amount;
	            System.out.println("Successfully withdrew: $" + amount);
	        }
	    }
	}


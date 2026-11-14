package oops;

public class Bank_account {
    private int accountNumber;
    private double balance;
    Bank_account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
}
public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Insufficient balance or invalid amount");
    }
}

public static void main(String[] args) {

    Bank_account b = new Bank_account(12345, 5000);

    System.out.println("Account Number: " + b.getAccountNumber());
    System.out.println("Initial Balance: " + b.getBalance());

    b.deposit(2000);
    b.withdraw(1000);

    System.out.println("Final Balance: " + b.getBalance());
}

}

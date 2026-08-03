package oops;

public class BankAccount {

    // ---------------- Private Data Members ----------------
    // The balance is hidden from outside the class.
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // ---------------- Setter Methods ----------------

    // Set account holder's name
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Set account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // ---------------- Getter Methods ----------------

    // Get account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // ---------------- Business Methods ----------------

    // Deposit money into the account
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // ---------------- Main Method ----------------

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount();

        // Set account details
        account.setAccountHolder("Kishore");
        account.setAccountNumber(123456789);

        // Deposit money
        account.deposit(10000);

        // Withdraw money
        account.withdraw(2500);

        // Display account details
        System.out.println("\nAccount Holder : " + account.getAccountHolder());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Current Balance : ₹" + account.getBalance());
    }
}
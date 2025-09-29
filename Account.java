package Bank_Account;

import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory; // to store transactions

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(" Account created with balance: " + balance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            String record = " Deposited: " + amount + " | Balance: " + balance;
            transactionHistory.add(record);
            System.out.println(record);
        } else {
            System.out.println(" Deposit amount must be positive.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            String record = " Withdrawn: " + amount + " | Balance: " + balance;
            transactionHistory.add(record);
            System.out.println(record);
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }

    // Transfer Method
    public void transfer(Account target, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            target.deposit(amount);
            String record = " Transferred " + amount + " to " + target.getAccountHolder();
            transactionHistory.add(record);
        } else {
            System.out.println(" Transfer failed. Check amount or balance.");
        }
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Display Account Info
    public void displayAccount() {
        System.out.println(" Account Holder: " + accountHolder);
        System.out.println(" Account Number: " + accountNumber);
        System.out.println(" Balance: " + balance);
        System.out.println("------------------------------------");
    }

    // Show Transaction History
    public void showTransactionHistory() {
        System.out.println("\n Transaction History for " + accountHolder + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
        System.out.println("------------------------------------");
    }

}

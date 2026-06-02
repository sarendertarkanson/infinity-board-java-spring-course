//package org.example.oop;
//
//class BankAccount {
//
//    protected String accountHolder;
//    protected double balance;
//
//    public BankAccount(String accountHolder, double balance) {
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposit successful. Current balance is " + amount);
//        } else {
//            System.out.println("Invalid deposit amount");
//        }
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdraw successful. Current balance is " + balance);
//        } else {
//            System.out.println("Invalid withdraw amount");
//        }
//    }
//
//    public void displayAccountInfo() {
//        System.out.println("Account Holder: " + accountHolder);
//        System.out.println("Balance: " + balance);
//    }
//}
//
//class SavingAccount extends BankAccount {
//    double interestRate;
//
//    public SavingAccount(String accountHolder, double balance, double interestRate) {
//        super(accountHolder, balance);
//        this.interestRate = interestRate;
//    }
//
//    public void calculateInterest() {
//        double interest = balance * (interestRate / 100);
//        System.out.println("Interest amount is " + interest);
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 10000) {
//            System.out.println("Withdrawal limit is exceeded for saving accounts.");
//        } else {
//            super.withdraw(amount);
//        }
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//
//        SavingAccount savingAccount = new SavingAccount("John", 1000, 5);
//
//        savingAccount.displayAccountInfo();
//        savingAccount.deposit(1000);
//        savingAccount.withdraw(10001);
//        savingAccount.calculateInterest();
//
//    }
//
//}

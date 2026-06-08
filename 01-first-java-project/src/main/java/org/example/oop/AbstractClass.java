//package org.example.oop;
//
//abstract class ABCBankAccount {
//    protected String accountHolder;
//    protected double balance;
//
//    public ABCBankAccount(String accountHolder, double balance) {
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposit successful. Current balance is: " + balance);
//        } else {
//            System.out.println("Invalid deposit amount");
//        }
//    }
//
//    public void displayAccountInfo() {
//        System.out.println("Account Holder: " + accountHolder);
//        System.out.println("Balance: " + balance);
//    }
//
//    public abstract void withdraw(double amount);
//
//}
//
//class ABCSavingAccount extends ABCBankAccount {
//
//    double interestRate;
//
//    public ABCSavingAccount(String accountHolder, double balance, double interestRate) {
//        super(accountHolder, balance);
//        this.interestRate = interestRate;
//    }
//
//    public void calculateInterest() {
//        double interest = balance * (interestRate / 100);
//        System.out.println("Interest amount: " + interest);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//
//        if (amount > 10000) {
//            System.out.println("Withdrawal limit exceeded for saving accounts");
//        } else if (amount > balance) {
//            System.out.println("Insufficient balance");
//        } else {
//            balance -= amount;
//            System.out.println("Withdrawal successful. Current balance is: " + balance);
//        }
//
//    }
//}
//
//class AbcCurrentAccount extends ABCBankAccount {
//    public AbcCurrentAccount(String accountHolder, double balance) {
//        super(accountHolder, balance);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (amount > balance) {
//            System.out.println("Insufficient balance");
//        } else {
//            balance -= amount;
//            System.out.println("Withdrawal successful. Current balance is: " + balance);
//        }
//    }
//}
//
//public class AbstractClass {
//
//    public static void main(String[] args) {
//
//        ABCBankAccount savingAccount = new ABCSavingAccount("Alpy", 5000, 5);
//        savingAccount.deposit(2000);
//        savingAccount.withdraw(6999.99);
//        savingAccount.displayAccountInfo();
//
//        System.out.println("--------------------");
//
//        ABCBankAccount currentAccount = new AbcCurrentAccount("Alpy", 5000);
//        currentAccount.deposit(2500);
//        currentAccount.withdraw(7499);
//        currentAccount.displayAccountInfo();
//    }
//
//}

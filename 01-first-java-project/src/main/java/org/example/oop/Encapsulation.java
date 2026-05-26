package org.example.oop;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount() {
        this.accountHolder = "John";
        this.balance = 1000;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println("Balance is " + bankAccount.getBalance());

        bankAccount.setBalance(2000);

        System.out.println("Balance is " + bankAccount.getBalance());


    }

}

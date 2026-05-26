package org.example.oop;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount() {
        this.accountHolder = "John";
        this.balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println("Balance is " + bankAccount.getBalance());

        bankAccount.setBalance(2000);

        System.out.println("Balance is " + bankAccount.getBalance());

        bankAccount.setBalance(-1000);


    }

}

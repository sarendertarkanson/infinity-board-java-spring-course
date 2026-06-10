package org.example.exceptions;

class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }

        if (amount > 10000) {
            throw new Exception("Deposit must be less than 10000");
        }

        balance += amount;
        System.out.println("Deposited: " + amount + " , New balance: " + balance);
    }

}

public class ExceptionHandling {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);

        try {
//            account.deposit(-5000);
            account.deposit(15000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the error.");
    }

}

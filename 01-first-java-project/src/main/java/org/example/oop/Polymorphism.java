package org.example.oop;

interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void displayAccountInfo();
}

class SavingAccount implements AccountOperations {

    protected String accountHolder;
    protected double balance;

    public SavingAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. Current balance is: " + balance);
        } else  {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdraw successful. Current balance is: " + balance);
        } else   {
            System.out.println("Invalid withdraw amount.");
        }

    }

    @Override
    public void displayAccountInfo() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);

    }
}

class CurrentAccount implements AccountOperations {
    protected String accountHolder;
    protected double balance;

    public CurrentAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;

    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. Current balance is: " + balance);
        }  else  {
            System.out.println("Invalid deposit amount.");
        }

    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            if (amount > 1000) {
                System.out.println("Withdrawal limit exceeded for saving accounts.");
            }  else  {
                balance -= amount;
                System.out.println("Withdraw successful. Current balance is: " + balance);
            }
        }  else  {
            System.out.println("Invalid withdraw amount.");
        }

    }

    @Override
    public void displayAccountInfo() {

        if (accountHolder != null) {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }

    }
}

public class Polymorphism {

    public static void main(String[] args) {


        AccountOperations savingAccount = new SavingAccount("John", 50000);
        savingAccount.displayAccountInfo();
        System.out.println("----------------------------");
        savingAccount.deposit(2000);
        savingAccount.displayAccountInfo();
        System.out.println("----------------------------");
        savingAccount.withdraw(13000);
        savingAccount.displayAccountInfo();

        System.out.println("----------------------------");

        AccountOperations currentAccount = new CurrentAccount("John", 50000);
        currentAccount.displayAccountInfo();
        System.out.println("----------------------------");
        currentAccount.deposit(3000);
        currentAccount.displayAccountInfo();
        System.out.println("----------------------------");
        currentAccount.withdraw(13000);
        currentAccount.displayAccountInfo();
    }

}

package org.example.exceptions;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class AccountFrozenException extends RuntimeException {
    public AccountFrozenException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountHolder;
    double balance;
    boolean isFrozen;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.isFrozen = false;
    }

    public void deposit(double amount) throws Exception {
        if (isFrozen) {
            throw new AccountFrozenException("Account is already frozen");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }

        balance += amount;
        System.out.println("Deposited: " + amount + " , New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (isFrozen) {
            throw new AccountFrozenException("Account is already frozen");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Your account does not have enough balance.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount + " , New balance: " + balance);
    }

    public void freezeAccount() {
        isFrozen = true;
        System.out.println("Account is now frozen.");
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("AccountStatus: " + (isFrozen ? "Frozen" : "Active"));
    }

}

public class ExceptionHandling {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);

        try {
//            account.deposit(-5000);
            account.withdraw(5001);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (AccountFrozenException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the error.");
    }

}

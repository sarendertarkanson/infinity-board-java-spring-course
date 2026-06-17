package org.example.collections;

public class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, String bankAccountNumber, double balance) {

        super(accountNumber, bankAccountNumber, balance);
    }

    public void addInterest(){
        balance += balance * 0.05;
    }

}

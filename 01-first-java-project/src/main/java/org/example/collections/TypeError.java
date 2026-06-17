package org.example.collections;

public class TypeError {

    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123", "John Doe", 1000);
//
//        SavingAccount savings = (SavingAccount) account;
//
//        savings.addInterest();

        BankAccount account = new BankAccount("123", "John Doe", 1000);

        if (account instanceof SavingAccount) {
            SavingAccount savings = (SavingAccount) account;
            savings.addInterest();
            savings.displayAccountInfo();
        } else {
            System.out.println("The account in question is not a SavingAccount. Cannot add interest.");
        }

    }

}

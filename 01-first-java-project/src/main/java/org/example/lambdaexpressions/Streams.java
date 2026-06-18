package org.example.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();

        bankAccounts.add(new BankAccount("123", "John Doe", 1000));
        bankAccounts.add(new BankAccount("456", "Jane Doe", 2000));
        bankAccounts.add(new BankAccount("789", "Jack Doe", 3000));
        bankAccounts.add(new BankAccount("789", "Marry Jane", 4000));

//        bankAccounts.stream()
//                .filter(account -> account.getBalance() > 2000)
//                .forEach(account -> {
//                    account.deposit(1);
//                    System.out.println(account.getBalance());
//                });

        bankAccounts.stream()
                .filter(account -> account.getBalance() > 2000)
                .map(account -> {
                    account.deposit(1);
                    return account;
                })
                .forEach(account -> {
                    account.displayAccountInfo();
                    System.out.println("-------------------");
                });
    }
}
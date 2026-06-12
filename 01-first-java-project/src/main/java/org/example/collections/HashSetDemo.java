package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<BankAccount> accounts = new HashSet<>();

        accounts.add(new BankAccount("123", "Alice", 1000));
        accounts.add(new BankAccount("456", "Bob", 2000));
        accounts.add(new BankAccount("123", "Charlie", 3000));

        for (int i = 0; i < accounts.size(); i++) {
            accounts.add(new BankAccount("123", "Alice", 1000));
        }

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }

    }

}

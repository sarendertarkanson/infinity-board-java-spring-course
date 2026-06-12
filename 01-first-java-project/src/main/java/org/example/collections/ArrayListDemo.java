package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount("123", "John Doe", 1000));
        accounts.add(new BankAccount("456", "Jane Doe", 2000));
        accounts.add(new BankAccount("789", "Marry Jane", 3000));

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}

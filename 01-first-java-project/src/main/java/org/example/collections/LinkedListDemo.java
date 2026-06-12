package org.example.collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<BankAccount> accounts = new LinkedList<>();

        accounts.add(new BankAccount("123", "Jane Doe", 1000));
        accounts.add(new BankAccount("456", "John Doe", 2000));
        accounts.add(new BankAccount("789", "Marry Jane", 3000));

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }

    }

}

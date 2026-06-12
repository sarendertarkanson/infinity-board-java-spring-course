package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, BankAccount> accountMap = new HashMap<>();

        accountMap.put("123", new BankAccount("123", "Alice", 1000));
        accountMap.put("456", new BankAccount("456", "Bob", 2000));
        accountMap.put("789", new BankAccount("789", "Carl", 3000));

        BankAccount bankAccount = accountMap.get("123");
        accountMap.get("123").deposit(500);
        accountMap.get("123").withdraw(250);

        for (Map.Entry<String, BankAccount> entry : accountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            entry.getValue().displayAccountInfo();
            System.out.println();
        }
    }

}

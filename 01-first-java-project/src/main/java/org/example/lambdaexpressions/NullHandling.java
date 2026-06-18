package org.example.lambdaexpressions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class NullHandling {

    public static void main(String[] args) {

//        Map<String, BankAccount> accountMap = new HashMap<>();
//
//        accountMap.put("123", new BankAccount("123", "John Doe", 2000));
//
//        BankAccount bankAccount = accountMap.get("456");
//
//        bankAccount.displayAccountInfo();

        Map<String, BankAccount> accountMap = new HashMap<>();

        accountMap.put("123", new BankAccount("123", "John Doe", 2000));

        Optional<BankAccount> optionalBankAccount = Optional.ofNullable(accountMap.get("456"));

        if (optionalBankAccount.isPresent()) {
            optionalBankAccount.get().displayAccountInfo();
        } else {
            System.out.println("Account not found");
        }

        List<BankAccount> accounts = List.of(
                new BankAccount("123", "John Doe", 1000),
                new BankAccount("456", "Jane Doe", 2000),
                new BankAccount("789", "Marry Jane", 4000)
        );

        Optional<BankAccount> result = accounts.stream()
                .filter(account -> account.getBalance() > 3000)
                .findFirst();

        result.ifPresentOrElse(account -> account.displayAccountInfo(),
                () -> System.out.println("Account with a balance greater than 3000 is not found."));

    }

}

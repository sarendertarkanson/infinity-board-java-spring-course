package org.example.lambdaexpressions;

import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456", "John Doe", 1000);

//        AccountOperation operation = new AccountOperation() {
//            @Override
//            public void perform(BankAccount account) {
//                account.deposit(200);
//                account.withdraw(100);
//                System.out.println("Final Balance: " + account.getBalance());
//            }
//        };

        AccountOperation operation = (acc) -> {
            acc.deposit(200);
            acc.withdraw(100);
            System.out.println("Final balance " + acc.getBalance());
            System.out.println("-------------------");
        };

        operation.perform(account);
        account.displayAccountInfo();

        System.out.println("-------------------");

        List<BankAccount> bankAccounts = List.of(
                new BankAccount("9876543", "Jane Doe", 2000),
                new BankAccount("123456", "John Doe", 1000),
                new BankAccount("9876543", "Marry Jane", 3000)
        );

        bankAccounts.forEach(BankAccount::displayAccountInfo);

        bankAccounts.forEach(acc -> {
            acc.deposit(1);
            acc.withdraw(2);
            acc.displayAccountInfo();
            System.out.println("--------------");
        });
    }
}

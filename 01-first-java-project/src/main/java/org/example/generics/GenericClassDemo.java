package org.example.generics;

public class GenericClassDemo {

    public static void main(String[] args) {
        Repository<BankAccount> bankAccountRepository = new Repository<>();

        bankAccountRepository.add(new BankAccount("123", "Alice", 1000));
        bankAccountRepository.add(new BankAccount("456", "Bob", 2000));
        bankAccountRepository.add(new BankAccount("789", "Carl", 3000));

        System.out.println("Bank accounts: ");
        for (BankAccount account : bankAccountRepository.getAllItems()) {
            account.displayAccountInfo();
            System.out.println();
        }

        Utility.printItem("This is a generic utility method.");
        Utility.printItem(12345);
        Utility.printItem(new BankAccount("123", "Alice", 1000));
    }

}

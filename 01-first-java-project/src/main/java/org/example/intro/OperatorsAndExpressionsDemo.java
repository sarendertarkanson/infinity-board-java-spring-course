package org.example.intro;

public class OperatorsAndExpressionsDemo {

    public static void main(String[] args){

        double price1 = 1000;
        double price2 = 500;

        double totalPrice = price1 + price2;
        double discount = 0.1 * totalPrice;
        double finalPrice = totalPrice - discount;

        System.out.println("Total price: " + finalPrice);

        int age = 25;

        boolean isAdult = age >= 18;

        System.out.println("Is Adult: " + isAdult);

        System.out.println("Eligible for voting: " + (age >= 18));

        String userName = "Admin";
        String password = "password123";

        boolean isAuthenticated = userName.equals("Admin") && password.equals("password123");

        System.out.println("Login successful: " + isAuthenticated);

    }
}

package org.example;
import java.util.Scanner;

public class InputOutput{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        System.out.print("Enter Course Price: ");

        double price = scanner.nextDouble();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("This is the course price: $" + price);

        System.out.printf("Hello, %s! You are %d years old.%n", name, age);
        System.out.printf("The course price is: $%.2f%n", price);

        scanner.close();

    }

}
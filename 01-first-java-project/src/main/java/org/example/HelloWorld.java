package org.example;

public class HelloWorld{
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int myInt = 10;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        String myString = "Hello Java!";
        System.out.println("String: " + myString);

        int num = 100;
        double doubleNum = num;

        System.out.println("Implicit type casting: " + doubleNum);

        double myDoubleValue = 9.99;
        int myIntValue = (int) myDoubleValue;

        System.out.println("Explicit type casting: " + myIntValue);


    }
}
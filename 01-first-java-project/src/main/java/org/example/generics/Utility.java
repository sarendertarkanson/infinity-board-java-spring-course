package org.example.generics;



public class Utility {

    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }
}

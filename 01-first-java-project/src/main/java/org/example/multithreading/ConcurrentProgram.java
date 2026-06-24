package org.example.multithreading;

public class ConcurrentProgram {

    public static void printCharacters() {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("ch " + " " + ch);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void printNumbers() {
        for (int i = 0; i <= 26; i++) {
            System.out.println(i + " ");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread numbersThread = new Thread( () -> printNumbers() );
        Thread charactersThread = new Thread( () -> printCharacters() );

        numbersThread.start();
        charactersThread.start();

    }

}

package org.example;

import java.util.Scanner;

public class LoopingStatements {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration " + i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println("For loop iteration " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0 to exit)");
        number = scanner.nextInt();

        while (number != 0){
            System.out.println("You entered: " + number);
            System.out.println("Enter a number to exit (0 to exit");
            number= scanner.nextInt();
        }
        System.out.println("Loop exited. You entered 0.");
        scanner.close();

        int k = 1;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
            } while (k <= 5);
    }

}

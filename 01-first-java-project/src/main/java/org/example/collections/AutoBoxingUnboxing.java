package org.example.collections;

import java.util.ArrayList;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("numbers: " + numbers);

        int sum = 0;

        for (java.lang.Integer num : numbers) {
            sum += num;
        }

        System.out.println("sum: " + sum);
    }

}

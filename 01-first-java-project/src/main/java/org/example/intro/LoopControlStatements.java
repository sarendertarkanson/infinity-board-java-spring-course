package org.example.intro;

public class LoopControlStatements {

    public static void main(String[] args) {

        int[] numbers= {10,20,30,40,50};
        int target = 30;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target found at index: " + i);
                break;
            }
        }

        for (int i=1; i<=10; i++){
            if(i%2 ==0){
                continue;
            }
            System.out.println("Odd number: " + i);
        }

    }

}

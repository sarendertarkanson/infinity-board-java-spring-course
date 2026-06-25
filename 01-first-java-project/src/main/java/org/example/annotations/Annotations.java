package org.example.annotations;

class Calculator {
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int addNew(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Annotations {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
    }

}

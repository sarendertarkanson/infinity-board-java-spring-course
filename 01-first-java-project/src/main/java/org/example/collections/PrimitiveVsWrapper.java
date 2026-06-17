package org.example.collections;

public class PrimitiveVsWrapper {

public static void main(String[] args) {

    int primitiveInt = 10;
    Integer wrapperInt = Integer.valueOf(primitiveInt);

    System.out.println("Primitive Integer: " + primitiveInt);

    System.out.println("Wrapper Integer: " + wrapperInt);

    System.out.println("Max integer value: " + Integer.MAX_VALUE);

}

}

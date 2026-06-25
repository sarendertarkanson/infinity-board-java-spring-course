package org.example.annotations;

import java.util.Arrays;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {

            Class<?> personClass = Class.forName("annotations.person");
            System.out.println("Class name: " + personClass.getName());
            System.out.println("Constructors: ");
            Arrays.stream(personClass.getConstructors()).forEach(System.out::println);

            System.out.println("Fields: ");
            Arrays.stream(personClass.getDeclaredFields()).forEach(System.out::println);

            System.out.println("Methods: ");
            Arrays.stream(personClass.getMethods()).forEach(System.out::println);

    }
}

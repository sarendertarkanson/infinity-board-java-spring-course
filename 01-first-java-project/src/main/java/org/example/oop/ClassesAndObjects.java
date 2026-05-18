package org.example.oop;

class Student {

    private String name;
    private int age;
    private String course;

    public void setDetails(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

}

public class ClassesAndObjects {

    public static void main(String[] args) {

        Student student = new Student();

        student.setDetails("John", 3, "CS");
        student.displayDetails();

    }

}

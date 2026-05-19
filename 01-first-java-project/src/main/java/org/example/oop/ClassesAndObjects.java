package org.example.oop;

class Student {

    public String name;
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

        student.setDetails("John", 39, "CS");
        student.displayDetails();

//        Student student2 = new Student();
//
//        student2.setDetails("John", 40, "CS");
        Student student2 = student;

        student2.name = "Bob";

        student.displayDetails();
        student2.displayDetails();

        student = null;
        student2 = null;

        student.displayDetails();
        student2.displayDetails();
    }

}

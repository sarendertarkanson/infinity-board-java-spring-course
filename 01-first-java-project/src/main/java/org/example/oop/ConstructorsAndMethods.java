package org.example.oop;

class User {

    public String name;
    private int age;
    private String course;

    public User() {
        this.name = "Default name";
        this.age = 18;
        this.course = "Default course";
    }

    public User(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private int calculateCourseFee(String course) {
        if (course.equalsIgnoreCase("CS 101")) {
            return 100;
        } else if (course.equalsIgnoreCase("CS 201")) {
            return 125;
        } else {
            return 0;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Course fee is " + calculateCourseFee(course));
    }

}


public class ConstructorsAndMethods {

    public static void main(String[] args) {

        User user = new User();

        user.displayDetails();

        User user2 = new User("John", 18, "TUR 101");
        user2.displayDetails();

    }



}

package org.example.intro;

public class ConditionalStatements {
    public static void main(String[] args) {

        int marks = 50;

        if (marks > 50) {
            System.out.println("You have passed the exam");
        }
        else if (marks < 50) {
            System.out.println("You have failed the exam");
        }
        else {
            System.out.println("You have scored exactly 50 marks");
        }

        int dayOfTheWeek = 10;

        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }

    }
}

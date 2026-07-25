package section02;

import java.util.Scanner;

public class LearningPackagesClub_Version2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNumber;
        int enrollCourses;
        int baseCost;
        int costPerCourse;
        int includedCourses;
        int totalCost;

        System.out.print("Which of  the packages do you want?(1,2,3)? ");
        packageNumber = keyboard.nextInt();
        System.out.print("How many courses did you enroll in this month? ");
        enrollCourses = keyboard.nextInt();

        switch (packageNumber) {
            case 1:
                baseCost = 10;
                costPerCourse = 6;
                includedCourses = 2;
                break;
            case 2:
                baseCost = 12;
                costPerCourse = 4;
                includedCourses = 4;
                break;
            case 3:
                baseCost = 15;
                costPerCourse = 3;
                includedCourses = 6;
                break;
            default:
                System.out.println("Invalid package!");
                keyboard.close();
                return;
        }
        if (enrollCourses > includedCourses) {
            totalCost = baseCost + (enrollCourses - includedCourses) * costPerCourse;
        } else {
            totalCost = baseCost;
        }
        System.out.println("Total cost is $" + totalCost);
        keyboard.close();
    }
}

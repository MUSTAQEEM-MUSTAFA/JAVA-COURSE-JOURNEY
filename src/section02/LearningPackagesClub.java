package section02;

import java.util.Scanner;

public class LearningPackagesClub {
    public static void main(String[] args) {
        int pack;
        int courses;
        int totalCost;
        int extraCourses;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which of  the packages do you want?(1,2,3)? ");
        pack = keyboard.nextInt();
        System.out.print("How many courses did you enroll in this month? ");
        courses = keyboard.nextInt();

        switch (pack) {
            case 1:
                if (courses <= 2) {
                    totalCost = 10;
                    System.out.println("Total cost is $ " + totalCost);
                } else {
                    extraCourses = courses - 2;
                    totalCost = 10 + (extraCourses * 6);
                    System.out.println("Total cost is $ " + totalCost);
                }
                break;

            case 2:
                if (courses <= 4) {
                    totalCost = 12;
                    System.out.println("Total cost is $ " + totalCost);
                } else {
                    extraCourses = courses - 4;
                    totalCost = 12 + (extraCourses * 4);
                    System.out.println("Total cost is $ " + totalCost);
                }
                break;
            case 3:
                if (courses <= 6) {
                    totalCost = 15;
                    System.out.println("Total cost is $ " + totalCost);
                } else {
                    extraCourses = courses - 6;
                    totalCost = 15 + (extraCourses * 3);
                    System.out.println("Total cost is $ " + totalCost);
                }
                break;
            default:
                System.out.println("Invalid package!");
        }
        keyboard.close();
    }
}

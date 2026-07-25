package section02;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for voting!");
        } else {
            System.out.println("Not eligible for voting!");
        }//End if-else
        System.out.println();

        for (int i = 1; i <= age; i++) {
            System.out.println(i + ". HAPPY BIRTHDAY");
            keyboard.close();
        }
    }

}

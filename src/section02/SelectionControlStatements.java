package section02;

import java.util.Scanner;

public class SelectionControlStatements {

    public static void main(String[] args) {
        int age;
        char gender;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your gender(M/F):");
        gender = keyboard.next().charAt(0);

        System.out.print("Enter your age:");
        age = keyboard.nextInt();


        if (age >= 19 && (gender == 'M' || gender == 'm')) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");

        }
        keyboard.close();
    }

}



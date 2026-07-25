package section02;

import java.util.Scanner;

public class RepetitionControlStatements {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter a number (-1 to quit):");
        number = keyboard.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Enter a number (-1 to quit):");
            number = keyboard.nextInt();

        }
        System.out.println("Total sum : " + sum);
        keyboard.close();
    }
}


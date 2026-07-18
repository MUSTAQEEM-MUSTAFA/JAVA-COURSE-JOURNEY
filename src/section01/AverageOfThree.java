package section01;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double result;

        System.out.println("Enter your first Number: ");
        num1 = keyboard.nextDouble();

        System.out.println("Enter your second Number: ");
        num2 = keyboard.nextDouble();

        System.out.println("Enter your third Number: ");
        num3 = keyboard.nextDouble();

        result = (num1 + num2 + num3) / 3;

        System.out.println("Average is: " + result);
    }
}

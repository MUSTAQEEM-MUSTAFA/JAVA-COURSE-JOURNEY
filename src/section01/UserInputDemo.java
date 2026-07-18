package section01;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double num;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();

        System.out.println("Enter a real no: ");
        num = keyboard.nextDouble();
        num *= 2;
        keyboard.nextLine();

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);
        System.out.println("Twice your number is: " + num);

    }
}

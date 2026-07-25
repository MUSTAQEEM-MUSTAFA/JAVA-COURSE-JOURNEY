package section02;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        computerNumber = random.nextInt(100) + 1;
        // Testing only
        System.out.println("Secret Number: " + computerNumber);
        do {
            System.out.println("Enter your guess (1-100): ");
            ourGuess = keyboard.nextInt();
            guessCount++;
            if (ourGuess > 100 || ourGuess < 1) {
                System.out.println("That was a wasted guess.");
                System.out.println("You must pick a number between 1 and 100, inclusive!");
            } else if (ourGuess < computerNumber) {
                System.out.println("Too low.");
            } else if (ourGuess > computerNumber) {
                System.out.println("Too high.");

            } else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the number in " + guessCount + " guesses.");
                System.out.println("Thanks for playing!");
            }
        } while (ourGuess != computerNumber);


        keyboard.close();
    }
}

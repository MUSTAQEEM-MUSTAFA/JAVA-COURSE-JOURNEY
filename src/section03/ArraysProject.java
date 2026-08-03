package section03;

import java.util.Scanner;

public class ArraysProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            myArray[i] = keyboard.nextInt();
        }

//        for(int i= 0; i < myArray.length; i++){
//            System.out.println("Result is " + ( myArray[i] * 2));
//        }

//        Enhanced for loop
        for (int num : myArray) {
            System.out.println("Result is " + (num * 2));
        }
    }
}

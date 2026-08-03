package section03;

import java.util.Scanner;
import java.util.ArrayList;

public class ParallelArraysProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        String name;
        int age;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            name = keyboard.nextLine();
            System.out.print("Enter an age: ");
            age = keyboard.nextInt();
            keyboard.nextLine();
            nameList.add(name);
            ageList.add(age);
        }


        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i) + " is " + ageList.get(i) + " years old.");
        }

    }
}

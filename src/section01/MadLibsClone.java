package section01;

import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String kingName;

        System.out.println("Enter an adjective :");
        adjective1 = keyboard.nextLine();
        System.out.println("Enter a girl's name :");
        girlsName = keyboard.nextLine();
        System.out.println("Enter another adjective :");
        adjective2 = keyboard.nextLine();
        System.out.println("Enter an occupation :");
        occupation1 = keyboard.nextLine();
        System.out.println("Enter the name of a place :");
        place = keyboard.nextLine();
        System.out.println("Enter a piece of clothing :");
        clothing = keyboard.nextLine();
        System.out.println("Enter the name of a hobby :");
        hobby = keyboard.nextLine();
        System.out.println("Enter another adjective :");
        adjective3 = keyboard.nextLine();
        System.out.println("Enter another occupation :");
        occupation2 = keyboard.nextLine();
        System.out.println("Enter a boy's name :");
        boysName = keyboard.nextLine();
        System.out.println("Enter the king's name:");
        kingName = keyboard.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a " + adjective2 + " " + occupation1 + " in the kingdom of " + place + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ".");
        System.out.println("She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boysName + ", but her father, king " + kingName + ", forbid her from seeing him.");
        keyboard.close();
    }
}

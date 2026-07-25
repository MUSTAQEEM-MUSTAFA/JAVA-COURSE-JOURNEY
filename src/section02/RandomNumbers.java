package section02;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int die;
        for (int i = 1; i <= 10; i++) {
            die = random.nextInt(6)+1;
            System.out.println("Roll " + i + ": " + die);
        }
    }
}

package section01;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;
        System.out.println("Is it rain and  warm?: " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it rain OR  warm?: " + combined);

        combined = !isRaining;
        System.out.println("It is not raining outside: " + combined);
    }
}

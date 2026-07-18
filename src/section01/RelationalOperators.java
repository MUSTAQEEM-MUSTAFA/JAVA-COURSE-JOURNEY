package section01;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yoyrBool = false;
        int myAge = 18;
        int yourAge = 20;
        int xAge = 25;
        System.out.println("My Bool is " + myBool);
        System.out.println("Your  Bool is " + yoyrBool);

        //relational operators
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge>yourAge?: " + ageComparison);
        ageComparison = myAge < xAge;
        System.out.println("myAge<xAge?: " + ageComparison);
        ageComparison = xAge == yourAge;
        System.out.println("xAge==yourAge?: " + ageComparison);


        int currentAge=19;
        boolean   ageChecker=currentAge>=21;
        System.out.println("My age is greaterthan or equal to 21 or not?:"+ageChecker);
    }
}

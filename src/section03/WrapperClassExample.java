package section03;

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> myAl = new ArrayList<>();
        myAl.add(10);
        myAl.add(20);

        for (int i = 0; i < myAl.size(); i++) {
            System.out.println(myAl.get(i));
        }

//        String someValue = "450";
//        int numericValue = Integer.parseInt(someValue);
//        numericValue += 10;
//        System.out.println(numericValue);

        String StrPi ="3.14159";
        double myPi =Double.parseDouble(StrPi);
        System.out.println(myPi);
    }
}

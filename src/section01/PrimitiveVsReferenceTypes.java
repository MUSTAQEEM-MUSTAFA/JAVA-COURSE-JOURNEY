package section01;

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {

        // Widening Conversion
        float heightFloat = 5.9f;
        double heightDouble = heightFloat;
        System.out.println("Float: " + heightFloat);
        System.out.println("Double: " + heightDouble);

// Narrowing Conversion
        double myDouble = 0.99999;
        float myFloat = (float) myDouble;
        System.out.println("Double: " + myDouble);
        System.out.println("Float: " + myFloat);
    }
}

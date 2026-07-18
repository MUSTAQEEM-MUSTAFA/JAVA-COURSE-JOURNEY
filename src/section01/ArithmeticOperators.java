package section01;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //arithmetic operators OR binary operator
        int addition = a + b;
        int subtract = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;
        System.out.println("Addition is: " + addition);
        System.out.println("subtraction  is: " + subtract);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder + '\n');
        //  compound OR arithmetic assignment operator
        addition += 90;
        subtract -= 80;
        product *= 6;
        quotient /= 5;
        remainder %= 8;
        System.out.println("Addition is now: " + addition);
        System.out.println("subtraction  is now: " + subtract);
        System.out.println("Product is now: " + product);
        System.out.println("Quotient is now: " + quotient);
        System.out.println("Remainder is now: " + remainder + '\n');

        //increment and decrement operators OR unary operators
        addition++;
        System.out.println("Final addition is:" + addition);
        subtract--;
        System.out.println("Final subtraction is:" + subtract);
    }
}

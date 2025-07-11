package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Multiplication Operator in Java.
 * Demonstrates multiplication of integers, floating-point numbers, and characters, highlighting different behaviors.
 * For characters, shows multiplication of their ASCII values.
 *
 * @author Kapil Garg
 */
public class MultiplicationOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Multiplication Operator Demo with Integers ***\n");
        multiplyIntegerValues(4, 6);
        multiplyIntegerValues(3, 7);
        multiplyIntegerValues(2, 8);

        System.out.println("\n*** Multiplication Operator Demo with Floating-Point Numbers ***\n");
        multiplyFloatingPointValues(4.5, 6.2);
        multiplyFloatingPointValues(3.4, 5.3);
        multiplyFloatingPointValues(6.1, 8.7);

        System.out.println("\n*** Multiplication Operator Demo with Characters ***\n");
        multiplyCharacterValues('A', 'R');
        multiplyCharacterValues('K', 'B');

    }

    private static void multiplyIntegerValues(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.printf("%d * %d = %d\n", firstNumber, secondNumber, result);
    }

    private static void multiplyFloatingPointValues(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("%.2f * %.2f = %.2f\n", firstNumber, secondNumber, result);
    }

    private static void multiplyCharacterValues(char firstChar, char secondChar) {
        int result = firstChar * secondChar;
        System.out.printf("Product of ASCII Values of %c & %c :: %d\n", firstChar, secondChar, result);
    }

}

package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Subtraction Operator in Java.
 * Demonstrates the subtraction of integers, floating-point numbers, and characters, highlighting different behaviors.
 * For characters, shows subtraction of their ASCII values.
 *
 * @author Kapil Garg
 */
public class SubtractionOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Subtraction Operator Demo with Integers ***\n");
        subtractIntegerValues(5, 7);
        subtractIntegerValues(2, 9);
        subtractIntegerValues(8, 6);

        System.out.println("\n*** Subtraction Operator Demo with Floating-Point Numbers ***\n");
        subtractFloatingPointValues(5.2, 8.3);
        subtractFloatingPointValues(7.3, 7.1);
        subtractFloatingPointValues(8.7, 6.6);

        System.out.println("\n*** Subtraction Operator Demo with Characters ***\n");
        subtractCharacterValues('A', 'J');
        subtractCharacterValues('K', 'D');

    }

    /**
     * Subtracts two integer values and prints the result.
     *
     * @param firstNumber  The first integer
     * @param secondNumber The second integer
     */
    private static void subtractIntegerValues(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, result);
    }

    /**
     * Subtracts two floating-point values and prints the result formatted to two decimal places.
     *
     * @param firstNumber  The first floating-point number
     * @param secondNumber The second floating-point number
     */
    private static void subtractFloatingPointValues(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.printf("%.2f - %.2f = %.2f\n", firstNumber, secondNumber, result);
    }

    /**
     * Demonstrates subtraction of two characters by showing the difference of their ASCII values.
     *
     * @param firstChar  The first character
     * @param secondChar The second character
     */
    private static void subtractCharacterValues(char firstChar, char secondChar) {
        int result = firstChar - secondChar;
        System.out.printf("Difference of ASCII values of %c & %c :: %d\n", firstChar, secondChar, result);
    }

}

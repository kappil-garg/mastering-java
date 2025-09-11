package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Addition Operator in Java.
 * Demonstrates the addition of integers, floating-point numbers, and characters, highlighting different behaviors.
 * For characters, shows both sum of ASCII values and string concatenation effects.
 *
 * @author Kapil Garg
 */
public class AdditionOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Addition Operator Demo with Integers ***\n");
        addIntegerValues(5, 7);
        addIntegerValues(2, 9);
        addIntegerValues(8, 6);

        System.out.println("\n*** Addition Operator Demo with Floating-Point Numbers ***\n");
        addFloatingPointValues(5.2, 8.3);
        addFloatingPointValues(7.3, 7.1);
        addFloatingPointValues(8.7, 6.6);

        System.out.println("\n*** Addition Operator Demo with Characters ***\n");
        addCharacterValues('D', 'A');
        addCharacterValues('A', 'V');

    }

    /**
     * Adds two integer values and prints the result.
     *
     * @param firstNumber  The first integer
     * @param secondNumber The second integer
     */
    private static void addIntegerValues(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, result);
    }

    /**
     * Adds two floating-point values and prints the result formatted to two decimal places.
     *
     * @param firstNumber  The first floating-point number
     * @param secondNumber The second floating-point number
     */
    private static void addFloatingPointValues(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.printf("%.2f + %.2f = %.2f\n", firstNumber, secondNumber, result);
    }

    /**
     * Demonstrates addition of two characters by showing both concatenation and sum of ASCII values.
     *
     * @param firstChar  The first character
     * @param secondChar The second character
     */
    private static void addCharacterValues(char firstChar, char secondChar) {
        System.out.println("Concatenated Characters :: " + firstChar + secondChar);
        System.out.printf("Sum of ASCII Values of %c & %c :: %d\n", firstChar, secondChar, (firstChar + secondChar));
    }

}

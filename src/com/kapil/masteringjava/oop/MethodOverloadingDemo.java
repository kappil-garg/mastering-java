package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Method Overloading in Java.
 * Demonstrates overloaded `add` methods with 2 and 3 parameters of type `int` and `double`.
 *
 * @author Kapil Garg
 */
public class MethodOverloadingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Method Overloading Demo (int parameters) ***\n");
        System.out.println("Sum of 5 & 7 :: " + add(5, 7));
        System.out.println("Sum of 8 & 9 :: " + add(8, 9));
        System.out.println("Sum of 7, 9 & 11 :: " + add(7, 9, 11));
        System.out.println("Sum of 2, 8 & 19 :: " + add(2, 8, 19));

        System.out.println("\n*** Method Overloading Demo (double parameters) ***\n");
        System.out.printf("Sum of 3.2 & 4.7 :: %.2f\n", add(3.2, 4.7));
        System.out.printf("Sum of 2.83 & 6.38 :: %.2f\n", add(2.83, 6.38));
        System.out.printf("Sum of 4.1, 5.9 & 7.4 :: %.2f\n", add(4.1, 5.9, 7.4));
        System.out.printf("Sum of 6.34, 3.81 & 9.23 :: %.2f\n", add(6.34, 3.81, 9.235));

    }

    /**
     * Method to add two integers showing method overloading.
     *
     * @param firstNumber  The first integer to be added.
     * @param secondNumber The second integer to be added.
     * @return The sum of the two integers.
     */
    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Method to add three integers showing method overloading.
     *
     * @param firstNumber  The first integer to be added.
     * @param secondNumber The second integer to be added.
     * @param thirdNumber  The third integer to be added.
     * @return The sum of the three integers.
     */
    private static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    /**
     * Method to add two doubles showing method overloading.
     *
     * @param firstNumber  The first double to be added.
     * @param secondNumber The second double to be added.
     * @return The sum of the two doubles.
     */
    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Method to add three doubles showing method overloading.
     *
     * @param firstNumber  The first double to be added.
     * @param secondNumber The second double to be added.
     * @param thirdNumber  The third double to be added.
     * @return The sum of the three doubles.
     */
    private static double add(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

}

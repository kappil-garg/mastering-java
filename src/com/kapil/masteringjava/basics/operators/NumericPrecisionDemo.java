package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate how int, float, and double work together in Java.
 * Demonstrates the differences in precision and behavior when performing division operations.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class NumericPrecisionDemo {

    public static void main(String[] args) {

        int intValue = 23;

        System.out.println("\n*** Integer Division Demo (int / int) ***\n");
        intDivisionDemo(intValue);

        System.out.println("\n*** Float Division Demo (int / float) ***\n");
        floatDivisionDemo(intValue);

        System.out.println("\n*** Double Division Demo (int / double) ***\n");
        doubleDivisionDemo(intValue);

        System.out.println("\n*** Demonstrating Floating-Point Division by Zero ***\n");
        floatingPointZeroDivision();

    }

    /**
     * Demonstrates integer division and prints the result.
     *
     * @param intValue The integer value to be divided
     */
    private static void intDivisionDemo(int intValue) {
        int result = intValue / 2;
        System.out.println("Integer Division :: " + intValue + " / 2 = " + result);
    }

    /**
     * Demonstrates float division and prints the results of different division scenarios.
     *
     * @param intValue The integer value to be divided
     */
    private static void floatDivisionDemo(int intValue) {
        float floatValue1 = intValue / 2;
        System.out.println("Int Division assigned to Float :: " + intValue + " / 2 = " + floatValue1);
        float floatValue2 = intValue / 2f;
        System.out.println("Float Division :: " + intValue + " / 2f = " + floatValue2);
        float floatValue3 = (float) (intValue / 2.0);
        System.out.println("Double Division result cast to Float :: (float) (" + intValue + " / 2.0) = " + floatValue3);
    }

    /**
     * Demonstrates double division and prints the results of different division scenarios.
     *
     * @param intValue The integer value to be divided
     */
    private static void doubleDivisionDemo(int intValue) {
        double doubleValue1 = intValue / 2;
        System.out.println("Int Division assigned to Double :: " + intValue + " / 2 = " + doubleValue1);
        double doubleValue2 = intValue / 2.0;
        System.out.println("Double Division :: " + intValue + " / 2.0 = " + doubleValue2);
        double doubleValue3 = intValue / 2d;
        System.out.println("Double Division with 'd' :: " + intValue + " / 2d = " + doubleValue3);
        double doubleValue4 = (double) intValue / 2;
        System.out.println("Double Division with Type Promotion :: (double) " + intValue + " / 2 = " + doubleValue4);
    }

    /**
     * Demonstrates floating-point division by zero and prints the results.
     * Shows how floating-point division by zero results in Infinity or NaN.
     */
    private static void floatingPointZeroDivision() {
        double result1 = 0.0 / 0.0;
        System.out.println("Division by Zero (Floating Point) :: 0.0 / 0.0 = " + result1);
        double result2 = 4.6 / 0.0;
        System.out.println("Division by Zero (Floating Point) :: 4.6 / 0.0 = " + result2);
    }

}

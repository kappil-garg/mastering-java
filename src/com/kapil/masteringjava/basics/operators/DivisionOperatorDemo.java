package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Division Operator in Java.
 * Demonstrates division of integers and floating-point numbers, highlighting different behaviors.
 *
 * @author Kapil Garg
 */
public class DivisionOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Division Operator Demo with Integers ***\n");
        intDivisionDemo(13, 3);
        intDivisionDemo(18, 6);
        intDivisionDemo(3, 10);
        intDivisionDemo(0, 11);
        intDivisionDemo(10, 0);

        System.out.println("\n*** Division Operator Demo with Floating-Point Numbers ***\n");
        floatDivisionDemo(20.0, 4.0);
        floatDivisionDemo(45.5, 9.0);
        floatDivisionDemo(33.3, 7.0);
        floatDivisionDemo(0.0, 11.0);
        floatDivisionDemo(10.8, 0.0);

    }

    /**
     * Demonstrates integer division and prints the result.
     * Handles division by zero by printing an appropriate message.
     *
     * @param dividend The integer dividend
     * @param divisor  The integer divisor
     */
    private static void intDivisionDemo(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide " + dividend + " by zero.");
            return;
        }
        int result = dividend / divisor;
        System.out.printf("%d / %d = %d\n", dividend, divisor, result);
    }

    /**
     * Demonstrates floating-point division and prints the result formatted to two decimal places.
     * Handles division by zero by printing an appropriate message.
     *
     * @param dividend The floating-point dividend
     * @param divisor  The floating-point divisor
     */
    private static void floatDivisionDemo(double dividend, double divisor) {
        double result = dividend / divisor;
        System.out.printf("%.2f / %.2f = %.2f\n", dividend, divisor, result);
    }

}

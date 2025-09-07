package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'double' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, and underflow of double values.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class DoubleDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Double Primitive Type Demo ***\n");

        double doubleValue = 18.19d;
        System.out.println("Declared Double Value :: " + doubleValue);

        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nMaximum Double Value :: " + maxDoubleValue);

        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("Minimum Positive Double Value :: " + minDoubleValue);

        double overflowDoubleValue = (maxDoubleValue * 2);
        System.out.println("\nDouble Overflow Example :: " + overflowDoubleValue);
        System.out.println("Is Overflow Infinite? :: " + (overflowDoubleValue == Double.POSITIVE_INFINITY));

        double underflowDoubleValue = (minDoubleValue / 2);
        System.out.println("\nDouble Underflow Example :: " + underflowDoubleValue);

        double negativeInfinityValue = -maxDoubleValue * 2;
        System.out.println("\nNegative Overflow Example :: " + negativeInfinityValue);
        System.out.println("Is Negative Overflow Infinite? :: " + (negativeInfinityValue == Double.NEGATIVE_INFINITY));

        double nanValue = 0.0 / 0.0;
        System.out.println("\nIs NaN? :: " + Double.isNaN(nanValue));

    }

}

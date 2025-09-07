package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'float' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, and underflow of float values.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class FloatDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Float Primitive Type Demo ***\n");

        float floatValue = 1.2f;
        System.out.println("Declared Float Value :: " + floatValue);

        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("\nMaximum Float Value :: " + maxFloatValue);

        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Minimum Positive Float Value :: " + minFloatValue);

        float overflowFloatValue = (maxFloatValue * 2);
        System.out.println("\nFloat Overflow Example :: " + overflowFloatValue);
        System.out.println("Is Overflow Infinite? :: " + (overflowFloatValue == Float.POSITIVE_INFINITY));

        float underflowFloatValue = (minFloatValue / 2);
        System.out.println("\nFloat Underflow Example :: " + underflowFloatValue);

        float negativeInfinityValue = -maxFloatValue * 2;
        System.out.println("\nNegative Overflow Example :: " + negativeInfinityValue);
        System.out.println("Is Negative Overflow Infinite? :: " + (negativeInfinityValue == Float.NEGATIVE_INFINITY));

        float nanValue = 0.0f / 0.0f;
        System.out.println("\nIs NaN? :: " + Float.isNaN(nanValue));

    }

}

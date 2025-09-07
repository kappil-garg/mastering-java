package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'int' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, underflow, and narrowing conversion from int to short.
 *
 * @author Kapil Garg
 */
public class IntDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Int Primitive Type Demo ***\n");

        int intValue = 1000;
        System.out.println("Declared Integer Value :: " + intValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("\nMaximum Integer Value :: " + maxIntValue);

        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Minimum Integer Value :: " + minIntValue);

        int overflowIntValue = (maxIntValue + 1);
        System.out.println("\nInteger Overflow Example :: " + overflowIntValue);

        int underflowIntValue = (minIntValue - 1);
        System.out.println("Integer Underflow Example :: " + underflowIntValue);

        int castedFromMin = (short) minIntValue;
        System.out.println("\nCasting INT.MIN_VALUE to short :: " + castedFromMin);

        int castedFromMax = (short) maxIntValue;
        System.out.println("Casting INT.MAX_VALUE to short :: " + castedFromMax);

    }

}

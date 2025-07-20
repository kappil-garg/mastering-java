package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'long' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, underflow, and narrowing conversion from long to int.
 *
 * @author Kapil Garg
 */
public class LongDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Long Primitive Type Demo ***\n");

        long longValue = 10000L;
        System.out.println("Declared Long Value :: " + longValue);

        long maxLongValue = Long.MAX_VALUE;
        System.out.println("\nMaximum Long Value :: " + maxLongValue);

        long minLongValue = Long.MIN_VALUE;
        System.out.println("Minimum Long Value :: " + minLongValue);

        long overflowLongValue = (maxLongValue + 1);
        System.out.println("\nLong Overflow Example :: " + overflowLongValue);

        long underflowLongValue = (minLongValue - 1);
        System.out.println("Long Underflow Example :: " + underflowLongValue);

        long castedFromMin = (int) minLongValue;
        System.out.println("\nCasting LONG.MIN_VALUE to int :: " + castedFromMin);

        long castedFromMax = (int) maxLongValue;
        System.out.println("Casting LONG.MAX_VALUE to int :: " + castedFromMax);

    }

}

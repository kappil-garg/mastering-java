package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'short' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, underflow, and narrowing conversion from short to byte.
 *
 * @author Kapil Garg
 */
public class ShortDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Short Primitive Type Demo ***\n");

        short shortValue = 100;
        System.out.println("Declared Short Value :: " + shortValue);

        short maxShortValue = Short.MAX_VALUE;
        System.out.println("\nMaximum Short Value :: " + maxShortValue);

        short minShortValue = Short.MIN_VALUE;
        System.out.println("Minimum Short Value :: " + minShortValue);

        short overflowShortValue = (short) (maxShortValue + 1);
        System.out.println("\nShort Overflow Example :: " + overflowShortValue);

        short underflowShortValue = (short) (minShortValue - 1);
        System.out.println("Short Underflow Example :: " + underflowShortValue);

        short castedFromMin = (byte) minShortValue;
        System.out.println("\nCasting Short.MIN_VALUE to byte :: " + castedFromMin);

        short castedFromMax = (byte) maxShortValue;
        System.out.println("Casting Short.MAX_VALUE to byte :: " + castedFromMax);

    }

}

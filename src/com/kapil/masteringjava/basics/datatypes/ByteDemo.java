package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'byte' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, and underflow of byte values.
 *
 * @author Kapil Garg
 */
public class ByteDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Byte Primitive Type Demo ***\n");

        byte byteValue = 10;
        System.out.println("Declared Byte Value :: " + byteValue);

        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("\nMaximum Byte Value :: " + maxByteValue);

        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Minimum Byte Value :: " + minByteValue);

        byte overflowByteValue = (byte) (maxByteValue + 1);
        System.out.println("\nByte Overflow Example :: " + overflowByteValue);

        byte underflowByteValue = (byte) (minByteValue - 1);
        System.out.println("Byte Underflow Example :: " + underflowByteValue);

    }

}

package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate Binary Literals in Java.
 * Demonstrates the representation of integral types using binary numbers prefixed with '0b' or '0B'.
 *
 * @author Kapil Garg
 */
public class BinaryLiteralDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Binary Literals Demo ***\n");

        byte bValue = 0b011;
        System.out.println("bValue = 0b011 :: " + bValue);

        short sValue = 0b100;
        System.out.println("sValue = 0b100 :: " + sValue);

        int iValue = 0B101;
        System.out.println("iValue = 0B101 :: " + iValue);

        long lValue = 0b110;
        System.out.println("lValue = 0b110 :: " + lValue);

    }

}

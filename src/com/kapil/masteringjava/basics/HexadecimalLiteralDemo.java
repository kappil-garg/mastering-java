package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate Hexadecimal Literals in Java.
 * Demonstrates the representation of integral types using hexadecimal numbers prefixed with '0x' or '0X'.
 *
 * @author Kapil Garg
 */
public class HexadecimalLiteralDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Hexadecimal Literals Demo ***\n");

        byte bValue = 0x03;
        System.out.println("bValue = 0x03 :: " + bValue);

        short sValue = 0x15;
        System.out.println("sValue = 0x15 :: " + sValue);

        int iValue = 0X71;
        System.out.println("iValue = 0X71 :: " + iValue);

        long lValue = 0xFF;
        System.out.println("lValue = 0xFF :: " + lValue);

    }

}

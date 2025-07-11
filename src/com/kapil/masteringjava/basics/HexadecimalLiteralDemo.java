package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate hexadecimal literals in Java.
 * Hexadecimal literals represent integer values in base 16, using the prefix '0x' or '0X'.
 *
 * @author Kapil Garg
 */
public class HexadecimalLiteralDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Hexadecimal Literals Demo ***\n");

        byte bValue = 0x03;
        System.out.println("bValue = 0x03 :: " + bValue);

        short sValue = 0x07;
        System.out.println("sValue = 0x07 :: " + sValue);

        int iValue = 0X13;
        System.out.println("iValue = 0X13 :: " + iValue);

        long lValue = 0xAB;
        System.out.println("lValue = 0xAB :: " + lValue);

    }

}

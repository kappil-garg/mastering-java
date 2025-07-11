package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate octal literals in Java.
 * Octal literals represent integer values in base 8, using a leading zero (e.g., 010).
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class OctalLiteralDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Octal Literals Demo ***\n");

        byte bValue = 013;
        System.out.println("bValue = 013 :: " + bValue);

        short sValue = 025;
        System.out.println("sValue = 025 :: " + sValue);

        int iValue = 043;
        System.out.println("iValue = 043 :: " + iValue);

        long lValue = 077;
        System.out.println("lValue = 077 :: " + lValue);

    }

}

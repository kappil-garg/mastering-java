package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'char' primitive type in Java.
 * Demonstrates variable declaration, range, overflow, and underflow of char values.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("UnnecessaryUnicodeEscape")
public class CharDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Char Primitive Type Demo ***\n");

        char charValue = 'A';
        System.out.println("Declared Character Value :: " + charValue);

        char unicodeChar = '\u0044';
        System.out.println("Unicode Character Value :: " + unicodeChar);

        char maxCharValue = Character.MAX_VALUE;
        System.out.println("\nMaximum Char Value (as char) :: " + maxCharValue);
        System.out.println("Maximum Char Value (as int) :: " + ((int) maxCharValue));

        char minCharValue = Character.MIN_VALUE;
        System.out.println("\nMinimum Char Value (as char) :: " + minCharValue);
        System.out.println("Minimum Char Value (as int) :: " + ((int) minCharValue));

        char overflowChar = (char) (maxCharValue + 1);
        System.out.println("\nChar Overflow Example :: " + ((int) overflowChar));

        char underflowChar = (char) (minCharValue - 1);
        System.out.println("Char Underflow Example :: " + ((int) underflowChar));

    }

}

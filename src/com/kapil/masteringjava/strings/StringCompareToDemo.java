package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate String Class comparison using compareTo() method in Java.
 * Demonstrates how compareTo() returns a negative, zero, or positive integer based on lexicographic ordering.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class StringCompareToDemo {

    public static void main(String[] args) {

        System.out.println("\n*** String compareTo() Method Demo ***\n");

        String s1 = "Obito";
        System.out.println("s1 :: " + s1);

        String s2 = "Obito";
        System.out.println("s2 :: " + s2);

        String s3 = "Dexter";
        System.out.println("s3 :: " + s3);

        System.out.println("\ns1.compareTo(s2) :: " + s1.compareTo(s2));
        System.out.println("s1.compareTo(s3) :: " + s1.compareTo(s3));
        System.out.println("s3.compareTo(s1) :: " + s3.compareTo(s1));
        System.out.println("s1.compareTo(\"\") :: " + s1.compareTo(""));
        System.out.println("\"\".compareTo(s2) :: " + "".compareTo(s2));

    }

}

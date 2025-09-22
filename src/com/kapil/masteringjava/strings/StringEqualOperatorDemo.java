package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate the difference between == & equals() method for String objects in Java.
 * Demonstrates the difference between reference comparison (==) and content comparison (equals()).
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class StringEqualOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** String Equal Operator Demo (== vs equals()) ***\n");

        String s1 = "Dexter Morgan";
        System.out.println("s1 :: " + s1);

        String s2 = "Dexter Morgan";
        System.out.println("s2 :: " + s2);

        String s3 =  new String("Dexter Morgan");
        System.out.println("s3 :: " + s3);

        System.out.println("\ns1 == s2 :: " + (s1 == s2));
        System.out.println("s1 == s3 :: " + (s1 == s3));
        System.out.println("s2 == s3 :: " + (s2 == s3));

        System.out.println("\ns1.equals(s2) :: " + s1.equals(s2));
        System.out.println("s1.equals(s3) :: " + s1.equals(s3));
        System.out.println("s2.equals(s3) :: " + s2.equals(s3));

    }

}

package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate Varargs in Java.
 * Demonstrates how to use variable-length arguments (varargs) in a method.
 *
 * @author Kapil Garg
 */
public class VarargsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Varargs Demo ***\n");

        System.out.println("Number of arguments passed :: 2");
        System.out.println("Sum of 3 & 4 :: " + addNumbers(3, 4));

        System.out.println("\nNumber of arguments passed :: 3");
        System.out.println("Sum of 3, 4 & 15 :: " + addNumbers(3, 4, 15));

        System.out.println("\nNumber of arguments passed :: 5");
        System.out.println("Sum of 3, 4, 15, 5 & 6 :: " + addNumbers(3, 4, 15, 5, 6));

        System.out.println("\nNumber of arguments passed :: 0");
        System.out.println("Sum with no arguments :: " + addNumbers());

    }

    /**
     * Adds a variable number of integers and returns the sum.
     *
     * @param numbers Variable number of integer arguments
     * @return The sum of the provided integers
     */
    private static int addNumbers(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

}

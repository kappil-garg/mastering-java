package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate Arrays in Java.
 * Demonstrates initialization, assignment, and iteration for both integer and double arrays.
 *
 * @author Kapil Garg
 */
public class ArrayDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Integer Array Demo ***\n");
        intArrayDemo();

        System.out.println("\n*** Double Array Demo ***\n");
        doubleArrayDemo();

    }

    /**
     * Demonstrates the creation and manipulation of an integer array.
     * Initializes an int array, prints its length, and each element in the array.
     */
    private static void intArrayDemo() {
        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 15;
        numbers[2] = 29;
        System.out.println("Integer Array Length :: " + numbers.length + "\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Integer Element at Index " + i + " :: " + numbers[i]);
        }
    }

    /**
     * Demonstrates the creation and manipulation of a double array.
     * Initializes a double array, prints its length, and each element in the array.
     */
    private static void doubleArrayDemo() {
        double[] numbers = {4.63, 15.1, 29.2};
        System.out.println("Double Array Length :: " + numbers.length + "\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Double Element at Index " + i + " :: " + numbers[i]);
        }
    }

}

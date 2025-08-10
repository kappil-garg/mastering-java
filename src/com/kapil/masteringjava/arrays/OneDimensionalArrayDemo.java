package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate One-dimensional Arrays in Java.
 * Demonstrates how to initialize and traverse integer arrays using both traditional and enhanced for loops.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class OneDimensionalArrayDemo {

    public static void main(String[] args) {

        System.out.println("\n*** One-Dimensional Array Demo (Traditional For Loop) ***\n");
        arrayWithTraditionalForLoop();

        System.out.println("\n*** One-Dimensional Array Demo (Enhanced For Loop) ***\n");
        arrayWithEnhancedForLoop();

    }

    /**
     * Demonstrates the creation and traversal of an integer array using a traditional for loop.
     * Initializes an int array with specific values and prints each element.
     */
    private static void arrayWithTraditionalForLoop() {
        int[] integerArray = new int[5];
        integerArray[0] = 3;
        integerArray[1] = 5;
        integerArray[2] = 8;
        integerArray[3] = 1;
        integerArray[4] = 2;
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates the creation and traversal of an integer array using an enhanced for loop.
     * Initializes an int array with specific values and prints each element.
     */
    private static void arrayWithEnhancedForLoop() {
        int[] integerArray = {2, 6, 7, 4, 9};
        for (int number : integerArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}

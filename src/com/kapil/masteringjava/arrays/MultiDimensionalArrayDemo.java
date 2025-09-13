package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate Multi-dimensional Arrays in Java.
 * Demonstrates how to initialize and traverse two-dimensional arrays using both traditional and enhanced for loops.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Multi-Dimensional Array Demo (Traditional For Loop) ***\n");
        arrayWithTraditionalForLoop();

        System.out.println("\n*** Multi-Dimensional Array Demo (Enhanced For Loop) ***\n");
        arrayWithEnhancedForLoop();

    }

    /**
     * Demonstrates the creation and traversal of a two-dimensional integer array using a traditional for loop.
     * Initializes a 2D int array with specific values and prints each element.
     */
    private static void arrayWithTraditionalForLoop() {
        int[][] integerArray = new int[2][3];
        integerArray[0][0] = 2;
        integerArray[0][1] = 3;
        integerArray[0][2] = 5;
        integerArray[1][0] = 8;
        integerArray[1][1] = 7;
        integerArray[1][2] = 1;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < integerArray[i].length; j++) {
                System.out.print(integerArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates the creation and traversal of a two-dimensional integer array using an enhanced for loop.
     * Initializes a 2D int array with specific values and prints each element.
     */
    private static void arrayWithEnhancedForLoop() {
        int[][] integerArray = { {2, 5, 9}, {1, 4, 7}, {3, 6, 8} };
        for (int[] numbers : integerArray) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}

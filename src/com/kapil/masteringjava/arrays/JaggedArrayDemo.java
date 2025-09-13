package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate Jagged Array in Java.
 * Demonstrates a 2D array with rows of varying lengths (non-rectangular array).
 *
 * @author Kapil Garg
 */
public class JaggedArrayDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Jagged Array Demo ***");
        jaggedArrayDemo();
    }

    /**
     * Demonstrates the creation and manipulation of a jagged array.
     * Initializes a 2D array with rows of varying lengths, prints each row's length and elements.
     */
    private static void jaggedArrayDemo() {
        int[][] jaggedArray = {{1, 3, 5}, {2, 6}, {7, 9, 3, 5}};
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("\nLength of row " + i + " :: " + jaggedArray[i].length);
            for (int number : jaggedArray[i]) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}

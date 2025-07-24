package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate how to pass an entire array to a function/method in Java.
 * Demonstrates passing a 2D array and printing its contents.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class ArrayAsParameterDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Array as a Parameter Demo ***\n");
        int[][] array = { {1, 15}, {4, 12}, {7, 11} };
        arrayAsParameterDemo(array);
    }

    private static void arrayAsParameterDemo(int[][] arrayParams) {
        for(int i = 0; i < arrayParams.length; i++) {
            for (int j = 0; arrayParams[i].length < 2; j++) {
                System.out.print(arrayParams[i][j] + " ");
            }
            System.out.println();
        }
    }

}

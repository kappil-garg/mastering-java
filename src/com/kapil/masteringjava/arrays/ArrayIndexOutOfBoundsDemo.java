package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate ArrayIndexOutOfBoundsException in Java.
 * Demonstrates what happens when you access an index beyond the valid range of an array.
 *
 * @author Kapil Garg
 */
public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Array Index Out of Bounds Demo ***\n");
        int[] array = {7, 5, 9, 13, 19};
        for (int i = 0; i < array.length; i++) {
            System.out.print("Index i = " + i + " | ");
            System.out.println("Value at (index + 1) = " + array[i + 1]); // ArrayIndexOutOfBoundsException at i = 4
        }
    }

}

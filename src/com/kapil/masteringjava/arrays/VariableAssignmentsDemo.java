package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate assignment of array references in Java.
 * Demonstrates how assigning one array variable to another affects both references.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class VariableAssignmentsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Variable Assignments Demo ***\n");

        int[] intArray = new int[4];
        int[] newArray = intArray;

        intArray[0] = 1;
        System.out.println("Value at index 0 in intArray :: " + intArray[0]);
        System.out.println("Value at index 0 in newArray :: " + newArray[0]);

        newArray[1] = 5;
        System.out.println("\nValue at index 1 in intArray :: " + intArray[1]);
        System.out.println("Value at index 1 in newArray :: " + newArray[1]);

    }

}

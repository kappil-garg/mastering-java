package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate the Enhanced 'for' loop (or for-each loop) in Java.
 * Demonstrates how the enhanced for loop simplifies array traversal by avoiding manual indexing.
 *
 * @author Kapil Garg
 */
public class EnhancedForLoopDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Enhanced For Loop Demo with String Array ***\n");
        enhancedForLoopWithStrings();

        System.out.println("\n*** Enhanced For Loop Demo with Char Array ***\n");
        enhancedForLoopWithChars();

    }

    /**
     * Demonstrates the enhanced for loop with a String array.
     * Initializes a String array with names of TV show characters and prints each name.
     */
    private static void enhancedForLoopWithStrings() {
        String[] names = {"Ted Mosby", "Obito Uchiha", "Dexter Morgan", "Jon Snow", "Klaus Mikaelson"};
        System.out.println("My Top 5 TV Show Characters of All Time:\n");
        for (String name : names) {
            System.out.println("# " + name);
        }
    }

    /**
     * Demonstrates the enhanced for loop with a char array.
     * Initializes a char array with characters and prints each character.
     */
    private static void enhancedForLoopWithChars() {
        char[] charArray = {'N', 'a', 'r', 'u', 't', 'o'};
        System.out.print("Another favorite character: ");
        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.print(" ");
        // Printing a char array directly will output all characters as a string.
        char[] array = {'U', 'z', 'u', 'm', 'a', 'k', 'i'};
        System.out.println(array);
    }

}

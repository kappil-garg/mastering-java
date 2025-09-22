package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate the usage of split() method in Java.
 * Demonstrates how to split a string into an array of substrings based on a specified delimiter.
 *
 * @author Kapil Garg
 */
public class StringSplitDemo {

    public static void main(String[] args) {

        System.out.println("\n*** String split() Demo without Limit ***\n");
        splitWithoutLimitDemo();

        System.out.println("\n*** String split() Demo with Limit ***\n");
        splitWithLimitDemo(0);
        splitWithLimitDemo(1);
        splitWithLimitDemo(2);
        splitWithLimitDemo(3);
        splitWithLimitDemo(-99);

    }

    /**
     * Demonstrates the usage of split() method without a limit.
     * Splits a string into an array of substrings based on spaces.
     */
    private static void splitWithoutLimitDemo() {
        String string = "People cannot win against their loneliness.";
        String[] array = string.split(" ");
        for (String value : array) {
            System.out.println(value);
        }
    }

    /**
     * Demonstrates the usage of split() method with a specified limit.
     * Splits a string into an array of substrings based on spaces, with a limit on the number of splits.
     *
     * @param limit the maximum number of substrings to return
     */
    private static void splitWithLimitDemo(int limit) {
        String string = "People cannot win against their loneliness.";
        String[] array = string.split(" ", limit);
        for (String value : array) {
            System.out.println(value);
        }
        System.out.println();
    }

}

package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate parsing values from String Class in Java.
 * Demonstrates parsing int and double values from String representations.
 *
 * @author Kapil Garg
 */
public class ParseValueFromStringDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Parse Integer Value From String Demo ***");
        parseIntDemo("15");
        parseIntDemo("29");

        System.out.println("\n*** Parse Double Value From String Demo ***");
        parseDoubleDemo("27");
        parseDoubleDemo("19.37");
        parseDoubleDemo("46.20");

    }

    /**
     * Demonstrates parsing an integer value from a string representation.
     *
     * @param numberAsString the string representation of the integer
     */
    private static void parseIntDemo(String numberAsString) {
        int number = Integer.parseInt(numberAsString);
        System.out.println("\nnumber : " + number);
        System.out.println("numberAsString : " + numberAsString);
        number += 5;
        numberAsString += 5;
        System.out.println("Updated number : " + number);
        System.out.println("Updated numberAsString : " + numberAsString);
    }

    /**
     * Demonstrates parsing a double value from a String representation.
     * Shows how to convert a string to a double and manipulate both the number and the string.
     *
     * @param numberAsString the string representation of the number to be parsed
     */
    private static void parseDoubleDemo(String numberAsString) {
        double number = Double.parseDouble(numberAsString);
        System.out.println("\nnumber : " + number);
        System.out.println("numberAsString : " + numberAsString);
        numberAsString += 5;
        number += 5;
        System.out.println("Updated number : " + number);
        System.out.println("Updated numberAsString : " + numberAsString);
    }

}

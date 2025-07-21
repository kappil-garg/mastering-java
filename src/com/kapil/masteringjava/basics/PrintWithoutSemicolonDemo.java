package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate how to print a statement without using a semicolon in Java.
 *
 * @author Kapil Garg
 */
public class PrintWithoutSemicolonDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Print a Statement without using a Semicolon ***\n");
        // Printing "Hello World!" without ending the statement with a semicolon
        if (System.out.format("Hello, World.\n") != null) {
            System.out.println("Statement printed Successfully.");
        } else {
            System.out.println("Statement not printed.");
        }
    }

}

package com.kapil.masteringjava.basics.datatypes;

/**
 * Program to demonstrate the usage of the 'boolean' primitive type in Java.
 * Demonstrates how boolean values can be used to represent true/false conditions.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class BooleanDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Boolean Primitive Type Demo ***\n");

        boolean isJavaFun = true;
        System.out.println("Is Java fun? :: " + isJavaFun);

        boolean canCatsFly = false;
        System.out.println("Do cats fly? :: " + canCatsFly);

        boolean comparisonResult = 10 > 5;
        System.out.println("\nIs 10 greater than 5? :: " + comparisonResult);

    }

}

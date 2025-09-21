package com.kapil.masteringjava.wrapper;

/**
 * Program to demonstrate Boxing or Wrapping in Java.
 * Demonstrates how primitive data types can be wrapped into their corresponding wrapper classes.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("UnnecessaryBoxing")
public class BoxingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Boxing Demo ***\n");

        int primitiveValue = 10;
        System.out.println("Primitive value :: " + primitiveValue);

        Integer wrappedValue = Integer.valueOf(primitiveValue);
        System.out.println("Wrapped value (Boxing) :: " + wrappedValue);

    }

}

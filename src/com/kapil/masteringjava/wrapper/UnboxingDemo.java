package com.kapil.masteringjava.wrapper;

/**
 * Program to demonstrate Unboxing or Unwrapping in Java.
 * Demonstrates how wrapper class objects can be converted back to their corresponding primitive data types.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class UnboxingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Unboxing Demo ***\n");

        Integer wrappedValue = Integer.valueOf(20);
        System.out.println("Wrapped value :: " + wrappedValue);

        int primitiveValue = wrappedValue.intValue();
        System.out.println("Primitive value (Unboxing) :: " + primitiveValue);

    }

}

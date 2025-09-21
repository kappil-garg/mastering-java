package com.kapil.masteringjava.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to demonstrate Autoboxing in Java.
 * Demonstrates how primitive data types can be automatically converted to their corresponding wrapper class objects.
 *
 * @author Kapil Garg
 */
public class AutoboxingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Autoboxing Demo ***\n");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Output List with Autoboxing :: " + numbers);

    }

}

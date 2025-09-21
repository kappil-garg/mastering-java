package com.kapil.masteringjava.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to demonstrate AutoUnboxing in Java.
 * Demonstrates how wrapper class objects can be automatically converted back to their corresponding primitive types.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class AutoUnboxingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** AutoUnboxing Demo ***\n");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);

        int num = numbers.get(0);
        System.out.println("Retrieved value using AutoUnboxing :: " + num);

    }

}

package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate that a single Java source file can contain multiple classes, each with its own main method.
 * The source file can have more than one class definition, but only one class can be public.
 *
 * @author Kapil Garg
 */
public class MultipleClassesDemo {

    public static void main(String[] args) {
        System.out.println("\nHello from Class :: MultipleClassesDemo");
        System.out.println("Source File Name :: MultipleClassesDemo.java");
    }

}

class FirstClass {

    public static void main(String[] args) {
        System.out.println("\nHello from Class :: FirstClass");
        System.out.println("Source File Name :: MultipleClassesDemo.java");
    }

}

class SecondClass {

    public static void main(String[] args) {
        System.out.println("\nHello from Class :: SecondClass");
        System.out.println("Source File Name :: MultipleClassesDemo.java");
    }

}

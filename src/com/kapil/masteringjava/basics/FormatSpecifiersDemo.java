package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate common format specifiers used with the printf method in Java.
 * Demonstrates how to format and display various data types using format specifiers.
 * The same format specifiers can be used with both printf() and format() methods.
 *
 * @author Kapil Garg
 */
public class FormatSpecifiersDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Int Demo ***");
        intDemo();

        System.out.println("\n*** Float Demo ***");
        floatingPointDemo();

        System.out.println("\n*** Char Demo ***");
        charDemo();

        System.out.println("\n*** String Demo ***");
        stringDemo();

        System.out.println("\n*** Boolean Demo ***");
        booleanDemo();

    }

    private static void intDemo() {
        int number = 14;
        System.out.printf("%n%d%n", number);
        System.out.printf("%03d%n", number);
        System.out.printf("%o%n", number);
        System.out.printf("%x%n", number);
        System.out.printf("%X%n", number);
        System.out.printf("%10d Hey%n", number);
        System.out.printf("%-10d Hello%n", number);
    }

    private static void floatingPointDemo() {
        double number = 17.267396;
        System.out.printf("%n%f%n", number);
        System.out.printf("%.2f%n", number);
        System.out.printf("%.4f%n", number);
        System.out.printf("%e%n", number);
        System.out.printf("%E%n", number);
    }

    private static void charDemo() {
        char myChar = 'a';
        System.out.printf("%n%c%n", myChar);
        System.out.printf("%C%n", myChar);
    }

    private static void stringDemo() {
        String myString = "Kapil";
        System.out.printf("%n%s%n", myString);
        System.out.printf("%S%n", myString);
        System.out.printf("%.2s%n", myString);
        System.out.printf("'%10s'%n", myString);
        System.out.printf("'%-10s'%n", myString);
        System.out.printf("%n%s, %s, %s%n", "I", "U", "C");
        System.out.printf("%3$s, %1$s, %2$s%n", "I", "U", "C");
    }

    private static void booleanDemo() {
        System.out.printf("%n%B%n", (Object) null);
        System.out.printf("%b%n", true);
        System.out.printf("%b%n", (Object) null);
        System.out.printf("%b%n", "random text");
        System.out.printf("%B%n", false);
    }

}

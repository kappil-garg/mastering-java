package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate the usage of 'this' keyword in Java.
 * Demonstrates how `this` can be used to pass the current object, return it from a method, and chain method calls.
 *
 * @author Kapil Garg
 */
public class ThisKeywordUsageDemo {

    int a, b;

    ThisKeywordUsageDemo() {
        a = 10;
        b = 20;
    }

    public static void main(String[] args) {
        ThisKeywordUsageDemo obj = new ThisKeywordUsageDemo();
        obj.passThisAsParameter();
        obj.returnThis().display();
    }

    void passThisAsParameter() {
        displayFromArgument(this);
    }

    void displayFromArgument(ThisKeywordUsageDemo obj) {
        System.out.println("\n*** Using 'this' as parameter ***\n");
        System.out.println("a = " + obj.a + " || b = " + obj.b);
    }

    ThisKeywordUsageDemo returnThis() {
        return this;
    }

    private void display() {
        System.out.println("\n*** Using 'this' returned from method ***\n");
        System.out.println("a = " + a + " || b = " + b);
    }

}

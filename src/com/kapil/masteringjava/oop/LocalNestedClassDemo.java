package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Local Nested Class in Java.
 * Demonstrates how a local nested class can access both instance and static members of its enclosing class.
 *
 * @author Kapil Garg
 */
public class LocalNestedClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Local Nested Class Demo ***\n");

        System.out.println("y :: " + LocalNestedDemo.y);

        LocalNestedDemo obj = new LocalNestedDemo();
        obj.demonstrateLocalNestedClass();
        obj.showRegularOuterMethod();

    }

}

class LocalNestedDemo {

    int x = 5;
    static int y = 8;

    void demonstrateLocalNestedClass() {
        System.out.println("Inside LocalNestedDemo :: demonstrateLocalNestedClass()");
        class LocalNestedClass {
            final int z = 3;
            void displayLocalNestedDetails() {
                System.out.println("Inside LocalNestedClass :: displayLocalNestedDetails()");
                System.out.println("x :: " + x + "\t||\ty :: " + y + "\t||\tz :: " + z);
            }
        }
        LocalNestedClass obj = new LocalNestedClass();
        obj.displayLocalNestedDetails();
        System.out.println("z :: " + obj.z);
    }

    void showRegularOuterMethod() {
        System.out.println("\nInside LocalNestedDemo :: showRegularOuterMethod()");
    }

}

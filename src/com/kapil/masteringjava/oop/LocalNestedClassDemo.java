package com.kapil.masteringjava.oop;

/**
 * Program to understand Local Nested Class in Java.
 * Demonstrates how a local nested class can access both instance and static members of its enclosing class.
 *
 * @author Kapil Garg
 */
public class LocalNestedClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Local Nested Class Demo ***\n");

        System.out.println("y :: " + LocalNestedDemo.y);

        LocalNestedDemo obj = new LocalNestedDemo();
        obj.m1();
        obj.m3();

    }

}

class LocalNestedDemo {

    int x = 5;
    static int y = 8;

    void m1() {
        System.out.println("Inside LocalNestedDemo :: m1()");
        class LocalNestedClass {
            final int z = 3;
            void m2() {
                System.out.println("Inside LocalNestedClass :: m2()");
                System.out.println("x :: " + x + "\t||\ty :: " + y + "\t||\tz :: " + z);
            }
        }
        LocalNestedClass obj = new LocalNestedClass();
        obj.m2();
        System.out.println("z :: " + obj.z);
    }

    void m3() {
        System.out.println("\nInside LocalNestedDemo :: m3()");
    }

}

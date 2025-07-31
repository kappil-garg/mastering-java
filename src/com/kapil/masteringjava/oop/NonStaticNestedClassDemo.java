package com.kapil.masteringjava.oop;

/**
 * Program to understand Non-Static Nested Class in Java.
 * Demonstrates how a non-static inner class can access both instance and static members of its outer class.
 *
 * @author Kapil Garg
 */
public class NonStaticNestedClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Non-Static Nested Class Demo ***\n");

        OuterClass outerClassObj = new OuterClass();
        outerClassObj.m1();

        OuterClass.NonStaticInnerClass innerClassObj = outerClassObj.new NonStaticInnerClass();
        innerClassObj.m2();

    }

}

class OuterClass {

    int x = 17;
    static int y = 11;

    void m1() {
        System.out.println("Inside OuterClass :: m1()");
        System.out.println("x :: " + x + "\t||\ty :: " + y);
        NonStaticInnerClass obj = new NonStaticInnerClass();
        System.out.println("z :: " + obj.z);
    }

    class NonStaticInnerClass {

        int z = 13;

        void m2() {
            System.out.println("\nInside NonStaticInnerClass :: m2()");
            System.out.println("x :: " + x + "\t||\ty :: " + y + "\t||\tz :: " + z);
        }

    }

}

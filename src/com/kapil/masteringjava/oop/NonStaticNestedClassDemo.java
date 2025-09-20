package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Non-Static Nested Class in Java.
 * Demonstrates how a non-static inner class can access both instance and static members of its outer class.
 *
 * @author Kapil Garg
 */
public class NonStaticNestedClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Non-Static Nested Class Demo ***\n");

        OuterClass outerClassObj = new OuterClass();
        outerClassObj.displayOuterDetails();

        OuterClass.NonStaticInnerClass innerClassObj = outerClassObj.new NonStaticInnerClass();
        innerClassObj.displayInnerDetails();

    }

}

class OuterClass {

    int x = 17;
    static int y = 11;

    void displayOuterDetails() {
        System.out.println("Inside OuterClass :: displayOuterDetails()");
        System.out.println("x :: " + x + "\t||\ty :: " + y);
        NonStaticInnerClass obj = new NonStaticInnerClass();
        System.out.println("z :: " + obj.z);
    }

    class NonStaticInnerClass {

        int z = 13;

        void displayInnerDetails() {
            System.out.println("\nInside NonStaticInnerClass :: displayInnerDetails()");
            System.out.println("x :: " + x + "\t||\ty :: " + y + "\t||\tz :: " + z);
        }

    }

}

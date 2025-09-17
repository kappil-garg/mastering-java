package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Blank Final Variable in Java.
 * Demonstrates initialization of blank final variables in a static block and a constructor.
 *
 * @author Kapil Garg
 */
public class BlankFinalVariableDemo {

    final int blankFinalVariable;
    final static int blankStaticFinalVariable;

    static {
        blankStaticFinalVariable = 100;
        System.out.println("\n*** Blank Final Variable Demo ***\n");
        System.out.println("From static block :: " + blankStaticFinalVariable);
    }

    BlankFinalVariableDemo() {
        blankFinalVariable = 50;
        System.out.println("From constructor :: " + blankFinalVariable);
    }

    public static void main(String[] args) {
        System.out.println("From main :: Final Blank Variable :: " + new BlankFinalVariableDemo().blankFinalVariable);
        System.out.println("From main :: Final Static Blank Variable :: " + blankStaticFinalVariable);
    }

}

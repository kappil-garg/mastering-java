package com.kapil.masteringjava.oop;

/**
 * Program to understand blank final variable in Java.
 * Demonstrates the use of blank final variables—final variables initialized later instead of at declaration.
 *
 * @author Kapil Garg
 */
public class BlankFinalVariableDemo {

    final int finalBlankVariable;
    final static int finalStaticBlankVariable;

    static {
        finalStaticBlankVariable = 100;
        System.out.println("\n*** Blank Final Variable Demo ***\n");
        System.out.println("From static block :: " + finalStaticBlankVariable);
    }

    BlankFinalVariableDemo() {
        finalBlankVariable = 50;
        System.out.println("From constructor :: " + finalBlankVariable);
    }

    public static void main(String[] args) {
        System.out.println("From main :: Final Blank Variable :: " + new BlankFinalVariableDemo().finalBlankVariable);
        System.out.println("From main :: Final Static Blank Variable :: " + finalStaticBlankVariable);
    }

}

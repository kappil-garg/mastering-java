package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate the basic switch-case in Java.
 * Demonstrates how to use switch-case statements to control the flow of execution based on specific cases.
 *
 * @author Kapil Garg
 */
public class SwitchCaseDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Switch Case Demo ***\n");
        switchCaseDemo(1);
        switchCaseDemo(0);
        switchCaseDemo(3);
        switchCaseDemo(5);
    }

    /**
     * Demonstrates a simple switch-case statement.
     * It prints different messages based on the value of caseNumber.
     *
     * @param caseNumber The number to switch on.
     */
    private static void switchCaseDemo(int caseNumber) {
        switch (caseNumber) {
            case 1:
                System.out.println("Case 1: Number is one.");
                break;
            case 3:
                System.out.println("Case 3: Number is three.");
                break;
            default:
                System.out.println("Default Case: Number is neither 1 nor 3.");
                break;
        }
    }

}

package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate the behavior of switch-case when break statements are omitted in Java.
 * Demonstrates how the flow of execution continues through later cases when a break statement is not used.
 *
 * @author Kapil Garg
 */
public class SwitchWithoutBreakDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Switch Without Break Demo ***");
        switchWithoutBreakDemo(0);
        switchWithoutBreakDemo(1);
        switchWithoutBreakDemo(8);
        switchWithoutBreakDemo(2);
        switchWithoutBreakDemo(5);
    }

    /**
     * Demonstrates the behavior of switch-case without break statements.
     * When a case is matched, execution continues through subsequent cases until a break is encountered.
     *
     * @param caseNumber The number to switch on.
     */
    private static void switchWithoutBreakDemo(int caseNumber) {
        System.out.println("\nExecuting switch case for: " + caseNumber);
        switch (caseNumber) {
            case 0:
                System.out.println("Case 0: Number is zero.");
            case 1:
                System.out.println("Case 1: Number is one.");
            case 2:
                System.out.println("Case 2: Number is two.");
                break;
            case 3:
                System.out.println("Case 3: Number is three.");
            default:
                System.out.println("Default Case: Number is not in the range of 0-3.");
                break;
        }
    }

}

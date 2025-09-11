package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Shift Operators in Java.
 * Demonstrates Signed Left Shift (<<), Signed Right Shift (>>), and Unsigned Right Shift (>>>).
 *
 * @author Kapil Garg
 */
public class ShiftOperatorsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Signed Left Shift Operator Demo ***\n");
        leftShiftOperator(8);
        leftShiftOperator(-8);

        System.out.println("\n*** Signed Right Shift Operator Demo ***\n");
        signedRightShiftOperator(8);
        signedRightShiftOperator(-8);

        System.out.println("\n*** Unsigned Right Shift Operator Demo ***\n");
        unsignedRightShiftOperator(8);
        unsignedRightShiftOperator(-8);

    }

    /**
     * Demonstrates the left shift operation by shifting the bits of the given integer to the left by 2.
     *
     * @param a The integer to be shifted
     */
    private static void leftShiftOperator(int a) {
        int result = a << 2;
        System.out.printf("%d << 2 = %d\n", a, result);
    }

    /**
     * Demonstrates the signed right shift operation by shifting the bits of the given integer to the right by 2.
     * The sign bit (leftmost bit) is preserved.
     *
     * @param a The integer to be shifted
     */
    private static void signedRightShiftOperator(int a) {
        int result = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, result);
    }

    /**
     * Demonstrates the unsigned right shift operation by shifting the bits of the given integer to the right by 2.
     * The sign bit is not preserved; zeros are filled in from the left.
     *
     * @param a The integer to be shifted
     */
    private static void unsignedRightShiftOperator(int a) {
        int result = a >>> 2;
        System.out.printf("%d >>> 2 = %d\n", a, result);
    }

}

package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Shift Operators in Java.
 * Signed Left Shift (<<), Signed Right Shift (>>), and Unsigned Right Shift (>>>).
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

    private static void leftShiftOperator(int a) {
        int result = a << 2;
        System.out.printf("%d << 2 = %d\n", a, result);
    }

    private static void signedRightShiftOperator(int a) {
        int result = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, result);
    }

    private static void unsignedRightShiftOperator(int a) {
        int result = a >>> 2;
        System.out.printf("%d >>> 2 = %d\n", a, result);
    }

}

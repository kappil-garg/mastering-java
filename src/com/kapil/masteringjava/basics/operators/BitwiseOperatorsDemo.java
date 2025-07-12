package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Bitwise AND (&), OR (|), XOR (^) & Complement (~) Operators in Java.
 *
 * @author Kapil Garg
 */
public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Bitwise AND Operator Demo ***\n");
        bitwiseAndOperator(24, 19);
        bitwiseAndOperator(17, 13);

        System.out.println("\n*** Bitwise OR Operator Demo ***\n");
        bitwiseOrOperator(24, 19);
        bitwiseOrOperator(17, 13);

        System.out.println("\n*** Bitwise XOR Operator Demo ***\n");
        bitwiseXorOperator(24, 19);
        bitwiseXorOperator(17, 13);

        System.out.println("\n*** Bitwise Complement Operator Demo ***\n");
        bitwiseComplementOperator(24);
        bitwiseComplementOperator(19);

    }

    private static void bitwiseAndOperator(int a, int b) {
        int result = a & b;
        System.out.println(a + " & " + b + " = " + result);
    }

    private static void bitwiseOrOperator(int a, int b) {
        int result = a | b;
        System.out.println(a + " | " + b + " = " + result);
    }

    private static void bitwiseXorOperator(int a, int b) {
        int result = a ^ b;
        System.out.println(a + " ^ " + b + " = " + result);
    }

    private static void bitwiseComplementOperator(int a) {
        int result = ~a;
        System.out.printf("~%d = %d (Inverts all bits)\n", a, result);
    }

}

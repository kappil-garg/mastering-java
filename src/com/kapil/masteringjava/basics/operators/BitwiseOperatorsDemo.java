package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Bitwise AND (&), OR (|), XOR (^) & Complement (~) Operators in Java.
 * Demonstrates how these operators work at the bit level.
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

    /**
     * Demonstrates the use of the bitwise AND operator to perform a bit-level AND operation between two integers.
     * Each bit in the result is set to 1 if both corresponding bits in the operands are 1; otherwise, 0.
     *
     * @param a The first integer operand
     * @param b The second integer operand
     */
    private static void bitwiseAndOperator(int a, int b) {
        int result = a & b;
        System.out.println(a + " & " + b + " = " + result);
    }

    /**
     * Demonstrates the use of the bitwise OR operator to perform a bit-level OR operation between two integers.
     * Each bit in the result is set to 1 if at least one of the corresponding bits in the operands is 1; otherwise, 0.
     *
     * @param a The first integer operand
     * @param b The second integer operand
     */
    private static void bitwiseOrOperator(int a, int b) {
        int result = a | b;
        System.out.println(a + " | " + b + " = " + result);
    }

    /**
     * Demonstrates the use of the bitwise XOR operator to perform a bit-level exclusive OR operation between two integers.
     * Each bit in the result is set to 1 if the corresponding bits in the operands are different; otherwise, 0.
     *
     * @param a The first integer operand
     * @param b The second integer operand
     */
    private static void bitwiseXorOperator(int a, int b) {
        int result = a ^ b;
        System.out.println(a + " ^ " + b + " = " + result);
    }

    /**
     * Demonstrates the use of the bitwise complement operator to invert all bits of an integer.
     * Each bit in the result is flipped: 0s become 1s and 1s become 0s.
     *
     * @param a The integer operand
     */
    private static void bitwiseComplementOperator(int a) {
        int result = ~a;
        System.out.printf("~%d = %d (Inverts all bits)\n", a, result);
    }

}

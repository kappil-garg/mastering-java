package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Modulo Operator in Java.
 * Demonstrates modulo operation on integers and floating-point numbers, highlighting different behaviors.
 *
 * @author Kapil Garg
 */
public class ModuloOperatorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Modulo Operator Demo with Integers ***\n");
        moduloOperatorWithIntegers(23, 12);
        moduloOperatorWithIntegers(12, 0);
        moduloOperatorWithIntegers(28, -6);
        moduloOperatorWithIntegers(-41, 5);

        System.out.println("\n*** Modulo Operator Demo with Floating-Point Numbers ***\n");
        moduloOperatorWithFloatingPoint(33.3, 15.5);
        moduloOperatorWithFloatingPoint(42.7, 10.0);
        moduloOperatorWithFloatingPoint(10.8, 0.0);
        moduloOperatorWithFloatingPoint(-22.4, 6.1);

    }

    private static void moduloOperatorWithIntegers(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.printf("Cannot compute %d %% %d (Modulo by Zero)\n", dividend, divisor);
            return;
        }
        int result = dividend % divisor;
        System.out.printf("%d %% %d = %d\n", dividend, divisor, result);
    }

    private static void moduloOperatorWithFloatingPoint(double dividend, double divisor) {
        if (divisor == 0.0) {
            System.out.printf("Cannot compute %.2f %% %.2f (Modulo by Zero)\n", dividend, divisor);
            return;
        }
        double result = dividend % divisor;
        System.out.printf("%.2f %% %.2f = %.2f\n", dividend, divisor, result);
    }

}

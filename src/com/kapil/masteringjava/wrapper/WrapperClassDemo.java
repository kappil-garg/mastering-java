package com.kapil.masteringjava.wrapper;

/**
 * Program to demonstrate Wrapper Classes in Java.
 * Demonstrates the use of various wrapper classes which are used to wrap primitive data types into objects.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("WrapperTypeMayBePrimitive")
public class WrapperClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Wrapper Classes Demo ***\n");

        Byte byteObj = 10;
        System.out.println("Byte Object :: " + byteObj);

        Short shortObj = 20;
        System.out.println("Short Object :: " + shortObj);

        Integer intObj = 30;
        System.out.println("Integer Object :: " + intObj);

        Long longObj = 40L;
        System.out.println("Long Object :: " + longObj);

        Float floatObj = 50.5f;
        System.out.println("\nFloat Object :: " + floatObj);

        Double doubleObj = 60.60;
        System.out.println("Double Object :: " + doubleObj);

        Character charObj = 'A';
        System.out.println("\nCharacter Object :: " + charObj);

        Boolean boolObj = true;
        System.out.println("\nBoolean Object :: " + boolObj);

    }

}

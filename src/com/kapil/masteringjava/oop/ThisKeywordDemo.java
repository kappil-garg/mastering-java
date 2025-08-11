package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate 'this' keyword in Java.
 * Demonstrates usage of 'this' to refer to the current object and to perform constructor chaining.
 *
 * @author Kapil Garg
 */
public class ThisKeywordDemo {

    public static void main(String[] args) {

        System.out.println("\n*** This Keyword Demo ***\n");

        ThisDemo obj1 = new ThisDemo(5);
        System.out.printf("x = %d || y = %d\n", obj1.getX(), obj1.getY());

        ThisDemo obj2 = new ThisDemo(7, 9);
        System.out.printf("x = %d || y = %d\n", obj2.getX(), obj2.getY());

    }

}

@SuppressWarnings("ClassCanBeRecord")
class ThisDemo {

    private final int x, y;

    public ThisDemo(int x) {
        this(x, 0);
    }

    public ThisDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

package com.kapil.masteringjava.strings;

import java.util.StringTokenizer;

/**
 * Program to demonstrate StringTokenizer Class in Java.
 * Demonstrates how to tokenize strings using StringTokenizer class by splitting input into desired tokens.
 *
 * @author Kapil Garg
 */
public class StringTokenizerDemo {

    public static void main(String[] args) {

        System.out.println("*** StringTokenizer with One Parameter ***\n");
        constructorWithOneParam();

        System.out.println("*** StringTokenizer with Two Parameters ***\n");
        constructorWithTwoParam();

        System.out.println("*** StringTokenizer with Three Parameters with Delimiters ***\n");
        constructorWithThreeParam("15+29-1*2/3", "+,*,-,/", true);
        constructorWithThreeParam("Java : Programming", " :", true);

        System.out.println("*** StringTokenizer with Three Parameters without Delimiters ***\n");
        constructorWithThreeParam("15+29-1*2/3", "+,*,-,/", false);
        constructorWithThreeParam("Java : Programming", " ", false);

    }

    /**
     * Demonstrates the usage of StringTokenizer class with one parameter.
     * It tokenizes a string using whitespace as the default delimiter.
     */
    private static void constructorWithOneParam() {
        StringTokenizer st = new StringTokenizer("Oprah wasn't built in a day.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println();
    }

    /**
     * Demonstrates the usage of StringTokenizer class with two parameters.
     * It tokenizes a string using a specified delimiter (in this case, space).
     */
    private static void constructorWithTwoParam() {
        StringTokenizer st = new StringTokenizer("Why say goodbye to the good things?", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println();
    }

    /**
     * Demonstrates the usage of StringTokenizer class with three parameters.
     * It tokenizes a string using specified delimiters and a flag indicating whether to return delimiters as tokens.
     *
     * @param inputString the string to be tokenized.
     * @param delimiter the delimiters used for tokenization.
     * @param flag if true, delimiters are returned as tokens; if false, they are not.
     */
    private static void constructorWithThreeParam(String inputString, String delimiter, boolean flag) {
        StringTokenizer st = new StringTokenizer(inputString, delimiter, flag);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println();
    }

}

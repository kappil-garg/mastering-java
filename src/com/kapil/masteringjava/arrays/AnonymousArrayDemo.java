package com.kapil.masteringjava.arrays;

/**
 * Program to demonstrate Anonymous Array in Java.
 * Demonstrates passing a Multi-dimensional anonymous array directly to a method.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class AnonymousArrayDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Anonymous Array Demo (Traditional For Loop) ***\n");
        anonymousArrayTraditionalForLoop(new String[][] { {"F", "D", "G"}, {"S", "V", "T"}, {"T", "A", "G"} });

        System.out.println("\n*** Anonymous Array Demo (Enhanced For Loop) ***\n");
        anonymousArrayEnhancedForLoop(new String[][] { {"C", "K", "B"}, {"C", "A", "R"}, {"C", "D", "T"} });

    }

    private static void anonymousArrayTraditionalForLoop(String[][] arrayParams) {
        for (int i = 0; i < arrayParams.length; i ++) {
            for (int j = 0; j < arrayParams[i].length; j++) {
                System.out.print(arrayParams[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void anonymousArrayEnhancedForLoop(String[][] arrayParams) {
        for (String[] arrayParam : arrayParams) {
            for (String value : arrayParam) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}

package org.howard.edu.lsp.midterm.question2;

/**
 * Utility class for summing numbers.
 * Provides methods to sum integers, double values, and arrays of integers.
 * 
 * @author Matthew Getachew
 * @version 1.0
 */
public class Calculator {

    /**
     * Sums two integers.
     * 
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of a and b.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     * 
     * @param a the first double.
     * @param b the second double.
     * @return the sum of a and b.
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers.
     * 
     * @param numbers the array of integers to sum.
     * @return the sum of all elements in the numbers array.
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) total += num;
        return total;
    }
}

package org.howard.edu.lsp.finalexam.question2;

/**
 * Random number generator using a simple linear congruential algorithm.
 */
public class LinearCongruentialGenerator implements RandomNumberGenerator {
    private long seed = System.currentTimeMillis();

    public int generate() {
        seed = (seed * 25214903917L + 11) & ((1L << 48) - 1);
        return (int) (seed % Integer.MAX_VALUE) + 1;
    }
}
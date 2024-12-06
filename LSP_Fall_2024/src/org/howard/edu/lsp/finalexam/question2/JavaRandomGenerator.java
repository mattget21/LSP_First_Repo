package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random class.
 */
public class JavaRandomGenerator implements RandomNumberGenerator {
    public int generate() {
        return new Random().nextInt(Integer.MAX_VALUE) + 1;
    }
}
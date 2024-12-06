package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton class for providing random number generation services.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberGenerator generator;

    // Private constructor to enforce Singleton
    private RandomNumberService() {}

    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    public void setGenerator(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public int getRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("No generator set!");
        }
        return generator.generate();
    }
}

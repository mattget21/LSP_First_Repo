package org.howard.edu.lsp.finalexam.question2;

// Strategy Interface
public interface RandomNumberGenerator {
    int generate();
}

// Implementation 1: Java's Random
import java.util.Random;

public class JavaRandomGenerator implements RandomNumberGenerator {
    public int generate() {
        return new Random().nextInt(Integer.MAX_VALUE) + 1;
    }
}

// Implementation 2: Linear Congruential Generator
public class LinearCongruentialGenerator implements RandomNumberGenerator {
    private long seed = System.currentTimeMillis();
    public int generate() {
        seed = (seed * 25214903917L + 11) & ((1L << 48) - 1);
        return (int) (seed % Integer.MAX_VALUE) + 1;
    }
}

// Singleton RandomNumberService
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberGenerator generator;

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
        return generator.generate();
    }
}

// Client
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's Random
        service.setGenerator(new JavaRandomGenerator());
        System.out.println("Java Random: " + service.getRandomNumber());

        // Use LCG
        service.setGenerator(new LinearCongruentialGenerator());
        System.out.println("LCG Random: " + service.getRandomNumber());
    }
}
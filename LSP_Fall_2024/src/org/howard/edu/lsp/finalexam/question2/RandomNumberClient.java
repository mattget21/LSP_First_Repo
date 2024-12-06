package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to demonstrate RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's Random
        service.setGenerator(new JavaRandomGenerator());
        System.out.println("Java Random: " + service.getRandomNumber());

        // Use Linear Congruential Generator
        service.setGenerator(new LinearCongruentialGenerator());
        System.out.println("LCG Random: " + service.getRandomNumber());
    }
}
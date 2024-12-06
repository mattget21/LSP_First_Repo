package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    
    @Test
    public void testFactorialPositiveNumber() {
        MathUtils utils = new MathUtils();
        assertEquals(120, utils.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        MathUtils utils = new MathUtils();
        assertEquals(1, utils.factorial(0));
    }

    @Test
    public void testFactorialNegativeNumber() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.factorial(-5));
    }

    @Test
    public void testIsPrimeTrue() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(7));
    }

    @Test
    public void testIsPrimeFalse() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(4));
    }

    @Test
    public void testIsPrimeEdgeCase() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1));
    }

    @Test
    public void testGCDNormalInputs() {
        MathUtils utils = new MathUtils();
        assertEquals(4, utils.gcd(8, 12));
    }

    @Test
    public void testGCDZeroInput() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.gcd(0, 10));
    }

    @Test
    public void testGCDBothZero() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.gcd(0, 0));
    }
}
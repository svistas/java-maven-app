package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the App class.
 */
class AppTest {

    private final App app = new App();

    @Test
    @DisplayName("greet() returns correct greeting message")
    void testGreet() {
        String result = app.greet("Alice");
        assertEquals("Hello, Alice! Welcome to the demo.", result);
    }

    @Test
    @DisplayName("add() correctly adds two numbers")
    void testAdd() {
        assertEquals(8, app.add(5, 3));
        assertEquals(0, app.add(-5, 5));
        assertEquals(-10, app.add(-5, -5));
    }

    @Test
    @DisplayName("subtract() correctly subtracts two numbers")
    void testSubtract() {
        assertEquals(2, app.subtract(5, 3));
        assertEquals(-10, app.subtract(-5, 5));
        assertEquals(0, app.subtract(-5, -5));
    }

    @Test
    @DisplayName("multiply() correctly multiplies two numbers")
    void testMultiply() {
        assertEquals(15, app.multiply(5, 3));
        assertEquals(-25, app.multiply(-5, 5));
        assertEquals(25, app.multiply(-5, -5));
    }
}


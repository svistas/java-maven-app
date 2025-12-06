package com.demo;

/**
 * A simple demo application showcasing basic Java and Maven functionality.
 */
public class App {

    public static void main(String[] args) {
        App app = new App();
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     Java Maven Demo Application        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        
        // Greet the user
        String greeting = app.greet("World");
        System.out.println(greeting);
        
        // Show some calculations
        System.out.println("\n--- Calculator Demo ---");
        System.out.println("5 + 3 = " + app.add(5, 3));
        System.out.println("10 - 4 = " + app.subtract(10, 4));
        System.out.println("6 × 7 = " + app.multiply(6, 7));
        
        // Show system info
        System.out.println("\n--- System Information ---");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("User: " + System.getProperty("user.name"));
        
        System.out.println("\n✓ Demo completed successfully!");
    }

    /**
     * Returns a greeting message.
     */
    public String greet(String name) {
        return "Hello, " + name + "! Welcome to the demo.";
    }

    /**
     * Adds two numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }
}


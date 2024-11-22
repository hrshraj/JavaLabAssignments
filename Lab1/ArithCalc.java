package lab1.java;


//Question1


import java.util.Scanner;

class Calculator {

    // Method to calculate sum
    public int add(int a, int b) {
        return a + b;
    }

    // Method to calculate product
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to calculate difference
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to calculate quotient
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

public class ArithCalc {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform operations and display the results
        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));

        try {
            System.out.println("Quotient: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

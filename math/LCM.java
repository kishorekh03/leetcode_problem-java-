package math;

import java.util.Scanner;

public class LCM {

    // Method to find the Greatest Common Divisor (GCD)
    // using the Euclidean Algorithm
    public int gcd(int a, int b) {

        // Convert negative numbers to positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Continue until remainder becomes 0
        while (b != 0) {

            // Store current value of b
            int temp = b;

            // Find remainder
            b = a % b;

            // Update a
            a = temp;
        }

        // 'a' now contains the GCD
        return a;
    }

    // Method to find the Least Common Multiple (LCM)
    public long lcm(int a, int b) {

        // LCM of 0 with any number is 0
        if (a == 0 || b == 0) {
            return 0;
        }

        // Formula:
        // LCM = (a / GCD) * b
        // Divide first to reduce the chance of integer overflow.
        return ((long) a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Read second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Create object of LCM class
        LCM obj = new LCM();

        // Calculate and print the LCM
        System.out.println("LCM = " + obj.lcm(a, b));

        // Close the scanner to free resources
        sc.close();
    }
}
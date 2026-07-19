package math;

import java.util.Scanner;

public class GCD {

    // -----------------------------
    // Brute Force Approach
    // Time Complexity: O(min(a, b))
    // Space Complexity: O(1)
    // -----------------------------
    public int bruteForce(int a, int b) {

        // Convert negative numbers to positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Edge cases
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        int min = Math.min(a, b);
        int gcd = 1;

        // Check every number from 1 to min(a, b)
        for (int i = 1; i <= min; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // -------------------------------------
    // Recursive Euclidean Algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(log(min(a, b)))
    // -------------------------------------
    public int gcdRecursive(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        // Base Case
        if (b == 0) {
            return a;
        }

        // Recursive Call
        return gcdRecursive(b, a % b);
    }

    // -------------------------------------
    // Iterative Euclidean Algorithm (Best)
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)
    // -------------------------------------
    public int gcdIterative(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        GCD obj = new GCD();

        System.out.println("\nUsing Brute Force: " + obj.bruteForce(a, b));

        System.out.println("Using Recursive Euclidean Algorithm: "
                + obj.gcdRecursive(a, b));

        System.out.println("Using Iterative Euclidean Algorithm: "
                + obj.gcdIterative(a, b));

        sc.close();
    }
}
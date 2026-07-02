package array;

import java.util.Scanner;

public class Pow {

    // Function to calculate x^n using Binary Exponentiation
    static double power(double x, int n) {

        // Convert int to long to safely handle Integer.MIN_VALUE
        long N = n;
        if( N == 0 ){
            return 1;
        }

        if( x == 0){
            return 0;
        }
        if( x == -1 & N%2 == 0){
            return 1;
        }
        if( x == -1 & N%2 != 0){
            return -1;
        }

        // If exponent is negative,
        // take the reciprocal of x and make exponent positive
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        // Initialize answer as 1
        double ans = 1.0;

        // Repeat until exponent becomes 0
        while (N > 0) {

            // If exponent is odd, multiply answer by current base
            if (N % 2 == 1) {
                ans *= x;
            }

            // Square the base
            x *= x;

            // Divide exponent by 2
            N /= 2;
        }

        // Return the final answer
        return ans;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the base value
        System.out.print("Enter the base (x): ");
        double x = sc.nextDouble();

        // Read the exponent value
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        // Call the power function
        double result = power(x, n);

        // Display the result
        System.out.println(x + "^" + n + " = " + result);

        // Close the Scanner
        sc.close();
    }
}
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        // Initialize Scanner to take input from the console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Flag variable to track if the number is prime
        boolean isPrime = true;

        // Step 1: Handle edge cases. Numbers <= 1 are not prime. beecause prime numbers start from 2.
        if (n <= 1) {
            isPrime = false;
        } else {
            /* 
               Step 2: Check for divisors from 2 up to n/2.
               We stop at n/2 because no number can be divided 
               by more than half of itself (other than itself).
            */
            for (int i = 2; i <= n / 2; i++) {
                // If 'n' is divisible by 'i', it's not a prime number
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit the loop early once a divisor is found
                }
            }
        }

        // Step 3: Final check and output
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
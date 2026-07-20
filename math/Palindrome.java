package math;

import java.util.Scanner;

public class Palindrome {

    // Method to check whether a number is palindrome
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindrome.
        // Numbers ending with 0 (except 0 itself) are also not palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Store the original number
        int original = x;

        // Variable to store the reversed number
        int reverse = 0;

        // Reverse the number
        while (x != 0) {

            // Extract the last digit
            int digit = x % 10;

            // Check for overflow
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return false;
            }

            // Build the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit
            x /= 10;
        }

        // Compare original and reversed numbers
        return original == reverse;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create object of Palindrome class
        Palindrome obj = new Palindrome();

        // Check whether the number is palindrome
        if (obj.isPalindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is Not a Palindrome.");
        }

        // Close the Scanner
        sc.close();
    }
}
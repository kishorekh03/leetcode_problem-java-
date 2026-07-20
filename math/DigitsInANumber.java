package math;

import java.util.Scanner;

public class DigitsInANumber {

    // Method to count the number of digits in a number
    public int lengthOfNumber(int n) {

        // Convert negative number to positive
        n = Math.abs(n);

        // 0 has only one digit
        if (n == 0) {
            return 1;
        }

        int count = 0;

        // Count digits by removing one digit at a time
        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Method to calculate the sum of digits
    public int sumOfDigits(int num) {

        // Convert negative number to positive
        num = Math.abs(num);

        int sum = 0;

        // Extract each digit and add it to sum
        while (num != 0) {

            int digit = num % 10; // Get last digit

            sum += digit;         // Add digit to sum

            num /= 10;            // Remove last digit
        }

        return sum;
    }

    // Method to print digits from right to left
    public void printAllNumbers(int num) {

        // Convert negative number to positive
        num = Math.abs(num);

        // Special case for 0
        if (num == 0) {
            System.out.println(0);
            return;
        }

        // Print each digit
        while (num != 0) {

            int digit = num % 10; // Extract last digit

            System.out.println(digit);

            num /= 10;            // Remove last digit
        }
    }

    // Reverse Integer (LeetCode 7) with overflow check
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            // Extract last digit
            int digit = x % 10;

            // Check positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Append digit
            rev = rev * 10 + digit;

            // Remove last digit
            x /= 10;
        }

        return rev;
    }

    // Reverse number (without overflow check)
    public int reverseNumber(int num) {

        // Convert negative number to positive
        num = Math.abs(num);

        int reverse = 0;

        while (num != 0) {

            int digit = num % 10; // Extract last digit

            reverse = reverse * 10 + digit; // Append digit

            num /= 10; // Remove last digit
        }

        return reverse;
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create object
        DigitsInANumber obj = new DigitsInANumber();

        // Length of number
        System.out.println("\nLength of Number: " + obj.lengthOfNumber(number));

        // Sum of digits
        System.out.println("Sum of Digits: " + obj.sumOfDigits(number));

        // Print digits
        System.out.println("Digits (Right to Left):");
        obj.printAllNumbers(number);

        // Reverse without overflow check
        System.out.println("Reverse Number: " + obj.reverseNumber(number));

        // Reverse with overflow check (LeetCode 7)
        System.out.println("Reverse Integer (LeetCode): " + obj.reverse(number));

        // Close scanner
        sc.close();
    }
}
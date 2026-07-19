package math;

import java.util.Scanner;

public class DigitsInANumber {

    // Count the number of digits
    public int lengthOfNumber(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Find the sum of digits
    public int sumOfDigits(int num) {

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    // Print all digits (Right to Left)
    public void printAllNumbers(int num) {

        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        DigitsInANumber obj = new DigitsInANumber();

        System.out.println("\nLength of Number: " + obj.lengthOfNumber(number));

        System.out.println("Sum of Digits: " + obj.sumOfDigits(number));

        System.out.println("Digits (Right to Left):");
        obj.printAllNumbers(number);

        sc.close();
    }
}
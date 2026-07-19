package math;

import java.util.Scanner;

public class ArmstrongNumber {

    // Method to count the number of digits
    public int lengthOfNumber(int n) {

        if (n == 0) {
            return 1;
        }

        n = Math.abs(n);

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Method to check Armstrong Number
    public boolean isArmstrongNumber(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int length = lengthOfNumber(number);
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            // Raise digit to the power of number of digits
            sum += (int) Math.pow(digit, length);

            // Remove the last digit
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        ArmstrongNumber obj = new ArmstrongNumber();

        if (obj.isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
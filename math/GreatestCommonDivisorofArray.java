package math;

public class GreatestCommonDivisorofArray {

    // Function to find GCD using the Iterative Euclidean Algorithm
    public int gcdIterative(int a, int b) {

        // Continue until the second number becomes 0
        while (b != 0) {

            // Store the current value of b
            int temp = b;

            // Find the remainder
            b = a % b;

            // Update a with the previous value of b
            a = temp;
        }

        // When b becomes 0, a contains the GCD
        return a;
    }

    // Function to find the GCD of the smallest and largest elements
    public int findGCD(int[] nums) {

        // Assume the first element is both the minimum and maximum
        int min = nums[0];
        int max = nums[0];

        // Traverse the array to find the minimum and maximum values
        for (int num : nums) {

            // Update minimum value
            min = Math.min(min, num);

            // Update maximum value
            max = Math.max(max, num);
        }

        // Find and return the GCD of the minimum and maximum values
        return gcdIterative(min, max);
    }

    public static void main(String[] args) {

        GreatestCommonDivisorofArray obj = new GreatestCommonDivisorofArray();

        // Input array
        int[] nums = {2, 5, 6, 9, 10};

        // Call the function
        int ans = obj.findGCD(nums);

        // Print the result
        System.out.println("Greatest Common Divisor = " + ans);
    }
}
package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // Brute Force Approach
    // Time Complexity: O(n²)
    // Space Complexity: O(n)
    public int[] bruteForce(int[] nums) {

        int[] product = new int[nums.length];

        // Calculate product for every index
        for (int i = 0; i < nums.length; i++) {

            int total = 1;

            // Multiply all elements except nums[i]
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    total *= nums[j];
                }
            }

            product[i] = total;
        }

        return product;
    }

    // Optimal Approach (Prefix + Suffix Products)
    // Time Complexity: O(n)
    // Space Complexity: O(1) (excluding output array)
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // ---------------- Prefix Products ----------------
        // answer[i] stores the product of all elements to the left of i
        answer[0] = 1; // No elements on the left of index 0

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // ---------------- Suffix Products ----------------
        // suffix stores the product of all elements to the right
        int suffix = 1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Multiply left product with right product
            answer[i] *= suffix;

            // Update suffix for the next iteration
            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        System.out.println("Brute Force : " + Arrays.toString(obj.bruteForce(nums)));
        System.out.println("Optimal     : " + Arrays.toString(obj.productExceptSelf(nums)));
    }
}
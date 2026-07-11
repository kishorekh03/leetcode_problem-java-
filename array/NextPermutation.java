package array;

import java.util.Arrays;

public class NextPermutation {

    // Function to find the next lexicographically greater permutation
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // -------------------------------
        // Step 1: Find the Pivot
        // -------------------------------
        // Traverse from right to left and find the first element
        // that is smaller than the element next to it.
        int pivotIndex = n - 2;

        while (pivotIndex >= 0 && nums[pivotIndex] >= nums[pivotIndex + 1]) {
            pivotIndex--;
        }

        // -------------------------------
        // Step 2: Swap with the Next Greater Element
        // -------------------------------
        // If a pivot is found, find the first element from the right
        // that is greater than the pivot and swap them.
        if (pivotIndex >= 0) {

            int nextGreaterIndex = n - 1;

            while (nums[nextGreaterIndex] <= nums[pivotIndex]) {
                nextGreaterIndex--;
            }

            swap(nums, pivotIndex, nextGreaterIndex);
        }

        // -------------------------------
        // Step 3: Reverse the Suffix
        // -------------------------------
        // Reverse all elements after the pivot
        // to get the smallest possible arrangement.
        reverse(nums, pivotIndex + 1, n - 1);
    }

    // Function to swap two elements
    private void swap(int[] nums, int firstIndex, int secondIndex) {

        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    // Function to reverse a part of the array
    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            swap(nums, left, right);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        NextPermutation obj = new NextPermutation();

        System.out.println("Before: " + Arrays.toString(nums));

        obj.nextPermutation(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }
}
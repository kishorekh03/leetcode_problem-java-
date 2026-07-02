package array;

public class Pair_sum {

    // Brute Force Approach works for both sorted and unsorted array
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Two Pointer Approach 
    // Works only for sorted arrays
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    int[] twoPointer(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {
                return new int[]{start, end};
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        Pair_sum obj = new Pair_sum();

        // Unsorted array for Brute Force
        int[] arr1 = {3, 2, 4};
        int target1 = 6;

        int[] result = obj.twoSum(arr1, target1);

        if (result.length == 2) {
            System.out.println("Brute Force: [" +
                    result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found");
        }

        // Sorted array for Two Pointer
        int[] arr2 = {2, 3, 4, 7, 11, 15};
        int target2 = 9;

        int[] result1 = obj.twoPointer(arr2, target2);

        if (result1.length == 2) {
            System.out.println("Two Pointer: [" +
                    result1[0] + ", " + result1[1] + "]");
        } else {
            System.out.println("No pair found");
        }
    }
}
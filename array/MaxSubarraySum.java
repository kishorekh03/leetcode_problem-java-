package array;

public class MaxSubarraySum {

    // Brute force approach to find the maximum subarray sum , Time Complexity: O(n^2)
    int bruteForceMaxSubarraySum(int[] arr) {

        // Store the maximum sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Choose the starting index of the subarray
        for (int start = 0; start < arr.length; start++) {

            // Stores sum of subarray starting from index 'start'
            int currentSum = 0;

            // Choose the ending index of the subarray
            for (int end = start; end < arr.length; end++) {

                // Add current element to subarray sum
                currentSum += arr[end];

                // Update maxSum if currentSum is greater
                maxSum = Math.max(currentSum, maxSum);
            }
        }

        // Return the largest subarray sum
        return maxSum;
    }

    // Print all possible subarrays
    void printAllSubarrays(int[] arr) {

        // Select starting index
        for (int start = 0; start < arr.length; start++) {

            // Select ending index
            for (int end = start; end < arr.length; end++) {

                // Print subarray from index start to end
                System.out.println(
                    java.util.Arrays.toString(
                        java.util.Arrays.copyOfRange(arr, start, end + 1)
                    )
                );
            }
        }
    }
    int kadaneMaxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize to smallest integer
        int currentSum = 0; // This will store the sum of the current subarray

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Add current element to currentSum

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);

            // If currentSum drops below 0, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-1, -2, -3, -4, -5};

        MaxSubarraySum obj = new MaxSubarraySum();

        // Call brute force method and store result
        int maxSum = obj.bruteForceMaxSubarraySum(arr);

        System.out.println("Maximum subarray sum is: " + maxSum);
        // System.out.println("All subarrays:");
        // obj.printAllSubarrays(arr);
        int maxSumKadane=obj.kadaneMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum using Kadane's algorithm is: " + maxSumKadane);

    
    }
}

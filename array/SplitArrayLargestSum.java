package array;

public class SplitArrayLargestSum {

    // Checks whether it is possible to split the array into
    // at most k subarrays such that each subarray sum
    // does not exceed maxSum.
    public boolean isValid(int[] nums, int k, int maxSum) {

        // Start with one subarray
        int subarrays = 1;

        // Stores the sum of the current subarray
        int currentSum = 0;

        for (int num : nums) {

            // If a single element is greater than maxSum,
            // then maxSum can never be a valid answer.
            if (num > maxSum) {
                return false;
            }

            // Add the current element to the current subarray
            // if it does not exceed the allowed maximum sum.
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {

                // Otherwise, create a new subarray.
                subarrays++;

                // Start the new subarray with the current element.
                currentSum = num;
            }
        }

        // Valid if the required number of subarrays
        // is less than or equal to k.
        return subarrays <= k;
    }

    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // Search space:
        // start = largest element (minimum possible answer)
        // end = sum of all elements (maximum possible answer)
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // Stores the minimum possible largest subarray sum
        int answer = end;

        // Binary Search on the answer
        while (start <= end) {

            // Candidate maximum subarray sum
            int mid = start + (end - start) / 2;

            // Check if we can split the array using this value
            if (isValid(nums, k, mid)) {

                // Current value is a valid answer
                answer = mid;

                // Try to find a smaller valid answer
                end = mid - 1;

            } else {

                // Current value is too small.
                // Increase the allowed maximum sum.
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        SplitArrayLargestSum obj = new SplitArrayLargestSum();

        int[] nums1 = {7, 2, 5, 10, 8};
        int k1 = 2;

        System.out.println(obj.splitArray(nums1, k1)); // Output: 18

        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;

        System.out.println(obj.splitArray(nums2, k2)); // Output: 9
    }
}
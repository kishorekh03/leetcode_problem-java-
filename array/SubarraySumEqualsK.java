package array;

import java.util.HashMap;

public class SubarraySumEqualsK {

    // ==========================================================
    // Brute Force Approach
    // Time Complexity  : O(n²)
    // Space Complexity : O(1)
    // ==========================================================
    public int bruteForce(int[] nums, int k) {

        int count = 0;

        // Choose starting index
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            // Extend subarray
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                // Check whether sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // ==========================================================
    // Optimal Approach (Prefix Sum + HashMap)
    // Time Complexity  : O(n)
    // Space Complexity : O(n)
    // ==========================================================
    public int subarraySum(int[] nums, int k) {

        // Stores (Prefix Sum -> Frequency)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Update prefix sum
            prefixSum += nums[i];

            // Required previous prefix sum
            int remove = prefixSum - k;

            // If found, increase answer
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }

            // Store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    // ==========================================================
    // Main Method
    // ==========================================================
    public static void main(String[] args) {

        SubarraySumEqualsK obj = new SubarraySumEqualsK();

        int[] nums = {1, 1, 1};

        int k = 2;

        System.out.println("Brute Force Answer : " + obj.bruteForce(nums, k));

        System.out.println("Optimal Answer     : " + obj.subarraySum(nums, k));
    }
}
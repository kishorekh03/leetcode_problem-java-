package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    // ==========================================================
    // Four Sum - Two Pointer Approach
    // Time Complexity  : O(n³)
    // Space Complexity : O(1) (excluding output list)
    // ==========================================================
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // Sort the array
        Arrays.sort(nums);

        // Stores the answer
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        // Fix first element
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Fix second element
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                // Two pointers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    // Use long to avoid integer overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    }
                    else if (sum > target) {
                        right--;
                    }
                    else {

                        // Quadruplet found
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        // Skip duplicate right values
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }

        return ans;
    }

    // ==========================================================
    // Main Method
    // ==========================================================
    public static void main(String[] args) {

        FourSum obj = new FourSum();

        int[] nums = {1, 0, -1, 0, -2, 2};

        int target = 0;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));

        System.out.println("\nFour Sum:");
        System.out.println(obj.fourSum(nums, target));
    }
}
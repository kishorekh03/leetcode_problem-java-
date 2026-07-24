package array;

import java.util.*;

public class ThreeSum {

    // ==========================================================
    // Brute Force Approach
    // Time Complexity  : O(n^3)
    // Space Complexity : O(k) -> Stores unique triplets
    // ==========================================================
    public List<List<Integer>> bruteForce(int[] nums) {

        // Stores unique triplets
        HashSet<List<Integer>> set = new HashSet<>();

        // Choose the first element
        for (int i = 0; i < nums.length - 2; i++) {

            // Choose the second element
            for (int j = i + 1; j < nums.length - 1; j++) {

                // Choose the third element
                for (int k = j + 1; k < nums.length; k++) {

                    // Check whether the sum is zero
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = new ArrayList<>();

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        // Sort so duplicate triplets look identical
                        Collections.sort(triplet);

                        // HashSet automatically removes duplicates
                        set.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    // ==========================================================
    // HashMap Approach
    // Time Complexity  : O(n^2)
    // Space Complexity : O(n)
    // ==========================================================
    public List<List<Integer>> hashMapApproach(int[] nums) {

        // Stores unique triplets
        HashSet<List<Integer>> set = new HashSet<>();

        // Fix the first element
        for (int i = 0; i < nums.length - 2; i++) {

            // New HashMap for every first element
            HashMap<Integer, Integer> map = new HashMap<>();

            // Find the remaining two elements
            for (int j = i + 1; j < nums.length; j++) {

                // Third number required to make sum = 0
                int third = -(nums[i] + nums[j]);

                // If third number already exists
                if (map.containsKey(third)) {

                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third);

                    // Sort so duplicates become identical
                    Collections.sort(triplet);

                    set.add(triplet);
                }

                // Store current element
                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(set);
    }

    // ==========================================================
    // Two Pointer Approach (Optimal)
    // Time Complexity  : O(n^2)
    // Space Complexity : O(1) (Ignoring output list)
    // ==========================================================
    public List<List<Integer>> threeSum(int[] nums) {

        // Sort the array
        Arrays.sort(nums);

        // Stores the final answer
        List<List<Integer>> ans = new ArrayList<>();

        // Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Sum is too small
                if (sum < 0) {
                    left++;
                }

                // Sum is too large
                else if (sum > 0) {
                    right--;
                }

                // Triplet found
                else {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers
                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
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

        ThreeSum obj = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));

        System.out.println("\nBrute Force Approach:");
        System.out.println(obj.bruteForce(nums));

        System.out.println("\nHashMap Approach:");
        System.out.println(obj.hashMapApproach(nums));

        System.out.println("\nTwo Pointer Approach (Optimal):");
        System.out.println(obj.threeSum(nums));
    }
}
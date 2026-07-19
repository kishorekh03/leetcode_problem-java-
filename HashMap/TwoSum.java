package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store (number -> index)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the number needed to reach the target
            int complement = target - nums[i];

            // If the complement already exists in the map,
            // we have found the answer
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // No solution found
        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));

        if (result.length == 2) {
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]]
                    + " = " + target);
        }
    }
}
package HashSet;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        // If the array is empty, there is no consecutive sequence.
        if (nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store all unique numbers.
        // HashSet provides O(1) average time for contains() lookup.
        HashSet<Integer> set = new HashSet<>();

        // Insert every number from the array into the HashSet.
        // Duplicate values are automatically removed.
        for (int num : nums) {
            set.add(num);
        }

        // Stores the length of the longest consecutive sequence found.
        int longest = 0;

        // Traverse every unique number in the HashSet.
        for (int num : set) {

            // Check if the current number is the START of a sequence.
            //
            // Example:
            // Sequence: 1,2,3,4
            //
            // num = 1
            // 0 does not exist -> Start of sequence ✔
            //
            // num = 2
            // 1 exists -> Not the start ✘
            //
            // num = 3
            // 2 exists -> Not the start ✘
            //
            // num = 4
            // 3 exists -> Not the start ✘
            //
            // We only start counting from the FIRST element of every sequence.
            if (!set.contains(num - 1)) {

                // current stores the current number while traversing
                // through the consecutive sequence.
                int current = num;

                // Every sequence starts with at least one number,
                // so initialize length as 1.
                int length = 1;

                // Continue checking whether the next consecutive
                // number exists in the HashSet.
                //
                // Example:
                // current = 1
                // Check 2 -> exists ✔
                // current = 2
                // Check 3 -> exists ✔
                // current = 3
                // Check 4 -> exists ✔
                // current = 4
                // Check 5 -> does not exist ✘
                while (set.contains(current + 1)) {

                    // Move to the next consecutive number.
                    current++;

                    // Increase the sequence length.
                    length++;
                }

                // Update the longest sequence found so far.
                longest = Math.max(longest, length);
            }
        }

        // Return the maximum consecutive sequence length.
        return longest;
    }

    public static void main(String[] args) {

        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(obj.longestConsecutive(nums));
    }
}
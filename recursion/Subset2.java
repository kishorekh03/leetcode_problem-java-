package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

    // Function to return all unique subsets
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        // Sort the array so duplicate elements are adjacent
        Arrays.sort(nums);

        // List to store all subsets
        List<List<Integer>> ans = new ArrayList<>();

        // Start backtracking
        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    // Backtracking function
    public void backtrack(int[] nums,
                          int index,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        // Store a copy of the current subset
        ans.add(new ArrayList<>(current));

        // Traverse all remaining elements
        for (int i = index; i < nums.length; i++) {

            // Skip duplicate elements at the same recursion level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose the current element
            current.add(nums[i]);

            // Recurse for the next element
            backtrack(nums, i + 1, current, ans);

            // Backtrack (undo the choice)
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        Subset2 obj = new Subset2();

        int[] nums = {1, 2, 2};

        List<List<Integer>> result = obj.subsetsWithDup(nums);

        System.out.println(result);
    }
}
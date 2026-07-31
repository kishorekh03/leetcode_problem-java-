package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // Function to return all permutations
    public List<List<Integer>> permute(int[] nums) {

        // Stores all permutations
        List<List<Integer>> answer = new ArrayList<>();

        // Start recursion from index 0
        permuteHelper(nums, 0, answer);

        return answer;
    }

    // Recursive backtracking function
    private void permuteHelper(int[] nums, int index, List<List<Integer>> answer) {

        // =======================
        // Base Case
        // =======================
        // If index reaches the end, one complete permutation is formed.
        if (index == nums.length) {

            // Copy current array into a List
            // (We copy because nums will change due to future swaps.)
            List<Integer> permutation = new ArrayList<>();

            for (int num : nums) {
                permutation.add(num);
            }

            // Store this permutation
            answer.add(permutation);

            return;
        }

        // =======================
        // Recursive Case
        // =======================
        // Try every element from 'index' onwards
        // by placing it at the current position.
        for (int j = index; j < nums.length; j++) {

            // STEP 1: Choose
            // Put nums[j] at the current index.
            swap(nums, index, j);

            // STEP 2: Explore
            // Fix the next position.
            permuteHelper(nums, index + 1, answer);

            // STEP 3: Backtrack
            // Undo the swap so that the next iteration
            // starts with the original array.
            swap(nums, index, j);
        }
    }

    // Utility function to swap two elements
    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Driver method
    public static void main(String[] args) {

        Permutations obj = new Permutations();

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = obj.permute(nums);

        System.out.println("All Permutations:");

        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
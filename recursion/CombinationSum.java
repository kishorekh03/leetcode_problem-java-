package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    // Backtracking function
    public void calculate(int[] candidates,
                          int index,
                          int target,
                          List<Integer> combination,
                          List<List<Integer>> answer) {

        // ---------------- Base Case ----------------

        // If target becomes 0, we found one valid combination
        if (target == 0) {
            // Store a copy of the current combination
            answer.add(new ArrayList<>(combination));
            return;
        }

        // If target becomes negative, this path is invalid
        if (target < 0) {
            return;
        }

        // ---------------- Recursive Case ----------------

        // Start from the current index to avoid duplicate combinations
        for (int i = index; i < candidates.length; i++) {

            // ---------- Choose ----------

            // Add the current element to the combination
            combination.add(candidates[i]);

            // Since the same element can be used multiple times,
            // pass 'i' instead of 'i + 1'
            calculate(
                    candidates,
                    i,
                    target - candidates[i],
                    combination,
                    answer
            );

            // ---------- Backtrack ----------

            // Remove the last added element
            // so we can try the next candidate
            combination.remove(combination.size() - 1);
        }
    }

    // Main function called by LeetCode
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // Stores all valid combinations
        List<List<Integer>> answer = new ArrayList<>();

        // Stores the current combination
        List<Integer> combination = new ArrayList<>();

        // Start recursion from index 0
        calculate(
                candidates,
                0,
                target,
                combination,
                answer
        );

        return answer;
    }

    // Driver Code
    public static void main(String[] args) {

        CombinationSum obj = new CombinationSum();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        // Get all combinations
        List<List<Integer>> result = obj.combinationSum(candidates, target);

        // Print the answer
        System.out.println(result);
    }
}
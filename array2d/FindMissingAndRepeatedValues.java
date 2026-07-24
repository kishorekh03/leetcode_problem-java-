package array2d;

import java.util.HashSet;

public class FindMissingAndRepeatedValues {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        // Size of the matrix
        int n = grid.length;

        // Total numbers from 1 to n²
        int total = n * n;

        // Expected sum of numbers from 1 to n²
        // Formula: n * (n + 1) / 2
        int expectedSum = total * (total + 1) / 2;

        // Stores the actual sum of all elements in the matrix
        int actualSum = 0;

        // ans[0] -> Repeated number
        // ans[1] -> Missing number
        int[] ans = new int[2];

        // HashSet is used to detect the repeated number
        HashSet<Integer> set = new HashSet<>();

        // Traverse the matrix
        for (int[] row : grid) {
            for (int value : row) {

                // Add current value to actual sum
                actualSum += value;

                // If value already exists in HashSet,
                // then it is the repeated number
                if (set.contains(value)) {
                    ans[0] = value;
                } else {
                    // Otherwise store it in the HashSet
                    set.add(value);
                }
            }
        }

        // Formula:
        // Actual Sum = Expected Sum + Repeated - Missing
        //
        // Rearranging,
        // Missing = Expected Sum + Repeated - Actual Sum
        ans[1] = expectedSum + ans[0] - actualSum;

        // Return {Repeated, Missing}
        return ans;
    }

    public static void main(String[] args) {

        FindMissingAndRepeatedValues obj = new FindMissingAndRepeatedValues();

        // Example 1
        int[][] grid1 = {
                {1, 3},
                {2, 2}
        };

        int[] result1 = obj.findMissingAndRepeatedValues(grid1);

        System.out.println("Repeated = " + result1[0]);
        System.out.println("Missing = " + result1[1]);

        // Example 2
        int[][] grid2 = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };

        int[] result2 = obj.findMissingAndRepeatedValues(grid2);

        System.out.println("Repeated = " + result2[0]);
        System.out.println("Missing = " + result2[1]);
    }
}
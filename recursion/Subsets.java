package recursion;

import java.util.ArrayList;

public class Subsets {

    // Recursive function to generate all subsets
    public static void printSubsets(int[] arr, int index, ArrayList<Integer> current) {

        // Base Case:
        // If we've processed all elements, print the current subset.
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: Include the current element
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);

        // Backtrack: Remove the last added element
        current.remove(current.size() - 1);

        // Choice 2: Exclude the current element
        printSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        printSubsets(arr, 0, new ArrayList<>());
    }
}
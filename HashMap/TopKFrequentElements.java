package HashMap;

import java.util.*;

public class TopKFrequentElements {

    // Function to return the k most frequent elements
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap to store:
        // Key   -> Number
        // Value -> Frequency of the number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert the HashMap into a List of Map Entries
        // Each entry contains (key, value)
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort the list in descending order based on frequency (value)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Array to store the answer
        int[] result = new int[k];

        // Store the first k keys (most frequent elements)
        for (int i = 0; i < k; i++) {

            // list.get(i) returns the i-th entry
            // getKey() returns the number
            result[i] = list.get(i).getKey();
        }

        // Return the answer
        return result;
    }

    public static void main(String[] args) {

        // Create an object of the class
        TopKFrequentElements obj = new TopKFrequentElements();

        // Input array
        int[] nums = {1, 1, 1, 2, 2, 3};

        // Number of most frequent elements required
        int k = 2;

        // Call the function
        int[] ans = obj.topKFrequent(nums, k);

        // Print the result
        System.out.println(Arrays.toString(ans));
    }
}
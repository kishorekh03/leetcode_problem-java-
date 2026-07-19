package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if any frequency is greater than 1
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};

        System.out.println(obj.containsDuplicate(nums));
    }
}
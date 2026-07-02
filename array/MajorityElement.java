package array;

public class MajorityElement {

    // Brute Force Approach - O(n²)
    void brute_force(int[] nums) {
        int len = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > len) {
                System.out.println("Brute Force Majority Element: " + nums[i]);
                return;
            }
        }

        System.out.println("Brute Force: No Majority Element");
    }

    // Boyer-Moore Voting Algorithm - O(n)
    void mooresVotingAlgorithm(int[] nums) {

        // Initialize candidate and count
        int candidate = 0;
        int count = 0;

        // Step 1: Find the candidate
        for (int num : nums) {

            // If count becomes 0, choose current element as candidate
            if (count == 0) {
                candidate = num;
            }

            // If current element matches candidate, increase count
            if (num == candidate) {
                count++;
            }
            // Otherwise decrease count
            else {
                count--;
            }
        }

        // Step 2: Verify the candidate
        int frequency = 0;

        for (int num : nums) {
            if (num == candidate) {
                frequency++;
            }
        }

        // Step 3: Print the result
        if (frequency > nums.length / 2) {
            System.out.println("Moore's Voting Majority Element: " + candidate);
        } else {
            System.out.println("Moore's Voting: No Majority Element");
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 1, 1, 2, 2};

        MajorityElement obj = new MajorityElement();

        obj.brute_force(nums);
        obj.mooresVotingAlgorithm(nums);
    }
}
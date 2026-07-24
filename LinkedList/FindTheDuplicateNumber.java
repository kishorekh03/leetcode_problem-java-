package LinkedList;

public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {

        // -----------------------------
        // Phase 1: Find the meeting point
        // -----------------------------

        // Initialize both slow and fast pointers
        // at the first element.
        int slow = nums[0];
        int fast = nums[0];

        // Move slow by one step and fast by two steps
        // until they meet inside the cycle.
        do {
            slow = nums[slow];          // Move one step
            fast = nums[nums[fast]];    // Move two steps
        } while (slow != fast);

        // -----------------------------
        // Phase 2: Find the entrance of the cycle
        // -----------------------------

        // Start another pointer from the beginning.
        int ptr = nums[0];

        // Move both pointers one step at a time.
        // They will meet at the duplicate number.
        while (ptr != slow) {
            ptr = nums[ptr];
            slow = nums[slow];
        }

        // Duplicate number
        return ptr;
    }

    public static void main(String[] args) {

        FindTheDuplicateNumber obj = new FindTheDuplicateNumber();

        // Example 1
        int[] nums1 = {1, 3, 4, 2, 2};

        System.out.println("Duplicate Number: "
                + obj.findDuplicate(nums1));

        // Example 2
        int[] nums2 = {3, 1, 3, 4, 2};

        System.out.println("Duplicate Number: "
                + obj.findDuplicate(nums2));

        // Example 3
        int[] nums3 = {3, 3, 3, 3, 3};

        System.out.println("Duplicate Number: "
                + obj.findDuplicate(nums3));
    }
}
package array;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {

        // Search space
        int start = 0;
        int end = nums.length - 1;

        // Perform modified binary search
        while (start <= end) {

            // Calculate middle index
            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[start] <= nums[mid]) {

                // If target lies within the sorted left half,
                // discard the right half.
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                }
                // Otherwise, search in the right half.
                else {
                    start = mid + 1;
                }

            }
            // Otherwise, the right half must be sorted.
            else {

                // If target lies within the sorted right half,
                // discard the left half.
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                }
                // Otherwise, search in the left half.
                else {
                    end = mid - 1;
                }
            }
        }

        // Target not present
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        RotatedSortedArray obj = new RotatedSortedArray();

        System.out.println(obj.search(nums, target));
    }
}
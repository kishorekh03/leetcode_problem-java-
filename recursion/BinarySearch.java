package recursion;

public class BinarySearch {

    // Main method
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        return binarySearch(nums, target, start, end);
    }

    // Recursive Binary Search
    public int binarySearch(int[] nums, int target, int start, int end) {

        // Base Case
        if (start > end) {
            return -1;
        }

        // Find middle index
        int mid = start + (end - start) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Search left half
        if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        }

        // Search right half
        return binarySearch(nums, target, mid + 1, end);
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = obj.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
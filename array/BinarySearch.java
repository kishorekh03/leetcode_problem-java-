package array;

public class BinarySearch {

    // Iterative Binary Search
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Find the middle index
            int mid = start + (end - start) / 2;

            // Search in the right half
            if (target > nums[mid]) {
                start = mid + 1;
            }

            // Search in the left half
            else if (target < nums[mid]) {
                end = mid - 1;
            }

            // Target found
            else {
                return mid;
            }
        }

        // Target not found
        return -1;
    }

    // Recursive Binary Search
    public int recursiveBinarySearch(int[] nums, int target, int start, int end) {

        // Base case: target not found
        if (start > end) {
            return -1;
        }

        // Find the middle index
        int mid = start + (end - start) / 2;

        // Target found
        if (target == nums[mid]) {
            return mid;
        }

        // Search in the right half
        if (target > nums[mid]) {
            return recursiveBinarySearch(nums, target, mid + 1, end);
        }

        // Search in the left half
        return recursiveBinarySearch(nums, target, start, mid - 1);
    }

    public static void main(String[] args) {

        // Sorted array
        int[] nums = {-1, 0, 3, 4, 9, 12};

        // Target element
        int target = 12;

        BinarySearch obj = new BinarySearch();

        // Iterative Binary Search
        System.out.println("Iterative Binary Search Index: "
                + obj.search(nums, target));

        // Recursive Binary Search
        System.out.println("Recursive Binary Search Index: "
                + obj.recursiveBinarySearch(nums, target, 0, nums.length - 1));
    }
}
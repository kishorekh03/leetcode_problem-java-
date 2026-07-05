package array;

public class SingleElementIn_aSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        // Continue searching until only one element is left
        while (start < end) {

            int mid = start + (end - start) / 2;

            // Make mid even so it always points to the first element of a pair
            if (mid % 2 == 1) {
                mid--;
            }

            // If the pair is valid, the single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            }
            // Otherwise, the single element is at mid or on the left
            else {
                end = mid;
            }
        }

        // start == end, pointing to the single element
        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        SingleElementIn_aSortedArray obj = new SingleElementIn_aSortedArray();

        System.out.println(obj.singleNonDuplicate(nums)); // Output: 2
    }
}
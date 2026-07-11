package array;

import java.util.Arrays;

public class MergeSortedArray  {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;          // Last valid element in nums1
        int j = n - 1;          // Last element in nums2
        int index = m + n - 1;      // Last position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, m, nums2, n);
    }
}
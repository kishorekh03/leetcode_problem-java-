package sorting;

import java.util.Arrays;

public class MergeSort {

    // Function to merge two sorted halves
    public void merge(int[] array, int start, int mid, int end) {

        // Left half starts from 'start'
        int i = start;

        // Right half starts from 'mid + 1'
        int j = mid + 1;

        // Index for temporary array
        int k = 0;

        // Temporary array to store merged elements
        int[] temp = new int[end - start + 1];

        // -------------------------------------------------
        // Compare elements from both halves
        // and store the smaller element into temp[]
        // -------------------------------------------------
        while (i <= mid && j <= end) {

            // Left element is smaller
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            }

            // Right element is smaller
            else {
                temp[k] = array[j];
                j++;
            }

            // Move temp pointer
            k++;
        }

        // -------------------------------------------------
        // Copy remaining elements from the left half
        // -------------------------------------------------
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        // -------------------------------------------------
        // Copy remaining elements from the right half
        // -------------------------------------------------
        while (j <= end) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // -------------------------------------------------
        // Copy the sorted elements from temp[]
        // back into the original array
        // -------------------------------------------------
        for (int x = 0; x < temp.length; x++) {
            array[start + x] = temp[x];
        }
    }

    // Merge Sort Function
    public void mergeSort(int[] array, int start, int end) {

        // ---------------- Base Case ----------------
        // If the array has one or zero elements,
        // it is already sorted.
        if (start >= end) {
            return;
        }

        // Find the middle index
        int mid = start + (end - start) / 2;

        // ---------------- Divide ----------------

        // Sort the left half
        mergeSort(array, start, mid);

        // Sort the right half
        mergeSort(array, mid + 1, end);

        // ---------------- Conquer ----------------

        // Merge the two sorted halves
        merge(array, start, mid, end);
    }

    // Driver Code
    public static void main(String[] args) {

        // Create object of MergeSort class
        MergeSort obj = new MergeSort();

        // Input array
        int[] array = {5, 2, 4, 6, 1, 3};

        // Print original array
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(array));

        // Perform Merge Sort
        obj.mergeSort(array, 0, array.length - 1);

        // Print sorted array
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(array));
    }
}
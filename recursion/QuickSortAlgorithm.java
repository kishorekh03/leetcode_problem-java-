package recursion;

import java.util.Arrays;

public class QuickSortAlgorithm {

    // Partition function
    public int partition(int[] array, int start, int end) {

        // Choose the last element as the pivot
        int pivot = array[end];

        // Index of smaller element
        int index = start - 1;

        // Compare every element with the pivot
        for (int j = start; j < end; j++) {

            // If current element is smaller than the pivot
            if (array[j] < pivot) {

                // Move index
                index++;

                // Swap array[index] and array[j]
                int temp = array[j];
                array[j] = array[index];
                array[index] = temp;
            }
        }

        // Place the pivot in its correct position
        index++;

        int temp = array[index];
        array[index] = array[end];
        array[end] = temp;

        // Return the pivot index
        return index;
    }

    // Quick Sort function
    public void quickSort(int[] array, int start, int end) {

        // Base Case
        if (start >= end) {
            return;
        }

        // Find the pivot position
        int pivotIndex = partition(array, start, end);

        // Sort left half
        quickSort(array, start, pivotIndex - 1);

        // Sort right half
        quickSort(array, pivotIndex + 1, end);
    }

    // Driver Code
    public static void main(String[] args) {

        QuickSortAlgorithm obj = new QuickSortAlgorithm();

        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(array));

        obj.quickSort(array, 0, array.length - 1);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(array));
    }
}
package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        // Input array to be sorted
        int[] array = {4, 1, 5, 2, 3};

        // Start from the second element because
        // the first element is already considered sorted.
        for (int i = 1; i < array.length; i++) {

            // Store the current element that needs
            // to be placed in the correct position.
            int current = array[i];

            // Start comparing with the previous element.
            int prev = i - 1;

            // Move left while:
            // 1. We are inside the array.
            // 2. Previous element is greater than the current element.
            while (prev >= 0 && array[prev] > current) {

                // Shift the previous element one position to the right.
                array[prev + 1] = array[prev];

                // Move one position left to continue checking.
                prev--;
            }

            // Insert the current element into its correct position.
            // (prev + 1) is the first position where current should be placed.
            array[prev + 1] = current;
        }

        // Print the sorted array.
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
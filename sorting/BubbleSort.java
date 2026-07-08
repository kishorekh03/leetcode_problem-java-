package sorting;

public class BubbleSort {

    // Function to sort the array in Ascending Order
    public static void ascending(int[] array) {

        // Outer loop controls the number of passes.
        // After every pass, the largest element moves
        // to its correct position at the end.
        for (int i = 0; i < array.length - 1; i++) {

            // Compare adjacent elements.
            // The last 'i' elements are already sorted,
            // so no need to compare them again.
            for (int j = 0; j < array.length - i - 1; j++) {

                // If the left element is greater than
                // the right element, swap them.
                if (array[j] > array[j + 1]) {

                    // Swap the two elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Function to sort the array in Descending Order
    public static void descending(int[] array) {

        // Outer loop controls the number of passes.
        // After every pass, the smallest element moves
        // to its correct position at the end.
        for (int i = 0; i < array.length - 1; i++) {

            // Compare adjacent elements.
            // Ignore the last 'i' sorted elements.
            for (int j = 0; j < array.length - i - 1; j++) {

                // If the left element is smaller than
                // the right element, swap them.
                if (array[j] < array[j + 1]) {

                    // Swap the two elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] array) {

        // Print every element in the array
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Move to the next line after printing
        System.out.println();
    }

    public static void main(String[] args) {

        // Input arrays
        int[] arr1 = {4, 1, 5, 2, 3};
        int[] arr2 = {4, 1, 5, 2, 3};

        // Sort in Ascending Order
        ascending(arr1);
        System.out.print("Ascending Order : ");
        printArray(arr1);

        // Sort in Descending Order
        descending(arr2);
        System.out.print("Descending Order: ");
        printArray(arr2);
    }
}
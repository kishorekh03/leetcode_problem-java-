package sorting;

public class InsertionSort {

    // Function to sort the array in Ascending Order
    public static void ascending(int[] array) {

        // Start from the second element because
        // the first element is already considered sorted.
        for (int i = 1; i < array.length; i++) {

            // Store the current element.
            int current = array[i];

            // Start comparing with the previous element.
            int prev = i - 1;

            // Shift all larger elements one position to the right.
            while (prev >= 0 && array[prev] > current) {

                // Shift the previous element to the right.
                array[prev + 1] = array[prev];

                // Move one position left.
                prev--;
            }

            // Insert the current element into its correct position.
            array[prev + 1] = current;
        }
    }

    // Function to sort the array in Descending Order
    public static void descending(int[] array) {

        // Start from the second element because
        // the first element is already considered sorted.
        for (int i = 1; i < array.length; i++) {

            // Store the current element.
            int current = array[i];

            // Start comparing with the previous element.
            int prev = i - 1;

            // Shift all smaller elements one position to the right.
            while (prev >= 0 && array[prev] < current) {

                // Shift the previous element to the right.
                array[prev + 1] = array[prev];

                // Move one position left.
                prev--;
            }

            // Insert the current element into its correct position.
            array[prev + 1] = current;
        }
    }

    // Function to print the array
    public static void printArray(int[] array) {

        // Print every element of the array
        for (int num : array) {
            System.out.print(num + " ");
        }

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
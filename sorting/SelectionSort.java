package sorting;

public class SelectionSort {

    // Function to sort the array in Ascending Order
    public static void ascending(int[] array) {

        // Traverse the array
        for (int i = 0; i < array.length - 1; i++) {

            // Assume the current element is the smallest
            int smallest = i;

            // Search for the smallest element in the remaining array
            for (int j = i + 1; j < array.length; j++) {

                // If a smaller element is found,
                // update the index of the smallest element
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }

            // Swap the current element with the smallest element found
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }

    // Function to sort the array in Descending Order
    public static void descending(int[] array) {

        // Traverse the array
        for (int i = 0; i < array.length - 1; i++) {

            // Assume the current element is the largest
            int largest = i;

            // Search for the largest element in the remaining array
            for (int j = i + 1; j < array.length; j++) {

                // If a larger element is found,
                // update the index of the largest element
                if (array[j] > array[largest]) {
                    largest = j;
                }
            }

            // Swap the current element with the largest element found
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
        }
    }

    // Function to print the array
    public static void printArray(int[] array) {

        // Print each element of the array
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
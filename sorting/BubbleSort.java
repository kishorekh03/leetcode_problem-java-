package sorting;
public class BubbleSort {

    public static void main(String[] args) {

        // Input array
        int[] array = {4, 1, 5, 2, 3};

        // Outer loop controls the number of passes
        // After each pass, the largest element moves to its correct position
        for (int i = 0; i < array.length - 1; i++) {

            // Inner loop compares adjacent elements
            // '- i' is used because the last 'i' elements are already sorted
            for (int j = 0; j < array.length - i - 1; j++) {

                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
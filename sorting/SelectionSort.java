package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        // Input array
        int[] array = {4, 1, 5, 2, 3};

        // Traverse the array
        for (int i = 0; i < array.length - 1; i++) {

            // Assume the current index contains the smallest element
            int smallest = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        // Input array
        int[] array = {4, 1, 5, 2, 3};

        // Traverse from the second element
        for (int i = 1; i < array.length; i++) {

            // Element to be inserted
            int current_variable = array[i];

            // Start comparing with previous elements
            int pre = i - 1;

            // Shift elements greater than current_variable to the right
            while (pre >= 0 && array[pre] > current_variable) {
                array[pre + 1] = array[pre];
                pre--;
            }

            // Insert current_variable at the correct position
            array[pre + 1] = current_variable;
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

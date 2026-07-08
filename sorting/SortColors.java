package sorting;

public class SortColors {

    // -------------------- Counting Approach --------------------
    public static void countApproach(int[] arr) {

        // Count the number of 0s, 1s, and 2s
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count each color
        for (int num : arr) {

            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Start filling the array from index 0
        int index = 0;

        // Fill all 0s
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }

        // Fill all 1s
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }

        // Fill all 2s
        for (int i = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }
    }

    // ---------------- Dutch National Flag Algorithm ----------------
    public static void dutchNationalFlagAlgorithm(int[] arr) {

        // Pointer for placing the next 0
        int low = 0;

        // Current element being checked
        int mid = 0;

        // Pointer for placing the next 2
        int high = arr.length - 1;

        // Continue until mid crosses high
        while (mid <= high) {

            // Case 1: Current element is 0
            if (arr[mid] == 0) {

                // Swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                // Move both pointers forward
                low++;
                mid++;
            }

            // Case 2: Current element is 1
            else if (arr[mid] == 1) {

                // 1 is already in the correct position
                mid++;
            }

            // Case 3: Current element is 2
            else {

                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                // Move high pointer left
                high--;

                // Do NOT move mid because
                // the new element at mid is not checked yet.
            }
        }
    }

    // ---------------- Print Function ----------------
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ---------------- Main Function ----------------
    public static void main(String[] args) {

        int[] arr1 = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};
        int[] arr2 = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};

        // Counting Approach
        countApproach(arr1);
        System.out.print("Counting Approach : ");
        printArray(arr1);

        // Dutch National Flag Algorithm
        dutchNationalFlagAlgorithm(arr2);
        System.out.print("Dutch National Flag: ");
        printArray(arr2);
    }
}
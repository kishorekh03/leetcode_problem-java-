package recursion;

public class CountInversion {

    // -------------------------------------------------
    // Brute Force Approach - O(n²)
    // -------------------------------------------------
    public int inversionCount_Brute(int[] arr, int n) {

        // Stores total inversions
        int count = 0;

        // Pick every element
        for (int i = 0; i < n; i++) {

            // Compare it with every element on its right
            for (int j = i + 1; j < n; j++) {

                // If left element is greater,
                // then it forms an inversion
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    // -------------------------------------------------
    // Merge two sorted halves and count inversions
    // -------------------------------------------------
    public int mergeAndCount(int[] arr, int start, int mid, int end) {

        // Left half starts from 'start'
        int i = start;

        // Right half starts from 'mid + 1'
        int j = mid + 1;

        // Index for temporary array
        int k = 0;

        // Stores inversion count during merge
        int count = 0;

        // Temporary array
        int[] temp = new int[end - start + 1];

        // -------------------------------------------------
        // Merge both sorted halves
        // -------------------------------------------------
        while (i <= mid && j <= end) {

            // Left element is smaller
            if (arr[i] <= arr[j]) {

                temp[k] = arr[i];
                i++;
            }

            // Right element is smaller
            else {

                temp[k] = arr[j];
                j++;

                // All remaining elements in the left half
                // are greater than arr[j]
                count += (mid - i + 1);
            }

            k++;
        }

        // -------------------------------------------------
        // Copy remaining left half
        // -------------------------------------------------
        while (i <= mid) {

            temp[k] = arr[i];
            i++;
            k++;
        }

        // -------------------------------------------------
        // Copy remaining right half
        // -------------------------------------------------
        while (j <= end) {

            temp[k] = arr[j];
            j++;
            k++;
        }

        // -------------------------------------------------
        // Copy sorted elements back into original array
        // -------------------------------------------------
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }

        return count;
    }

    // -------------------------------------------------
    // Merge Sort + Count Inversions
    // -------------------------------------------------
    public int inversionCount(int[] arr, int start, int end) {

        // ---------------- Base Case ----------------
        if (start >= end) {
            return 0;
        }

        // Find middle index
        int mid = start + (end - start) / 2;

        // Count inversions in left half
        int leftCount = inversionCount(arr, start, mid);

        // Count inversions in right half
        int rightCount = inversionCount(arr, mid + 1, end);

        // Count inversions while merging
        int mergeCount = mergeAndCount(arr, start, mid, end);

        // Total inversions
        return leftCount + rightCount + mergeCount;
    }

    // -------------------------------------------------
    // Driver Code
    // -------------------------------------------------
    public static void main(String[] args) {

        CountInversion obj = new CountInversion();

        int[] arr1 = {6, 3, 5, 2, 7};

        int[] arr2 = {6, 3, 5, 2, 7};

        // Brute Force
        System.out.println("Brute Force Approach : "
                + obj.inversionCount_Brute(arr1, arr1.length));

        // Merge Sort
        System.out.println("Merge Sort Approach  : "
                + obj.inversionCount(arr2, 0, arr2.length - 1));
    }
}
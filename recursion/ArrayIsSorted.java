package recursion;

public class ArrayIsSorted {

    // Recursive function to check whether the array is sorted
    public boolean isSorted(int[] arr, int length) {

        // Base Case:
        // If the array has only one element (or we've checked all elements),
        // then it is sorted.
        if (length == 1) {
            return true;
        }

        // Check if the last two elements are in sorted order.
        // If the current element is smaller than the previous element,
        // the array is not sorted.
        if (arr[length - 1] < arr[length - 2]) {
            return false;
        }

        // Recursive Call:
        // Ignore the last element (already verified) and
        // check the remaining part of the array.
        return isSorted(arr, length - 1);
    }

    public static void main(String[] args) {

        // Test array
        int[] arr = {1, 2, 3, 4, 5};

        // Create an object of the class
        ArrayIsSorted obj = new ArrayIsSorted();

        // Call the recursive function
        if (obj.isSorted(arr, arr.length)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}
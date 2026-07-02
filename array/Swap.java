package array;

public class Swap {
    
    // Returns the INDEX of the smallest value
    int smallestIndex(int[] num) {
        int small = num[0];
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
                index = i;
            }
        }
        return index;
    }

    // Returns the INDEX of the largest value
    int largestIndex(int[] num) {
        int large = num[0];
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
                index = i;
            }
        }
        return index;
    }

    // Swaps two elements in the array
    void swap(int[] num, int index1, int index2) {
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
        System.out.println("Array after swapping: " + java.util.Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] num = {10, 32, -123, 1, 0, 33};
        
        Swap obj1 = new Swap(); // Make sure the class name matches
        
        // Get the indexes first
        int sIdx = obj1.smallestIndex(num);
        int lIdx = obj1.largestIndex(num);
        
        // Use the indexes to get the actual values
        System.out.println("Smallest number is: " + num[sIdx] + " at index " + sIdx);
        System.out.println("Largest number is: " + num[lIdx] + " at index " + lIdx);
        
        // Perform the swap
        obj1.swap(num, sIdx, lIdx);
    }
}
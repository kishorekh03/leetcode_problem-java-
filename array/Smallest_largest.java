package array;

public class Smallest_largest {
    
    // Finds the minimum value in the array
    int smallest(int[] num) {
        int small = num[0];
        for (int i = 1; i < num.length; i++) { // Starting at index 1 is slightly more efficient
            if (num[i] < small) {
                small = num[i];
            }
        }
        return small;
    }

    // Finds the maximum value in the array
    int largest(int[] num) {
        int large = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] num = {10, 32, -123, 1, 0, 33};
        
        // Removed the invalid Function obj lines
        Smallest_largest obj1 = new Smallest_largest();
        
        int small = obj1.smallest(num);
        int large = obj1.largest(num);
        
        System.out.println("Smallest number is: " + small);
        System.out.println("Largest number is: " + large);
    }
}
package array;

import java.util.Scanner;

public class Linear_search {

    // Method to read array elements from the user
    int[] readElements(int len) {
        int[] array = new int[len];
        Scanner sc = new Scanner(System.in);

        // Reading array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    // Method to perform Linear Search
    int linearSearch(int[] array, int target) {

        // Traverse the array element by element
        for (int i = 0; i < array.length; i++) {

            // Check if current element matches the target
            if (array[i] == target) {
                return i; // Return index if found
            }
        }

        // Return -1 if element is not found
        return -1;
    }

    public static void main(String[] args) {

        // Creating object of the class
        Linear_search obj = new Linear_search();

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        // Read array elements
        int[] array = obj.readElements(length);

        // Read the element to be searched
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Call linear search method
        int result = obj.linearSearch(array, target);

        // Display result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + (result + 1));
        }

        // Close scanner
        sc.close();
    }
}          
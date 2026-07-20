package array2d;

import java.util.Scanner;

public class LinearSearch {

    // Method to read elements into the 2D array
    public int[][] readElements(int rows, int cols) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[rows][cols];

        System.out.println("\nEnter the elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        return array;
    }

    // Method to perform Linear Search
    public int[] linearSearch(int[][] array, int target) {

        // Traverse each row
        for (int i = 0; i < array.length; i++) {

            // Traverse each column
            for (int j = 0; j < array[i].length; j++) {

                // Check if target is found
                if (array[i][j] == target) {

                    // Return row and column index
                    return new int[]{i, j};
                }
            }
        }

        // Element not found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinearSearch obj = new LinearSearch();

        // Read rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Read elements
        int[][] array = obj.readElements(rows, cols);

        // Read target element
        System.out.print("\nEnter the element to search: ");
        int target = sc.nextInt();

        // Perform linear search
        int[] result = obj.linearSearch(array, target);

        // Display result
        if (result[0] == -1) {

            System.out.println("\nElement not found.");

        } else {

            System.out.println("\nElement found!");
            System.out.println("Row Index    : " + result[0]);
            System.out.println("Column Index : " + result[1]);
        }

        sc.close();
    }
}
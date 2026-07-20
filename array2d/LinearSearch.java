package array2d;

import java.util.Scanner;

public class LinearSearch {

    // Linear Search
    public static int[] linearSearch(int[][] matrix, int target) {

        // Traverse each row
        for (int row = 0; row < matrix.length; row++) {

            // Traverse each column
            for (int column = 0; column < matrix[row].length; column++) {

                // Target found
                if (matrix[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }

        // Target not found
        return new int[]{-1, -1};
    }

    // Optimal Search for Row-wise and Column-wise Sorted Matrix
    public static boolean searchMatrix(int[][] matrix, int target) {

        // Start from the top-right corner
        int row = 0;
        int column = matrix[0].length - 1;

        // Continue until we go outside the matrix
        while (row < matrix.length && column >= 0) {

            // Target found
            if (matrix[row][column] == target) {
                return true;
            }

            // Move down if current element is smaller
            else if (matrix[row][column] < target) {
                row++;
            }

            // Move left if current element is larger
            else {
                column--;
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Read matrix elements
        System.out.println("\nEnter the elements:");

        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {

                System.out.print("Enter element [" + row + "][" + column + "]: ");
                matrix[row][column] = sc.nextInt();
            }
        }

        // Read target element
        System.out.print("\nEnter the element to search: ");
        int target = sc.nextInt();

        // Perform optimal search
        boolean found = searchMatrix(matrix, target);
        System.out.println("\nOptimal Search Result : " + found);

        // Perform linear search to get the position
        int[] ans = linearSearch(matrix, target);

        if (ans[0] == -1) {
            System.out.println("\nElement not found!");
        } else {
            System.out.println("\nElement found!");
            System.out.println("Row Index    : " + ans[0]);
            System.out.println("Column Index : " + ans[1]);
        }

        sc.close();
    }
}
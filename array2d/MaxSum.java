package array2d;

import java.util.Scanner;

public class MaxSum {

    // ===========================
    // Method to find Maximum Row Sum
    // ===========================
    public int MaxSumOfRow(int[][] array) {

        // Store the maximum row sum
        int maxScore = Integer.MIN_VALUE;

        // Store the row index having the maximum sum
        int rowIndex = -1;

        // Traverse each row
        for (int i = 0; i < array.length; i++) {

            // Sum of the current row
            int sum = 0;

            // Traverse each column
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            // Update maximum row sum
            if (sum > maxScore) {
                maxScore = sum;
                rowIndex = i;
            }
        }

        System.out.println("Row Index with Maximum Sum = " + rowIndex);

        return maxScore;
    }

    // ===========================
    // Method to find Maximum Column Sum
    // ===========================
    public int MaxSumOfColumn(int[][] array) {

        // Store the maximum column sum
        int maxScore = Integer.MIN_VALUE;

        // Store the column index having the maximum sum
        int colIndex = -1;

        // Traverse each column
        for (int j = 0; j < array[0].length; j++) {

            // Sum of the current column
            int sum = 0;

            // Traverse each row
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }

            // Update maximum column sum
            if (sum > maxScore) {
                maxScore = sum;
                colIndex = j;
            }
        }

        System.out.println("Column Index with Maximum Sum = " + colIndex);

        return maxScore;
    }

    // ===========================
    // Method to find Diagonal Sum
    // ===========================
    public int DiagonalSum(int[][] array) {

        // Check whether the matrix is square
        if (array.length != array[0].length) {
            return -1;
        }

        int sum = 0;

        int n = array.length;

        // Traverse the complete matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < array[i].length; j++) {

                // Primary diagonal
                if (i == j) {
                    sum += array[i][j];
                }

                // Secondary diagonal
                // else if prevents counting the center twice
                else if (j == n - i - 1) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    // ===========================
    // Main Method
    // ===========================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MaxSum obj = new MaxSum();

        // Read number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Read number of columns
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create the matrix
        int[][] array = new int[rows][cols];

        // Take matrix input
        System.out.println("\nEnter the elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // Find maximum row sum
        int rowAnswer = obj.MaxSumOfRow(array);

        // Find maximum column sum
        int colAnswer = obj.MaxSumOfColumn(array);

        // Find diagonal sum
        int diagonalAnswer = obj.DiagonalSum(array);

        // Display results
        System.out.println("\nMaximum Row Sum = " + rowAnswer);
        System.out.println("Maximum Column Sum = " + colAnswer);

        // Check if diagonal sum exists
        if (diagonalAnswer == -1) {
            System.out.println("Diagonal Sum cannot be calculated because the matrix is not square.");
        } else {
            System.out.println("Diagonal Sum = " + diagonalAnswer);
        }

        sc.close();
    }
}
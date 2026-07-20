package array2d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===========================
        // Taking number of rows and columns
        // ===========================
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array
        int[][] array = new int[rows][cols];

        // ===========================
        // Taking input from the user
        // ===========================
        System.out.println("\nEnter the elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // ===========================
        // Printing the original array
        // ===========================
        System.out.println("\nOriginal Array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        // ===========================
        // Accessing an element
        // ===========================
        System.out.println("\nAccessing First Element:");
        System.out.println("array[0][0] = " + array[0][0]);

        // ===========================
        // Modifying an element
        // ===========================
        array[0][0] = 100;

        System.out.println("\nAfter modifying array[0][0]:");
        System.out.println("array[0][0] = " + array[0][0]);

        // ===========================
        // Traversing using nested for loop
        // ===========================
        System.out.println("\nTraversing using for loop:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        // ===========================
        // Traversing using for-each loop
        // ===========================
        System.out.println("\nTraversing using for-each loop:");

        for (int[] row : array) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }

        // ===========================
        // Jagged (Irregular) Array
        // ===========================

        // Create a 2D array with 3 rows
        // Columns are not allocated yet
        int[][] jaggedArray = new int[3][];

        // Allocate columns for each row separately
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6};

        System.out.println("\nJagged Array:");

        // Print the jagged array
        for (int[] row : jaggedArray) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
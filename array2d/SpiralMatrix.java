package array2d;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        // List to store the spiral order
        List<Integer> ans = new ArrayList<>();

        // Handle empty matrix
        if (matrix == null || matrix.length == 0) {
            return ans;
        }

        // Initialize the four boundaries
        int starting_row = 0;
        int starting_column = 0;
        int ending_row = matrix.length - 1;
        int ending_column = matrix[0].length - 1;

        // Continue until all layers are traversed
        while (starting_row <= ending_row && starting_column <= ending_column) {

            // Traverse the top row (Left → Right)
            for (int j = starting_column; j <= ending_column; j++) {
                ans.add(matrix[starting_row][j]);
            }
            starting_row++;

            // Traverse the right column (Top → Bottom)
            for (int i = starting_row; i <= ending_row; i++) {
                ans.add(matrix[i][ending_column]);
            }
            ending_column--;

            // Traverse the bottom row (Right → Left)
            // Only if there is a remaining row
            if (starting_row <= ending_row) {
                for (int j = ending_column; j >= starting_column; j--) {
                    ans.add(matrix[ending_row][j]);
                }
                ending_row--;
            }

            // Traverse the left column (Bottom → Top)
            // Only if there is a remaining column
            if (starting_column <= ending_column) {
                for (int i = ending_row; i >= starting_row; i--) {
                    ans.add(matrix[i][starting_column]);
                }
                starting_column++;
            }
        }

        return ans;
    }

    // Driver code for testing
    public static void main(String[] args) {

        SpiralMatrix obj = new SpiralMatrix();

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println("Spiral Order:");
        System.out.println(result);
    }
}
package recursion;

public class CheckKnightTourConfiguration {

    // Recursive function to verify the knight's tour
    public boolean isValid(int[][] grid, int row, int column,int n, int expectedValue) {

        // ---------------- Boundary Check ----------------
        // If the position is outside the chessboard,
        // this path is invalid.
        if (row < 0 || column < 0 || row >= n || column >= n) {
            return false;
        }

        // ---------------- Value Check ----------------
        // The current cell should contain the expected number.
        if (grid[row][column] != expectedValue) {
            return false;
        }

        // ---------------- Base Case ----------------
        // If we have reached the last value,
        // the knight tour is valid.
        if (expectedValue == (n * n) - 1) {
            return true;
        }

        // ---------------- Recursive Calls ----------------
        // Try all 8 possible knight moves.

        // Move 1 : Up 2, Right 1
        boolean answer1 = isValid(grid, row - 2, column + 1,
                                  n, expectedValue + 1);

        // Move 2 : Up 1, Right 2
        boolean answer2 = isValid(grid, row - 1, column + 2,
                                  n, expectedValue + 1);

        // Move 3 : Down 1, Right 2
        boolean answer3 = isValid(grid, row + 1, column + 2,
                                  n, expectedValue + 1);

        // Move 4 : Down 2, Right 1
        boolean answer4 = isValid(grid, row + 2, column + 1,
                                  n, expectedValue + 1);

        // Move 5 : Down 2, Left 1
        boolean answer5 = isValid(grid, row + 2, column - 1,
                                  n, expectedValue + 1);

        // Move 6 : Down 1, Left 2
        boolean answer6 = isValid(grid, row + 1, column - 2,
                                  n, expectedValue + 1);

        // Move 7 : Up 1, Left 2
        boolean answer7 = isValid(grid, row - 1, column - 2,
                                  n, expectedValue + 1);

        // Move 8 : Up 2, Left 1
        boolean answer8 = isValid(grid, row - 2, column - 1,
                                  n, expectedValue + 1);

        // If any one move leads to a valid tour,
        // return true.
        return answer1 || answer2 || answer3 || answer4 ||
               answer5 || answer6 || answer7 || answer8;
    }

    // Main function called by LeetCode
    public boolean checkValidGrid(int[][] grid) {

        int n = grid.length;

        // ---------------- Initial Check ----------------
        // A valid knight's tour must always start with 0.
        if (grid[0][0] != 0) {
            return false;
        }

        // Start checking from (0,0)
        return isValid(grid, 0, 0, n, 0);
    }

    // ---------------- Driver Code ----------------
    public static void main(String[] args) {

        CheckKnightTourConfiguration obj =
                new CheckKnightTourConfiguration();

        int[][] grid = {
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
        };

        boolean answer = obj.checkValidGrid(grid);

        System.out.println("Is Valid Knight Tour : " + answer);
    }
}
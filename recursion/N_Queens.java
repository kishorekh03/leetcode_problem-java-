package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {

    // Checks whether a queen can be safely placed at (row, col)
    public boolean isSafe(char[][] board, int row, int col, int n) {

        // Check the same column in all previous rows
        // (No need to check below because queens are placed row by row)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Safe position found
        return true;
    }

    // Backtracking function
    public void nQueens(char[][] board, int row, int n, List<List<String>> answer) {

        // Base Case:
        // If all rows are processed, one valid solution is found.
        if (row == n) {

            // Convert char[][] board into List<String>
            List<String> solution = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }

            // Store the solution
            answer.add(solution);
            return;
        }

        // Try placing the queen in every column of the current row
        for (int col = 0; col < n; col++) {

            // Check if current position is safe
            if (isSafe(board, row, col, n)) {

                // ---------------- CHOOSE ----------------
                // Place the queen
                board[row][col] = 'Q';

                // ---------------- EXPLORE ----------------
                // Move to the next row
                nQueens(board, row + 1, n, answer);

                // ---------------- UNDO (BACKTRACK) ----------------
                // Remove the queen and try the next column
                board[row][col] = '.';
            }
        }
    }

    // Main function called by LeetCode
    public List<List<String>> solveNQueens(int n) {

        // Stores all valid board configurations
        List<List<String>> answer = new ArrayList<>();

        // Create an empty chessboard
        char[][] board = new char[n][n];

        // Fill every cell with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start solving from the first row
        nQueens(board, 0, n, answer);

        return answer;
    }

    public static void main(String[] args) {

        N_Queens obj = new N_Queens();

        List<List<String>> ans = obj.solveNQueens(4);

        // Print all solutions
        for (List<String> board : ans) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
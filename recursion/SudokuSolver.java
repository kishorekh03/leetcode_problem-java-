package recursion;

public class SudokuSolver {

    // ------------------------------------------------------------------
    // Checks whether placing a digit at (row, col) is valid.
    // We must ensure:
    // 1. Digit is not already present in the same row.
    // 2. Digit is not already present in the same column.
    // 3. Digit is not already present in the 3x3 sub-grid.
    // ------------------------------------------------------------------
    public boolean isSafe(char[][] board, int row, int col, char digit) {

        // ---------------- Check Row ----------------
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // ---------------- Check Column ----------------
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // ---------------- Check 3 x 3 Grid ----------------
        // Find the starting row and column of the current 3x3 box.
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        // Traverse the 3x3 box.
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        // Safe to place the digit.
        return true;
    }

    // ------------------------------------------------------------------
    // Backtracking Function
    //
    // Steps:
    // 1. Reach an empty cell.
    // 2. Try digits from 1 to 9.
    // 3. If safe, place the digit.
    // 4. Solve the remaining board.
    // 5. If it fails, remove the digit (Backtrack).
    // ------------------------------------------------------------------
    public boolean sudoku(char[][] board, int row, int col) {

        // ---------------- Base Case ----------------
        // If row becomes 9, every row has been processed.
        if (row == 9) {
            return true;
        }

        // ---------------- Calculate Next Cell ----------------
        int nextRow = row;
        int nextCol = col + 1;

        // Move to next row after column 8.
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // ---------------- Skip Filled Cells ----------------
        // If current cell already contains a digit,
        // simply move to the next cell.
        if (board[row][col] != '.') {
            return sudoku(board, nextRow, nextCol);
        }

        // ---------------- Try Every Possible Digit ----------------
        for (char digit = '1'; digit <= '9'; digit++) {

            // Check whether placing this digit is valid.
            if (isSafe(board, row, col, digit)) {

                // ==================================================
                // CHOOSE
                // ==================================================
                board[row][col] = digit;

                // ==================================================
                // EXPLORE
                // ==================================================
                if (sudoku(board, nextRow, nextCol)) {
                    return true;
                }

                // ==================================================
                // UNDO (BACKTRACK)
                // ==================================================
                // Remove the digit because it did not lead
                // to a valid solution.
                board[row][col] = '.';
            }
        }

        // None of the digits worked.
        return false;
    }

    // ------------------------------------------------------------------
    // Driver function
    // Starts solving from the first cell.
    // ------------------------------------------------------------------
    public void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
    }

    // ------------------------------------------------------------------
    // Main Method
    // ------------------------------------------------------------------
    public static void main(String[] args) {

        char[][] board = {

                {'2','.','.','.','.','1','4','.','.'},
                {'7','.','.','.','9','.','.','.','.'},
                {'.','3','.','.','5','6','.','.','2'},
                {'.','7','.','2','1','8','5','.','6'},
                {'1','.','2','.','.','5','9','3','.'},
                {'.','6','.','.','.','9','.','.','.'},
                {'6','.','.','.','8','.','.','.','.'},
                {'9','.','.','5','.','3','8','.','.'},
                {'4','1','8','.','2','.','.','6','5'}
        };

        SudokuSolver obj = new SudokuSolver();

        obj.solveSudoku(board);

        // ---------------- Print Solved Sudoku ----------------
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
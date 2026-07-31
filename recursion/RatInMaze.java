package recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    // ------------------------------------------------------------------
    // Backtracking Function
    //
    // Parameters:
    // maze   -> Input maze (1 = open path, 0 = blocked)
    // row    -> Current row
    // col    -> Current column
    // path   -> Path formed so far
    // answer -> Stores all valid paths
    // ------------------------------------------------------------------
    public void getAnswer(int[][] maze, int row, int col,
                          String path, List<String> answer) {

        int length = maze.length;

        // ---------------- Boundary Check ----------------
        // If the current cell is outside the maze, stop exploring.
        if (row < 0 || col < 0 || row >= length || col >= length) {
            return;
        }

        // ---------------- Invalid Cell ----------------
        // Cell is blocked (0)
        // OR
        // Cell is already visited (-1)
        if (maze[row][col] == 0 || maze[row][col] == -1) {
            return;
        }

        // ---------------- Destination Reached ----------------
        // If we reach the bottom-right corner,
        // store the current path.
        if (row == length - 1 && col == length - 1) {
            answer.add(path);
            return;
        }

        // ==================================================
        // CHOOSE
        // ==================================================
        // Mark current cell as visited so we don't revisit it.
        maze[row][col] = -1;

        // ==================================================
        // EXPLORE
        // ==================================================

        // Move Down
        getAnswer(maze, row + 1, col, path + "D", answer);

        // Move Left
        getAnswer(maze, row, col - 1, path + "L", answer);

        // Move Right
        getAnswer(maze, row, col + 1, path + "R", answer);

        // Move Up
        getAnswer(maze, row - 1, col, path + "U", answer);

        // ==================================================
        // UNDO (BACKTRACK)
        // ==================================================
        // Remove the visited mark so that this cell
        // can be used in another possible path.
        maze[row][col] = 1;
    }

    // ------------------------------------------------------------------
    // Driver Function
    // Starts the search from the top-left corner.
    // ------------------------------------------------------------------
    public List<String> findPath(int[][] maze) {

        // Stores all possible paths.
        List<String> answer = new ArrayList<>();

        // If starting cell is blocked, no path exists.
        if (maze[0][0] == 0) {
            return answer;
        }

        // Start searching from (0,0)
        getAnswer(maze, 0, 0, "", answer);

        return answer;
    }

    // ------------------------------------------------------------------
    // Main Method
    // ------------------------------------------------------------------
    public static void main(String[] args) {

        // 1 = Open Path
        // 0 = Blocked Path
        int[][] maze = {

                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        RatInMaze obj = new RatInMaze();

        // Find all paths
        List<String> ans = obj.findPath(maze);

        // Print all possible paths
        System.out.println(ans);
    }
}
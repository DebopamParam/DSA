package BackTracking;

public class Maze_Obstacles {
    public static void main(String[] args) {
//        path("src", 0, 0, new int[]{1, 1});

        boolean[][] maze = {{true, true, true, true}, {true, true, true, true}, {true, true, true, true}, {true, true, true, true}};
        int[][] ans = new int[maze.length][maze[0].length];
//        all_path("", 0, 0, maze);
        print_path_matrix(0, 0, 1, maze, ans);
    }

    static void path(String path, int row, int col, int[] obstacle) {
        if (row == 3 && col == 3) {
            System.out.println(path);
            return;
        }
        if (row == obstacle[0] && col == obstacle[1]) {
            return;
        }
        if (row < 3) {
            path(path + "->Down", row + 1, col, obstacle);
        }
        if (col < 3) {
            path(path + "->Right", row, col + 1, obstacle);
        }
    }

    static void all_path(String path, int row, int col, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            // We are at destination
            // Print the path
            // No need to mark it false
            System.out.println(path);
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        //Mark each node False when Visited....Not allowed to visit again in that particular path
        maze[row][col] = false;

        if (row < maze.length - 1) {
            all_path(path + "D", row + 1, col, maze);
        }
        if (col < maze[0].length - 1) {
            all_path(path + "R", row, col + 1, maze);
        }
        if (row > 0) {
            all_path(path + "U", row - 1, col, maze);
        }
        if (col > 0) {
            all_path(path + "L", row, col - 1, maze);
        }

        /* Suppose we are in a Node
         • It has checked if it is in the Destination - No
         • "   "  checked if the Cell if visited in the path before - No
         • "   "  checked if all the possible paths(U-D-L-R) is allowed/can be to visited , & it does if it can (Say it Has)
         • After all these checks, we have checked all the possible directions from that cell.
         • We can return to it's "Parent fn" to finish it's(parent fn's) execution
         • So to before returning we need to make it "visitable"(or True) for other fns (other than the current parent bcz it has already
           visited the cell) */
        maze[row][col] = true;
    }

    static void print_path_matrix(int row, int col, int count, boolean[][] maze, int[][] ans) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ans[row][col] = count;
            print_matrix(ans);
            ans[row][col] = 0;
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        // You have entered the Cell for the first time in that path
        // Make it false
        maze[row][col] = false;
        ans[row][col] = count;

        // up
        if (row > 0) {
            print_path_matrix(row - 1, col, count + 1, maze, ans);
        }
        //left
        if (col > 0) {
            print_path_matrix(row, col - 1, count + 1, maze, ans);
        }
        //Down
        if (row < maze.length - 1) {
            print_path_matrix(row + 1, col, count + 1, maze, ans);
        }
        //Right
        if (col < maze[0].length - 1) {
            print_path_matrix(row, col + 1, count + 1, maze, ans);
        }

        // We have checked all possible path that we can take
        // Now we are returning to the Calling function
        // Thus we need to clear the path
        maze[row][col] = true;
        ans[row][col] = 0;
    }

    static void print_matrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------   ");
        System.out.println();
    }

}

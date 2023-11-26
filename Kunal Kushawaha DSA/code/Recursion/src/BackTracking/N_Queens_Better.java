package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_Better {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] matrix = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        queens(0, matrix, ans);
        return ans;
    }

    private static void queens(int row, boolean[][] matrix, List<List<String>> ans) {
        if (row == matrix.length) {
            ans.add(construct(matrix));
            return;
        }
        for (int col = 0; col < matrix.length; col++) {
            if (isSafe(row, col, matrix)) {
                matrix[row][col] = true;
                queens(row + 1, matrix, ans);
                matrix[row][col] = false;
            }
        }
    }

    private static boolean isSafe(int row, int col, boolean[][] matrix) {

        //Check up
        for (int i = row; i >= 0; i--) {
            if (matrix[i][col]) {
                return false;
            }
        }
        //Check up-right diagonal
        for (int i = row, j = col; i >= 0 && j < matrix[0].length; i--, j++) {
            if (matrix[i][j]) {
                return false;
            }
        }
        //Check up-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j]) {
                return false;
            }
        }

        return true;
    }

    private static List<String> construct(boolean[][] matrix) {
        List<String> ans = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            String r = "";
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col]) {
                    r += "Q";
                } else {
                    r += ".";
                }
            }
            ans.add(r);
        }
        return ans;
    }
}

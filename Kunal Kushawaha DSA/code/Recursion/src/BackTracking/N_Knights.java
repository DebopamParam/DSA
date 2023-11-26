package BackTracking;

public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] matrix = new boolean[n][n];
        boolean[][] ans = new boolean[n][n];
        knights(0, 0, matrix, ans, n+n);
    }

    static void knights(int row, int col, boolean[][] matrix, boolean[][] ans, int knights) {
        if (knights == 0) {
            print_ans(ans);
            System.out.println();
            return;
        }
        if (row == matrix.length - 1 && col == matrix.length) {
            return;
        }
        if (col == matrix.length) {
            knights(row + 1, 0, matrix, ans, knights);
            return;
        }
        if (!matrix[row][col]) {
            matrix[row][col] = true;
            ans[row][col] = true;
            mark_attacks(row, col, matrix);
            knights(row, col + 1, matrix, ans, knights - 1);
            matrix[row][col] = false;
            ans[row][col] = false;
            unmark_attacks(row, col, matrix);
        }
        knights(row, col + 1, matrix, ans, knights);
    }

    private static void mark_attacks(int row, int col, boolean[][] matrix) {
        //1
        if (isValid(row + 2, col - 1, matrix)) {
            matrix[row + 2][col - 1] = true;
        }
        //2
        if (isValid(row + 2, col + 1, matrix)) {
            matrix[row + 2][col + 1] = true;
        }
        //3
        if (isValid(row + 1, col - 2, matrix)) {
            matrix[row + 1][col - 2] = true;
        }
        //4
        if (isValid(row - 1, col - 2, matrix)) {
            matrix[row - 1][col - 2] = true;
        }
        //5
        if (isValid(row + 1, col + 2, matrix)) {
            matrix[row + 1][col + 2] = true;
        }
        //6
        if (isValid(row - 1, col + 2, matrix)) {
            matrix[row - 1][col + 2] = true;
        }
        //7
        if (isValid(row - 2, col + 1, matrix)) {
            matrix[row - 2][col + 1] = true;
        }
        //8
        if (isValid(row - 2, col - 1, matrix)) {
            matrix[row - 2][col - 1] = true;
        }
    }

    private static void unmark_attacks(int row, int col, boolean[][] matrix) {
        //1
        if (isValid(row + 2, col - 1, matrix)) {
            matrix[row + 2][col - 1] = false;
        }
        //2
        if (isValid(row + 2, col + 1, matrix)) {
            matrix[row + 2][col + 1] = false;
        }
        //3
        if (isValid(row + 1, col - 2, matrix)) {
            matrix[row + 1][col - 2] = false;
        }
        //4
        if (isValid(row - 1, col - 2, matrix)) {
            matrix[row - 1][col - 2] = false;
        }
        //5
        if (isValid(row + 1, col + 2, matrix)) {
            matrix[row + 1][col + 2] = false;
        }
        //6
        if (isValid(row - 1, col + 2, matrix)) {
            matrix[row - 1][col + 2] = false;
        }
        //7
        if (isValid(row - 2, col + 1, matrix)) {
            matrix[row - 2][col + 1] = false;
        }
        //8
        if (isValid(row - 2, col - 1, matrix)) {
            matrix[row - 2][col - 1] = false;
        }
    }

    static boolean isValid(int row, int col, boolean[][] matrix) {
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length);
    }


    private static void print_ans(boolean[][] matrix) {
        for (boolean[] arr : matrix) {
            for (boolean x : arr) {
                if (x) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

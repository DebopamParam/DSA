package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

/*
   Step1 :check isValid (is safe to place)
   Step2 :Change the matrix[row][col] = true;
   Step3 :Count++
   Step4 :If count == 4 -> found ans -> Return
   Step5 :for(......) loop
 */

public class N_Queens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Matrix (n x n) : ");
        int n = in.nextInt();
        boolean[][] matrix = new boolean[n][n];

//        boolean[][] matrix = {
//                {false, false, false, false},
//                {false, false, false, false},
//                {false, false, false, false},
//                {false, false, false, false}
//        };

        int[][] ans = new int[n][n];

        sol_matrix(-1, 0, matrix, ans, 0);

    }

    static void sol_matrix(int row, int col, boolean[][] matrix, int[][] ans, int count) {

        if (row >= 0) {
            if (check_invalid(row, col, matrix)) {
                return;
            }
            matrix[row][col] = true;
            ans[row][col] = 1;
            count++;
            if (count == matrix.length) {
                // We found one Answer
                //Print the answer
                for (int[] arr : ans) {
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println();
                matrix[row][col] = false;
                ans[row][col] = 0;
                return;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sol_matrix(row + 1, i, matrix, ans, count);
        }
        if (row >= 0) {
            matrix[row][col] = false;
            ans[row][col] = 0;
        }
    }

    static boolean check_invalid(int row, int col, boolean[][] matrix) {
        //check up
        boolean checkup = check_up(row, col, matrix);
        //check north_east_diagonal
        boolean check_ne = check_ne(row, col, matrix);
        //check north_west_diagonal
        boolean check_nw = check_nw(row, col, matrix);

        return !(check_ne && checkup && check_nw);
    }

    private static boolean check_nw(int row, int col, boolean[][] matrix) {
        row--;
        col--;
        while (row >= 0 && col >= 0 && !matrix[row][col]) {
            row--;
            col--;
        }
        return (row < 0 || col < 0);
    }

    private static boolean check_ne(int row, int col, boolean[][] matrix) {
        row--;
        col++;
        while (row >= 0 && col < matrix[0].length && !matrix[row][col]) {
            row--;
            col++;
        }
        return (row < 0 || col > matrix[0].length - 1);
    }

    private static boolean check_up(int row, int col, boolean[][] matrix) {
        row--;
        while (row >= 0 && !matrix[row][col]) {
            row--;
        }
        return (row < 0);
    }

}

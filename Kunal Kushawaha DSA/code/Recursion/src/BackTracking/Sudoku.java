package BackTracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] ans = new char[9][9];
        copy(board,ans);
        solve(ans, 0, 0,board);
        for(char[] arr:board)
        {
            System.out.println(Arrays.toString(arr));
        }
    }

    static void solve(char[][] board, int row, int col,char[][] ans) {
        if (row == board.length - 1 && col >= board.length) {
            copy(board,ans);
            return;
        } else if (col >= board.length) {
            solve(board, row + 1, 0,ans);
        } else if (board[row][col] != '.') {
            solve(board, row, col + 1,ans);
        } else {
            for (char i = '1'; i <= '9'; i++) {
                board[row][col] = i;
                if (isSafe(board, row, col)) {
                    solve(board, row, col + 1,ans);
                }
                board[row][col] = '.';
            }
        }

    }

    static void copy(char[][] src, char[][] dest)
    {
        for(int i = 0 ; i<9 ; i++)
        {
            for(int j = 0 ; j<9 ; j++)
            {
                dest[i][j] = src[i][j];
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        char item = board[row][col];
        //Check Horizontal
        for (int i = 0; i < board.length; i++) {
            if (i != col && board[row][i] == item) {
                return false;
            }
        }
        //Check Vertical
        for (int i = 0; i < board.length; i++) {
            if (i != row && board[i][col] == item) {
                return false;
            }
        }
        //Check Box
        int start_row = row - row % 3;
        int start_col = col - col % 3;
        for (int i = start_row; i < start_row + 3; i++) {
            for (int j = start_col; j < start_col + 3; j++) {
                if (i != row && j != col && board[i][j] == item) {
                    return false;
                }
            }
        }
        return true;
    }
}

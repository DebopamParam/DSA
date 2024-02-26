public class Test {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }
    static public void gameOfLife(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print("[ " + row + "," + col + " ] = ");
                int count = countLive(board, row, col);
                System.out.println(count);
                if(board[row][col] == 0 && count == 3)
                {
                    board[row][col] = 1 ;
                }
                else if(board[row][col] == 1 && (count == 2 || count==3))
                {
                    board[row][col] = 1;
                }
                else if(board[row][col] == 1 && count>3)
                {
                    board[row][col] = 0;
                }
                else if(board[row][col] == 1 && count<2)
                {
                    board[row][col] = 0;
                }
            }
        }
    }

    static int countLive(int[][] board, int row, int col) {
        int count = 0;
        int r_max = board.length - 1;
        int c_max = board[0].length - 1;
        // check top
        if (row - 1 >= 0) {
            if (board[row - 1][col] == 1) {
                count++;
            }
        }
        // check top left
        if (row - 1 >= 0 && col - 1 >= 0) {
            if (board[row - 1][col - 1] == 1) {
                count++;
            }
        }
        // check left
        if (col - 1 >= 0) {
            if (board[row][col - 1] == 1) {
                count++;
            }
        }
        // check bottom left
        if (row + 1 <= r_max && col - 1 >= 0) {
            if (board[row + 1][col - 1] == 1) {
                count++;
            }
        }
        // check bottom
        if (row + 1 <= r_max) {
            if (board[row + 1][col] == 1) {
                count++;
            }
        }
        // check bottom right
        if (row + 1 <= r_max && col + 1 <= c_max) {
            if (board[row + 1][col + 1] == 1) {
                count++;
            }
        }
        // check right
        if (col + 1 <= c_max) {
            if (board[row][col + 1] == 1) {
                count++;
            }
        }
        // check top right
        if (row - 1 >= 0 && col + 1 <= c_max) {
            if (board[row - 1][col + 1] == 1) {
                count++;
            }
        }
        return count;
    }
}

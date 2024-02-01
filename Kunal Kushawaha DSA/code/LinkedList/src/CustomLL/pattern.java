package CustomLL;

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2 * n; row++) {
            if (row <= n) {
                //print spaces
                for (int i = 0; i < row - 1; i++) {
                    System.out.print("  ");
                }
                //print *
                for (int i = 0; i < n - row + 1; i++) {
                    System.out.print("*   ");
                }
                System.out.println();
            } else {
                //print spaces
                for (int i = 0; i < 2 * n - row; i++) {
                    System.out.print("  ");
                }
                //print *
                for (int i = 0; i < row - n; i++) {
                    System.out.print("*   ");
                }
                System.out.println();
            }
        }
    }
}

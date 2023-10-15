package patterns;

public class triangle1 {

    static void wall()
    {
        System.out.println("-----------------------------------------");
    }
    static void pattern1(int n)
    {
        for (int row = 1; row <= n; row++) {
            //for every row the number of cols
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int col = n-row+1; col>0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        for(int row = 1 ; row<=n ; row++)
        {
            for(int col = 1 ; col<=row ; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int row = 1 ; row<2*n ; row++)
        {
            int total_col_for_row = row>n? 2*n - row : row ;
            for (int col = 0; col < total_col_for_row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int row = 1 ; row<2*n ; row++)
        {
            int space_per_row = row<=n? n-row : row-n ;
            int star_per_row = n - space_per_row ;
            for (int space = 1; space <= space_per_row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= star_per_row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        wall();
        pattern2(4);
        wall();
        pattern3(5);
        wall();
        pattern4(5);
        wall();
        pattern5(5);

    }
}

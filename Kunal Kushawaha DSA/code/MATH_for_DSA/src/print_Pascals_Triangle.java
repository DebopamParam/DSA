import java.util.Scanner;

public class print_Pascals_Triangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = i ; j<n ; j++ )
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }

            for(int j = 1 ; j<i ; j++)
            {
                System.out.print((i-j)+" ");
            }

            System.out.println();
        }
    }
}

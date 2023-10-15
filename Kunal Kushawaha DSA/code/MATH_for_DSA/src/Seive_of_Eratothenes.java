import java.util.Scanner;

public class Seive_of_Eratothenes {

    static boolean check_prime(int x)
    {
        for(int i = 2 ; i<=Math.sqrt(x) ; i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // print all prime numbers from 2 to n

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();

        boolean[] arr = new boolean[n+1]; // By default, all the values will be - False
                                          // we are doing n+1 to match the index with the numbers

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if( !arr[i] && check_prime(i) )
            {
                for (int j = i + i ; j < arr.length; j+= i ) {
                    arr[j]=true;
                }
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if(!arr[i])
            {
                System.out.println(i);
            }
        }

    }

}

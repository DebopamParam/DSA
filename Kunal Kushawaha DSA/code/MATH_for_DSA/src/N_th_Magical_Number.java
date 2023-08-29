public class N_th_Magical_Number {

    //A positive integer is magical if it is divisible by either a or b.
    //
    //Given the three integers n, a, and b, return the nth magical number.
    // Since the answer may be very large, return it modulo 10^9 + 7

    static int findNthTerm(int A, int B, int n) {
        long i = Math.min(A, B);
        while(n>0)
        {
            if(i%A==0 || i%B==0)
            {
                n--;
            }
            i++;
        }
        return (int)(i-1);
    }

    // Driver code
    public static void main(String[] args) {
        int a = 2, b = 5, n = 10;
        System.out.println(findNthTerm(a, b, n));
    }

}

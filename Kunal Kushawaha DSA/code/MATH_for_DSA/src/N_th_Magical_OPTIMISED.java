public class N_th_Magical_OPTIMISED {

    static long mod = (long)(Math.pow(10,9)+7);

    static long gcd (long a , long b )
    {
        if(b==0)
        {
            return a ;
        }

        return gcd(b, a%b);
    }

    static long lcm(long a , long b)
    {
        return (a*b)/gcd(a,b);
    }

    public static int nthMagicalNumber(int n, int a, int b) {

        // We know , from 1->n , the number of elements divisiible by "a"
        // [n/a]
        // from 1->n , the number of elements divisiible by "b"
        // [n/b]

        // The number of elements(numbers) divisible by both a & b id
        // total = [n/a] + [n/b] - [n/lcm(a,b)]

        long low = 0 , high = Long.MAX_VALUE;

        long lcm = lcm(a,b);

        while(low<high)
        {
            long mid = low + (high-low)/2;
            long target = (mid/a)+(mid/b)-(mid/lcm);

            if (n>target)
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }

        }

        return (int)(low%mod);

    }

    public static void main(String[] args) {
        int n = 1 , a = 2 , b = 3 ;
        System.out.println(nthMagicalNumber(n,a,b));
    }

}

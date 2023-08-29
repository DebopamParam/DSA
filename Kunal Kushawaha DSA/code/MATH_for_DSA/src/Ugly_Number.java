public class Ugly_Number {

    //An ugly number is a positive integer that is divisible by a, b, or c.
    //
    //Given four integers n, a, b, and c, return the nth ugly number.

    static long gcd(long a , long b)
    {
        if (b == 0 )
        {
            return a ;
        }
        while(a%b!=0)
        {
            long temp = a%b;
            a = b ;
            b = temp;
        }
        return b ;
    }

    static long lcm(long a , long b)
    {
        return (a*b)/gcd(a,b);
    }

    public static int nthUglyNumber(int n, int a, int b, int c) {
        long low = Math.min(a,Math.min(b,c));
        long high = Long.MAX_VALUE;
        long lcm_ab = lcm(a,b);
        long lcm_bc = lcm(b,c);
        long lcm_ac = lcm(a,c);
        long lcm_of_3 = lcm(a,lcm(b,c));

        while(low<high)
        {
            long mid = low+(high-low)/2;
            long target = (mid/a)+(mid/b)+(mid/c)-(mid/lcm_ab )-(mid/lcm_bc)-(mid/lcm_ac)+(mid/lcm_of_3);
            if(n>target)
            {
                low = mid+1;
            }
            else
            {
                high = mid ;
            }
        }
        return (int)(low);
    }

    public static int nthUglyNumber_unoptimised(int n, int a, int b, int c) {
        long i = Math.min(a,Math.min(b,c));
        while(n>0)
        {
            if(i%a==0 || i%b==0 || i%c==0)
            {
                n--;
            }
            i++;
        }
        return (int)(i-1);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(nthUglyNumber(657456657,4,7,19));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        System.out.println(nthUglyNumber_unoptimised(657456657,4,7,19));
        end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}

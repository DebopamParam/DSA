package easy_questions;

public class Palindrome {

    static int reverse(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        int pow = (int) Math.log10(n); // No of digits in a Base 10 number is integral part of [log10(n)] + 1
                                        // Here power = digits - 1
        return (n%10)*(int)Math.pow(10,pow) + reverse(n/10);
    }

    static boolean palindrome(int n)
    {
        return (n==reverse(n));
    }
    static boolean palindrome(String s )
    {
        int start = 0 ;
        int end = s.length() - 1 ;
        return helper(s ,start ,end);
    }

    static boolean helper(String s , int start , int end)
    {
        if(start>end )
        {
            return true;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        return helper(s,start+1 , end-1);

    }

    public static void main(String[] args) {
        int n = 43598;
        System.out.println(reverse(n));

        System.out.println(palindrome("abcdcba"));
    }
}

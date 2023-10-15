package easy_questions;

import static easy_questions.Palindrome.helper;

public class Count_Zeros {

    static int count_zeros(int n)
    {
        int count = 0 ;
        return helper(n , count);
    }

    private static int helper(int n, int count) {
        if(n==0)
        {
            return count;
        }
        if(n%10==0)
        {
            count++;
        }
        return helper(n/10,count);
    }

    public static void main(String[] args) {
        int n = 400000002;
        System.out.println(count_zeros(n));
    }
}

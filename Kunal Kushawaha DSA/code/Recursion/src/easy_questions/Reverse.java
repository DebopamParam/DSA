package easy_questions;

public class Reverse {

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

    public static void main(String[] args) {
        int n = 43598;
        System.out.println(reverse(n));
    }
}

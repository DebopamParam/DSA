package easy_questions;

public class Sum_of_Digits {
    static int sod(int n)
    {
        if(n==0)
        {
            return 0 ;
        }
        return (n%10)+sod(n/10);
    }

    static int prod(int n)
    {
        if(n==0)
        {
            return 1 ;
        }
        return (n%10)*prod(n/10);
    }

    public static void main(String[] args) {
        int n = 667498;
        System.out.println(sod(n));
        System.out.println(prod(n));
    }


}

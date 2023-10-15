package easy_questions;

public class print_1toN {
    static void print(int n)
    {
        if (n==0)
        {
            return ;
        }
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 8 ;
        print(n);
    }
}

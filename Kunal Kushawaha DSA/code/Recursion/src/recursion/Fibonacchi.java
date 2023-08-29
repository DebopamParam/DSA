package recursion;

public class Fibonacchi {

    public static void main(String[] args) {

        System.out.println(fibonacci(6));

//        System.out.println(using_math_fibo(50));
    }

    static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static long using_math_fibo(int n)
    {
        double a = 1/Math.sqrt(5);
        double x = Math.pow((1+Math.sqrt(5))/2,n);
        double y = Math.pow((1-Math.sqrt(5))/2,n);

        return (long)(a*(x-y));
    }

}

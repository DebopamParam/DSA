package recursion;

public class Numbers_Exmple {
    public static void main(String[] args) {

        print(5);

    }
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}

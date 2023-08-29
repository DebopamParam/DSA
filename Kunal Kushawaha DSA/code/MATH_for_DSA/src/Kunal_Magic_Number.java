public class Kunal_Magic_Number {

    //Convert into Binary
    // Take the power of 5  and Multiply

    static int magic(int n )
    {
        int sum = 0 ;
        int base = 5 ;
        while(n>0)
        {
            int term = n&1;
            sum += base*term;
            base*=5;
            n=n>>1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(magic(5));
    }

}

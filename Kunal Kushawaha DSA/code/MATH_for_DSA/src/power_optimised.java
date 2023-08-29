public class power_optimised {

    // base^power

    static int power(int base , int power)
    {
        int ans = 1 ;
        while (power>0)
        {
            if((power&1)==1)
            {
                ans = ans * base;
            }
            base*=base;
            power=power>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(3,6));
    }
}

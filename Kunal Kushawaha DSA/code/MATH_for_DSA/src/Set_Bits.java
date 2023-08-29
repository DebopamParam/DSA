public class Set_Bits {
    static int no_of_set_bits(int n)
    {
        int count = 0;

        while(n>0)
        {
            count++;
            n = n-(n&(-n));
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(no_of_set_bits(7));
    }
}

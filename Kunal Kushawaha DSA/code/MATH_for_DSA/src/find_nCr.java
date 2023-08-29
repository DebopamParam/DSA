public class find_nCr {
    static int find_nCr(int n , int r )
    {
        r = Math.min(r , n-r);
        double total = 1 ;
        for (int i = 0; i < r; i++) {
            total = total * (n-i) / (i+1);
        }
        return (int)total;
    }

    public static void main(String[] args) {
        System.out.println(find_nCr(10,7));
    }
}

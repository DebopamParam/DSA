public class Sum_XOR {

    // This will give XOR (o to a)
    static int xor(int a )
    {
        int x = a%4 ;
        return switch (x) {
            case 0 -> a;
            case 1 -> 1;
            case 2 -> a + 1;
            case 3 -> 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        // Find xor between a and b
        int a = 3 ;
        int b = 9 ;

        // range XOR
        int sum = xor(b) ^ xor(a-1);

        System.out.println(sum);
    }

}

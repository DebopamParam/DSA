package recursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Bitwise_Examples {

    // Check odd / even
    static void isEvenOdd(int n)
    {
        if((n&1) == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }


    //Find Unique in Array
    static int findUnique(int[] arr)
    {
        int x = 0 ;
        for(int a : arr)
        {
            x = x^a;
        }
        return x ;
    }

    static int set_ith_bit(int n , int i)
    {
        return n | (1<<i);
    }

    static int reset(int n , int i )
    {
        return n & (~(1<<i));
    }


    static int find_ith_bit(int n , int i )
    {
        return (n>>i)&1;
    }
    public static void main(String[] args) {

//        isEvenOdd(8);
//
//        System.out.println(Integer.toBinaryString(182));
//
//        System.out.println(find_ith_bit(182,4));

        int x = 346;
        System.out.println("Before setting\n"+Integer.toBinaryString(x));
        x = set_ith_bit(x , 5);
        System.out.println("After setting\n"+Integer.toBinaryString(x));

        System.out.println("After resetting\n" + Integer.toBinaryString(reset(x,5)));

    }
}

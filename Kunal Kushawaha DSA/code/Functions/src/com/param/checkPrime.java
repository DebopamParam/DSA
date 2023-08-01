package com.param;

import java.util.Scanner;

public class checkPrime {

    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();

        if(isPrime(n))
        {
            System.out.println(n+" is a Prime number");
        }
        else
        {
            System.out.println(n+" is not a Prime number");
        }
    }

    static boolean isPrime(int n )
    {
        for (int i = 2; i < n / 2; i++) {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

package com.param;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original = n;
        int sum=0;
        while(n>0)
        {
            int digit = n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(sum==original)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }

}

package com.param;

import java.util.Arrays;
import java.util.Scanner;

public class String_immutability {

//    public static void main(String[] args) {
//
//        String[] s = {"Ami","Tomake","Bhalobashi"};
//        System.out.println(Arrays.toString(s));
//        change(s);
//        System.out.println(Arrays.toString(s));
//    }
//
//    static void change(String[] arr)
//    {
//        arr[0]="Tumi aaa";
//    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
            s[i] = in.nextLine();
        }

        for(String a : s)
        {
            System.out.println(a);
        }
    }

}

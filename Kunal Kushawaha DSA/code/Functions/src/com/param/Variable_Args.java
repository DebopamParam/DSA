package com.param;

import java.util.Arrays;

public class Variable_Args {
    public static void main(String[] args) {

        fun(10,20,"Hello World","I am AI", "I will take over the World");

    }

    static void fun(int a  , int b , String ...v) // Varible length args should be always kept at last in args list
    {
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(v));
    }

}

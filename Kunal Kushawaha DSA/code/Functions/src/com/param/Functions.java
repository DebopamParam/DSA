package com.param;


import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        swap(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] array)
    {
        array[0]=100;
    }

}

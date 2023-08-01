package com.param;

public class search_in_2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,5,4},
                {2,5,7,5},
                {2,3,12,78}
        };
        print(arr);

        System.out.println(search(arr,99));
    }

    static void print(int[][] arr)
    {
        for(int[] x : arr)
        {
            for(int y : x)
            {
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }

    static boolean search(int[][] arr , int key)
    {
        for(int[] i : arr)
        {
            for (int j : i)
            {
                if(j==key)
                {
                    return true;
                }
            }
        }
        return false;
    }
}

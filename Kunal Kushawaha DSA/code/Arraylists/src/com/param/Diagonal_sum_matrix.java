package com.param;

public class Diagonal_sum_matrix {
    public static int diagonalSum(int[][] mat) {
        int sum = 0 ;
        //Primary Diagonal
        for(int i = 0 ; i<mat.length ; i++)
        {
            sum+=mat[i][i];
        }
        //Secondary Diagonal
        for(int col = mat.length - 1 , row = 0 ; col>=0; col-- , row++)
        {
            if(col!=row) // If n is odd - Matrix[i][i] in the middle is already considered in 1st diaginal. This ignore
            {
                sum+=mat[row][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int [][]arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][]arr2 = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        int [][]arr3 = {
                {5}
        };

        System.out.println(diagonalSum(arr1));


    }
}

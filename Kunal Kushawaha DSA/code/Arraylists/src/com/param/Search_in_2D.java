package com.param;

public class Search_in_2D {

//    public static boolean searchMatrix(int[][] matrix, int target) {
//
//        for (int[] row : matrix) {
//            for (int element : row) {
//                if(element == target)
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


  /*  static boolean bin_search(int[] arr , int key)
    {
        int l = 0 , h = arr.length - 1 ;
        while (l<=h)
        {
            int mid = (l+h)/2;
            if(arr[mid]==key)
            {
                return true;
            }
            else if (key>arr[mid]) {
                l = mid+1 ;
            }
            else
            {
                h = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        boolean found = false ;

        for(int[] row_arr : matrix)
        {
            found =  bin_search(row_arr , target);

            if(found)
            {return true;}
        }
        return false;
    } */


    public static boolean searchMatrix(int[][] matrix , int key)
    {
        for(int row = 0 , col = matrix[0].length - 1 ; row<matrix.length && col>=0 ; )
        {
            if (matrix[row][col]==key)
            {
                System.out.println("Index : ( "+ row + "," + col + " )");
                return true;
            }
            if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,38},
                {32,33,39,50}
        };

        System.out.println(searchMatrix(arr,50));
    }

}

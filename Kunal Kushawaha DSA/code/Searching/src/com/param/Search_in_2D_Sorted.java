package com.param;

public class Search_in_2D_Sorted {
    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        System.out.println(searchMatrix(arr,3));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row_start = 0 , row_end = matrix.length-1;
        while(row_start<=row_end)
        {
            int mid = row_start+(row_end - row_start)/2;
            if(target>=matrix[mid][0] && target<= matrix[mid][matrix[mid].length-1])
            {
                return binarySearch(matrix[mid] , target , 0 , matrix[mid].length-1);
            }
            else if(target>matrix[mid][0])
            {
                row_start = mid+1;
            }
            else
            {
                row_end = mid - 1;
            }
        }
        return false;

    }
    static boolean binarySearch(int[] arr , int target , int start , int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return false;
    }
}

package com.param;


class Check_Sorted
{

    static boolean check_a_sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    static boolean check_d_sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isSorted(int[] arr)
    {
        return check_a_sort(arr) || check_d_sort(arr);
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isSorted(a));

    }
}
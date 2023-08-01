package com.param;

public class Linear_Search {

    public static void main(String[] args) {

        int[] array = {1 , 33, 54 , -21 , 76, 12 , 98};

        System.out.println("Element found at index " + search(array , 12));
        System.out.println(isThere(array,98));

    }

    static int search(int[] arr, int target)
    {
        if(arr.length == 0 )
        {
            System.out.println("Array is empty.");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    static boolean isThere(int[] arr , int target)
    {
        if(arr.length==0)
        {
            System.out.println("Empty Array");
            return false;
        }
        for(int element : arr)
        {
            if(element == target)
            {
                return true;
            }
        }
        return false;
    }
}

package com.param;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        System.out.println("Enter size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(arr));
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++ )
        {
            boolean notPassed = true;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j]>arr[j+1])
                {
                    // To see whether any pass is happening (notPassed=true)
                    //If no swap is done that means the array is already sorted
                    //WE can come out of this loop
                    notPassed = false;

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(notPassed)
            {
                break;
            }
        }
    }

}

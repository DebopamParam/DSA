package practice;

import java.util.Arrays;
public class Quicl {
    static void sort(int[] arr , int start , int end)
    {
        if(start>=end)
        {
            return;
        }

        int i = start ;
        int j = end ;
        int mid = i + (j-i)/2;
        int pivot = arr[mid];

        while (i<=j)
        {
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        sort(arr,i,end);
        sort(arr,start,j);
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,60,5,4,19,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

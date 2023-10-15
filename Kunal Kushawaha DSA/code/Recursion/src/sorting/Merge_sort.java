package sorting;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    static int[] merge(int[] first , int[] second)
    {
        int[] mix = new int[first.length+second.length];

        int i = 0 , j = 0 , k = 0 ;

        while(i< first.length && j< second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< first.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
}

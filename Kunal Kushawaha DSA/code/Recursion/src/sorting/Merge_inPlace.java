package sorting;

import java.util.Arrays;

public class Merge_inPlace {
    public static void main(String[] args) {
        int[] arr = {5,6,7,3,2,1,9,4,-3};
        merge_sort_inPlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void merge_sort_inPlace(int[] arr)
    {
        if(arr.length==0)
        {
            return;
        }
        int start = 0 , end = arr.length-1;
        sort(arr,start,end);
    }

    static void sort(int[] arr , int start ,int end)
    {
        if(end==start)
        {
            return;
        }

        int mid = start + (end-start)/2;

        sort(arr,start,mid);
        sort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid+1;
        int k = 0 ;

        int[] aux = new int[end-start+1];

        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                aux[k++]=arr[i++];
            }
            else
            {
                aux[k++]=arr[j++];
            }
        }

        while(i<=mid)
        {
            aux[k++]=arr[i++];
        }
        while(j<=end)
        {
            aux[k++]=arr[j++];
        }

        System.arraycopy(aux, 0, arr, start, aux.length);
    }
}

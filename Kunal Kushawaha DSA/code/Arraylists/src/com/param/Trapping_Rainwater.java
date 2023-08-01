package com.param;

public class Trapping_Rainwater {

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

    static int[] find_lmb (int[] arr)
    {
        int[] l_max = new int[arr.length];
        l_max[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            l_max[i]= Math.max(l_max[i - 1], arr[i]);
        }
        return l_max;
    }

    static int[] find_rmb(int[] arr)
    {
        int[] r_max = new int[arr.length];
        int n = r_max.length-1;

        r_max[n]=arr[n];

        for (int i = n; i >0 ; i--) {
            r_max[i-1]=Math.max(r_max[i],arr[i-1]);
        }

        return r_max;
    }


    public static int trap(int[] height)
    {
        int count = 0;

        //Exit Cases
        if(height.length==0 || height.length==1)
        {
            return 0;
        }
        if(isSorted(height))
        {
            return 0;
        }

        int[] left_max = find_lmb(height);
        int[] right_max = find_rmb(height);

        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(left_max[i],right_max[i]);
            int x = waterlevel-height[i];
            if(x>0)
            {
                count+=x;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(arr));
    }
}

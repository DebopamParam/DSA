package com.param;
import java.util.ArrayList;
import java.util.List;

public class Duplicate_numbers {
    public static void main(String[] args) {
        int[] arr = {10,2,5,10,9,1,1,4,3,7};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length == 0){
            return list;
        }

        //Flagging Technique

        for(int i = 0 ; i<nums.length ; i++)
        {
            int accessed_index = Math.abs(nums[i])-1;
            if(nums[accessed_index]>=0)
            {
                nums[accessed_index]*= -1;
            }
            else
            {
                list.add(accessed_index+1);
            }
        }

        return list;

    }
}

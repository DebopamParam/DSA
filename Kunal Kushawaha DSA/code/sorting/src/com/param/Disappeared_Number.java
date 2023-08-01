package com.param;

import java.util.List;
import java.util.ArrayList;

public class Disappeared_Number {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

//    static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> a = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int idx = Math.abs(nums[i]) - 1;
//            if (nums[idx] > 0) {
//                nums[idx] *= -1;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0)
//                a.add(i + 1);
//        }
//        return a;
//    }




    //Bad space complaxity
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] freq = new int[len + 1];

        // freq = {0,0,0,0,0,0,0,0,0}

        List<Integer> res = new ArrayList<>();

        //Making the index of the available numbers 1 in the freq array
        for (int x : nums) {
            freq[x]++;
        }

        //        →               ↞ start checking from index 1
        //freq {0,1,1,1,0,1,1,0,1,1}
        for (int i = 1; i < len + 1; i++) {
            if (freq[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }

}

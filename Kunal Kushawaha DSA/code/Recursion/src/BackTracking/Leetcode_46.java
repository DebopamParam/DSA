package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums,0,list,ans);
        return ans;
    }
    static void helper(int[] nums, int index, List<Integer> list, List<List<Integer>> ans)
    {
        if(index>=nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ; i<=list.size(); i++)
        {
            if(list.isEmpty())
            {
                List<Integer> first = new ArrayList<>();
                first.add(nums[index]);
                helper(nums,index+1,first,ans);
            }
            else
            {
                List<Integer> first = list.subList(0,i);
                int second = nums[index];
                List<Integer> third = list.subList(i, nums.length-1);
                first.add(second);
                first.addAll(third);
                helper(nums,index+1,first,ans);
            }
        }
    }
}

package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_77 {

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    static public List<List<Integer>> combine(int n, int k) {
        List<Integer> take = new ArrayList<Integer>();
        List<Integer> ignore = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        comb(n,k,1,take,ignore,ans);
        return ans;
    }
    static void comb(int n, int k, int num, List<Integer> take, List<Integer> ignore,List<List<Integer>> ans)
    {
        if(take.size()==k)
        {
            ans.add(new ArrayList<>(take));
            return;
        }
        if(num>n)
        {
            return;
        }
        //Ignore
        comb(n,k,num+1,take,ignore,ans);
        //Take
        take.add(num);
        comb(n,k,num+1,take,ignore,ans);
        take.remove(take.size()-1);
    }
}

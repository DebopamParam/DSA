package Sub_Sets;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequences {

    public static void main(String[] args) {
        String name = "param";
        System.out.println(SubSq(name));
    }

    static List<String> SubSq(String str)
    {
        List<String> ans = new ArrayList<String>();
        helper(str,"",0,ans);
        return ans;
    }

    static void helper(String str, String curr , int index , List<String> ans)
    {
        if(index == str.length())
        {
            ans.add(curr);
            return;
        }
        helper(str, curr + str.charAt(index), index+1, ans);
        helper(str , curr , index+1 , ans);
    }

}
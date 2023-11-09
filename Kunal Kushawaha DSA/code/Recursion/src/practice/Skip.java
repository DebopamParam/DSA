package practice;

public class Skip {
    public static void main(String[] args) {
        System.out.println(skip("abcdabcd",'a',0,""));
        System.out.println(skip_string("Hello I am Param from kolkata","",0,"param"));
    }

    static String skip(String str , char ch, int index , String ans)
    {
        if(index >= str.length())
        {
            return ans;
        }

        if(str.charAt(index)!=ch)
        {
            ans = ans + str.charAt(index);
        }
        return skip(str, ch, index+1, ans);
    }

    static String skip_string(String str, String ans, int index, String skip )
    {
        if(index>=str.length())
        {
            return ans;
        }

        if(str.toLowerCase().startsWith(skip.toLowerCase(),index))
        {
            index += skip.length();
        }
        else
        {
            ans = ans + str.charAt(index);
            index++;
        }
        return skip_string(str,ans,index,skip);
    }

}

package string;

public class Remove_a_character {

    public static void main(String[] args) {

        String s = "apple is good for health applause. That's why I ate an apple. I have built an app. :)";

//        StringBuffer ans = new StringBuffer();
//
//        ans =  remove_a_character(s,'a',ans,0);
//
//        System.out.println(ans);

//        System.out.println(skip(s));
//        System.out.println(skip_a_string(s,"Apple",0,new StringBuffer()));

        System.out.println(skip_app_if_not_apple(s,0,new StringBuffer()));

    }

    static StringBuffer remove_a_character(String str , char c , StringBuffer ans , int index )
    {
        if(index>=str.length())
        {
            return ans;
        }

        if (str.charAt(index) != c) {
            ans.append(str.charAt(index));
        }
        return remove_a_character(str ,c ,ans ,index+1);

    }

    static StringBuffer skip_a_string(String str , String skip , int index , StringBuffer ans)
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
            ans.append(str.charAt(index));
            index++;
        }
        return skip_a_string(str, skip, index, ans);

    }

    static StringBuffer skip_app_if_not_apple(String str, int index , StringBuffer ans)
    {
        if(index>=str.length())
        {
            return ans;
        }

        if( str.startsWith("app",index) && (!str.startsWith("apple",index)))
        {
            index += "app".length();
        }
        else
        {
            ans.append(str.charAt(index));
            index++;
        }
        return skip_app_if_not_apple(str,index, ans);

    }

    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        char ch = str.charAt(0);

        if(ch=='a')
        {
            return skip(str.substring(1));
        }
        else
        {
            return ch + skip(str.substring(1));
        }

    }


}

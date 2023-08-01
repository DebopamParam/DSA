package com.param;

public class Palindrome {
    public static void main(String[] args) {

        String s = "race a car";

        System.out.println(isPalindrome(s));


    }

//    public static boolean isPalindrome(String s) {
//        s=s.toLowerCase();
//        StringBuilder str = new StringBuilder();
//        for(int i = 0 ; i<s.length() ; i++)
//        {
//            char ch = s.charAt(i);
//            if(Character.isAlphabetic(ch))
//            {
//                str.append(ch);
//            }
//        }
//
//        String clean_string = str.toString();
//        String clean_string_reverse = str.reverse().toString();
//
//        if(clean_string.equals(clean_string_reverse))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

    static boolean isPalindrome(String s)
    {
        int start = 0 ;
        int end = s.length() - 1 ;
        while(start<=end)
        {
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(currStart))
            {
                start++;
            } else if (!Character.isLetterOrDigit(currEnd)) {
                end--;
            }
            else
            {
                if(Character.toLowerCase(currStart)!=Character.toLowerCase(currEnd))
                {
                    return false;
                }
                start++;
                end--;
            }
        }
        return  true;
    }


}

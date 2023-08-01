package com.param;

import java.util.Arrays;

public class Search_in_String {

    public static void main(String[] args) {

        String name = "Debopam Chowdhury";
        char word = 'r';
        System.out.println(isThere(name,word));
        System.out.println(Arrays.toString( name.toCharArray() ));
        System.out.println(search(name,'h'));
    }





    //Using charAt(index)
    static boolean isThere(String str , char word)
    {
        if(str.length() == 0)
        {
            System.out.println("Khali hai bhaiiiii");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(word == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }



    // Using Character Array [ .toCharArray() ]
    static boolean search(String str , char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char x : str.toCharArray())
        {
            if(x==target)
            {
                return true;
            }
        }
        return false;
    }

}

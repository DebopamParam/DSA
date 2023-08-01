package com.param;

import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
//        String alphabets = "";
//        for (int i = 0; i < 26 ; i++) {
//            char ch = (char)('a'+i);
//            alphabets+= ch + " ";
//        }
//        System.out.println(alphabets);


        // Mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch).append(" | ");
        }
        System.out.println(builder);

        String name = "Debopam Chowdhury Param";
        System.out.println(name.indexOf('C'));
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("     yoyo param ".strip()); // Removes white spaces

        System.out.println(name.equals((builder.reverse().toString()).toLowerCase()));

        System.out.println(builder.equals(name));
    }
}

package com.param;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // Prints the ascii value( integer ) , add them & print the sum
        System.out.println("ab"+"cd"); // Concatenate the two Strings
        System.out.println((char)('a'+1)); // Typecasting the ascii value (a+1)=98 -> which is b to Char
        System.out.println("ab"+1); // Converts 1 to string then concatenate
                                    // NOTE : int will be converted into Integer (wrapper) & it will call .toString()
        System.out.println("arr" + new ArrayList<>());

        // NOTE : When we use ' + ' operator in print -> atleast 1 of the objects must be a string
    }
}

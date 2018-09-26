package com.company.Algorithms.LeetCode;

public class Reverse_String {




    /*
    Write a function that takes a string as input and returns the string reversed.

    Example 1:

    Input: "hello"
    Output: "olleh"


    Example 2:

    Input: "A man, a plan, a canal: Panama"
    Output: "amanaP :lanac a ,nalp a ,nam A"

    */

    public String reverseString(String s) {

        String item = "";

        for(int i = s.length()-1; i >= 0; i--){
            item += s.charAt(i);
        }
        return item;

    }
}

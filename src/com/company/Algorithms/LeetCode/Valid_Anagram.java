package com.company.Algorithms.LeetCode;

import java.util.ArrayList;

public class Valid_Anagram {

    /*
    Given two strings s and t , write a function to determine if t is an anagram of s.

    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true


    Example 2:

    Input: s = "rat", t = "car"
    Output: false
    Note:
    You may assume the string contains only lowercase alphabets.
    
    Follow up:
    What if the inputs contain unicode characters? How would you adapt your solution to such case?

    */


    public boolean isAnagram(String s, String t) {
        boolean d = false;

        ArrayList<String> sSub = getSubstrings(s);
        String item = null;

        for(int i = 0; i < sSub.size()-1; i++){
            item = sSub.get(i).toString();
            if(item.equals(t)){
                d = true;
            }
            if(reverse(item).equals(t)){
                d = true;
            }
        }


        return d;

    }

    public String reverse(String s){

        String item = "";
        for(int i = s.length()-1; i >= 0; i--){
            item += s.charAt(i);
        }
        return item;
    }

    public ArrayList getSubstrings(String s){
        ArrayList<String> items = new ArrayList<>();
        for(int i = 0; i < s.length();i++){
            for(int j = i + 1; j <= s.length();j++){
                items.add(s.substring(i,j));
            }
        }
        return items;
    }

}

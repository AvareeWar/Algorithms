package com.company.Algorithms.LeetCode;

public class First_Unique_Character_In_A_String {


    /*
    Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

    Examples:

    s = "leetcode"
    return 0.

    s = "loveleetcode",
    return 2.

    Note: You may assume the string contain only lowercase letters.

    */

    public int firstUniqChar(String s) {

        int i = 0;

        for(i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                return i;

            }
            else{
                i = -1;
            }
        }
        return i;
    }
}

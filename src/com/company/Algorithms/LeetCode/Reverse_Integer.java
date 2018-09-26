package com.company.Algorithms.LeetCode;

public class Reverse_Integer {

    /*
    Given a 32-bit signed integer, reverse digits of an integer.

    Example 1:

    Input: 123
    Output: 321

    //////////////
    Example 2:

    Input: -123
    Output: -321

    //////////////
    Example 3:

    Input: 120
    Output: 21

    //////////////
    Note:
    Assume we are dealing with an environment which could only store integers
     within the 32-bit signed integer range: [−231,  231 − 1].
     For the purpose of this problem, assume that your function returns 0
      when the reversed integer overflows.
    */


    public int reverse(int x) {

        int number = x;
        int reverse = 0;

        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return (int) reverse;
    }
}

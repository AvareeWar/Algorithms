package com.company.Algorithms.LeetCode;

public class Single_Number {


    public int singleNumber(int[] nums) {


        int x = 0;
        for(int a: nums){
            x = x ^ a;
            //used Xor - bit manipulation
            //XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return
            // 0. Finally only one number left.
        }
        return x;
    }
}

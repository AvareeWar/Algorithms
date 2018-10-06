package com.company.Algorithms.LeetCode;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.junit.Test;

public class Intersection_Of_Two_Arrays {

    /*
        Given two arrays, write a function to compute their intersection.

        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Note:

        Each element in the result should appear as many times as it shows in both arrays.
        The result can be in any order.
        Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?


    */



    public int[] intersect(int[] nums1, int[] nums2) {

        int item =0;
        int val = 0;
        int item2 =0;
        int val2 = 0;

        for(int i = 0; i < nums1.length-1;i++){
            for(int j = 0; j < nums2.length-1;j++){
                int temp = nums1[i];
                int temp2 = nums2[j];
                if(nums1[i] == nums2[j]){
                    while(nums1[i] == nums2[j]){
                        item = nums1[i];
                        if(nums1[i+1] == nums1[j+1]){
                            nums1[i] = nums1[i+1];
                            val = nums1[i];
                        }
                        System.out.println(item + ": " + val);
                        return new int[]{item,val};
                    }
                }
                if(nums2[j] == nums1[i]){
                    while(nums2[j] == nums1[i]){
                        item2 = nums2[j];
                        if(nums2[j+1] == nums1[i+1]){
                            nums2[j] = nums2[j+1];
                            val2 = nums2[j];
                        }
                        System.out.println(item2 + ": " + val2);
                        return new int[]{item2,val2};
                    }
                }
            }
        }
        throw new IllegalArgumentException();

    }

    @Test
    public void testintersect(){
        int[] items = new int[]{1,2,3,4,5};
        int[] items2 = new int[]{1,2,3};

        intersect(items, items2);
    }
}

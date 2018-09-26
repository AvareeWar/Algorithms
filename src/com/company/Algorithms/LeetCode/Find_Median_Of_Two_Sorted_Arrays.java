package com.company.Algorithms.LeetCode;

public class Find_Median_Of_Two_Sorted_Arrays {


    /*
    There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    You may assume nums1 and nums2 cannot be both empty.

    ///////////////////
    Example 1:

    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0

    ///////////////////
    Example 2:

    nums1 = [1, 2]
    nums2 = [3, 4]

    The median is (2 + 3)/2 = 2.5

    */


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int median = 0;
        int num1EndIndex = 0;
        int num2BeginningIndex = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){

                num1EndIndex = nums1[nums1.length-1];
                //System.out.println(num1EndIndex);
                num2BeginningIndex = nums2[0];
                //System.out.println(num2BeginningIndex);

                if(num1EndIndex > num2BeginningIndex){
                    median = (num1EndIndex + num2BeginningIndex / 2);
                    System.out.println(median);
                }
                else{
                    median = (num2BeginningIndex);
                }
            }
        }
        return median;

    }
}

package com.company.Algorithms.Basics;

import org.junit.Test;

public class QuickSort {


    //NOT COMPLETED-----------------------------------

    public int[] quicksort(int[] array){

        //establish variables
        int low = array[0];
        int high = 0;
        int lengths = array.length;
        int[] items = new int[lengths];
        //loop, partition, swap
        for(int i = low; i < lengths; i++){
            lengths = array[-1];

        }

        return items;
    }


    @Test
    public void testArray(){
        int[] items = {2,3,2,3,5,6,743,2,-3,2};

        quicksort(items);
    }


}

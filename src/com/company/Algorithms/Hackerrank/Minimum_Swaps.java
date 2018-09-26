package com.company.Algorithms.Hackerrank;

public class Minimum_Swaps {

    static int minimumSwaps(int[] arr) {

        int count = 0;
        int o = 0;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i +1; j < arr.length-1; j++){
                if(arr[i] > arr[j]){
                    o = arr[i];
                    arr[i] = arr[j];
                    arr[j] = o;
                    count ++;
                }
            }
        }
        return count;

    }

}

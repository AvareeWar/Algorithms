package com.company.Algorithms.Interviews.Bank_Of_America;

import org.junit.Test;

public class Bank_Of_America_Coding_Challenge {

    public int[] mergeArray(int[] a, int[] b){

        int i = 0;
        int j = 0;
        int k = 0;
        int lengths = a.length + b.length;
        int[] items = new int[lengths];

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                items[k] = a[i];
                k++;
                i++;
            }
            else{
                items[k] = b[j];
                k++;
                j++;
            }
        }
        //System.out.println(items);
        return items;
    }

    @Test
    public void testMerge(){
        int[] a = {-376, 17, 34, 294, 379, 719, 756, 826, 841, 894};
        int[] b = {-648, -643, 234, 505, 731};

        mergeArray(a, b);
    }
}

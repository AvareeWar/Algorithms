package com.company.Algorithms.Practice;

import org.junit.Test;

import java.util.ArrayList;

public class Get_Negs_Before_Pos {


    public void getNegsBeforePos(int[] items) {

        ArrayList<Integer> negsbpos = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {
            if ((items[i]) % 2 != 0) {
                negsbpos.add(items[i]);
            }
        }
        for (int j = 0; j < items.length; j++) {
            if ((items[j]) % 2 == 0) {
                negsbpos.add(items[j]);
            }
        }
        System.out.println(negsbpos);
    }

    @Test
    public void testArray(){
        int[] items = {1,2,3,4,5,6};
        getNegsBeforePos(items);
    }

}

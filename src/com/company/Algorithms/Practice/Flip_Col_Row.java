package com.company.Algorithms.Practice;

import org.junit.Test;

public class Flip_Col_Row {




    public void flipColsAndRows(int[][] items){

        int rowtemp[];
        int coltemp[];

        int row;
        int col;

        for(row = 0; row < items.length; row++){
            for(col = 0; col < items[row].length; col++){
                rowtemp = items[row];
                coltemp = items[col];
                //swap
                items[row] = coltemp;
                items[col] = rowtemp;
                System.out.print(items[row][col]);
            }
        }


    }

    @Test
    public void testArray(){
        int[][] items ={{1,2,3},
                        {5,6,7},
                        {8,9,0}};
        flipColsAndRows(items);
    }


}

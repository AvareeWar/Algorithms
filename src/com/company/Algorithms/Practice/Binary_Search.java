package com.company.Algorithms.Practice;

public class Binary_Search {



    public static int binarySearch(int[] items, int x){

        // set left index
        int left = 0;
        //set right index
        int right = items.length - 1;

        int countleft = 0;
        int countright = 0;

        for(int i = 0; i < items.length; i++){
            if(items[i]==x){
                while(left <= right){
                    //middle becomes the left + mid deviation of the list

                    int middle = left + (right - left)/2;

                    if(items[middle] == x){
                        System.out.println("Yayyyyyyy");
                        return middle;
                    }

                    if(items[middle] < x){
                        countleft++;
                        System.out.println(countleft);
                        System.out.println("Going up to the right more");
                        left = middle + 1;
                    }

                    else {
                        countright++;
                        System.out.println(countright);
                        System.out.println("Going up to the left more");
                        right = middle - 1;
                    }
                }
            }
            else{
                return -1;
            }
        }

        return -1;
    }
}

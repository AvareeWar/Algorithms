package com.company.Data_Structures.ArrayLists;

import java.util.ArrayList;

public class Arrays {

    public int getInt(ArrayList<Integer> ints, int item){

        int desirable = 0;
        for(int i = 0; i < ints.size(); i++){
            if(ints.get(i) == item){
                desirable = item;
            }
        }
        return desirable;
    }

    public String getString(ArrayList<String> strings, String item){
        String desirable = null;
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).equals(item)){
                desirable = item;
            }
        }
        return desirable;
    }

    public void deleteInt(ArrayList<Integer> ints, int item){

        int desirable = 0;
        for(int i = 0; i < ints.size(); i++){
            if(ints.get(i) == item){
                ints.remove(i);
            }
        }
    }

    public void deleteString(ArrayList<String> strings, String item){
        String desirable = null;
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).equals(item)){
                strings.remove(i);
            }
        }
    }

    public ArrayList reverseIntArray(ArrayList<Integer> ints){
        ArrayList<Integer> tempArray = new ArrayList<>();

        for(int i = ints.size()-1 ; i >= 0; i--){
            int placement = ints.get(i);
            tempArray.add(placement);
        }
        return tempArray;
    }

    public ArrayList reverseStringArray(ArrayList<Integer> strings){
        ArrayList<Integer> tempArray = new ArrayList<>();

        for(int i = strings.size()-1 ; i >= 0; i--){
            int placement = strings.get(i);
            tempArray.add(placement);
        }
        return tempArray;
    }


    public void rotateArrayLeftBySpaces(int array[], int nmbrSpaces){
        int temp = array[0];

        for(int i = 0; i < array.length - 1; i++){
            array[i] = array[i+nmbrSpaces];
            array[i] = temp;
        }
    }
}

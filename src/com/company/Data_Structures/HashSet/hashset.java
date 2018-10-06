package com.company.Data_Structures.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset {

    /** Initialize your data structure here. */
    HashSet<Integer> items = new HashSet<>();
    public hashset() {
    }

    public void add(int key) {
        items.add(key);
    }

    public void remove(int key) {
        items.remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key){
        if(items.contains(key)){
            return true;
        }
        return false;
    }



}

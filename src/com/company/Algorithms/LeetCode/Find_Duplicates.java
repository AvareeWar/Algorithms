package com.company.Algorithms.LeetCode;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicates {

    boolean findDuplicates(List<Type> keys) {
        // Replace Type with actual type of your key
        Set<Type> hashset = new HashSet<>();
        for (Type key : keys) {
            if (hashset.contains(key)) {
                return true;
            }
            hashset.add(key);
        }
        return false;
    }
}

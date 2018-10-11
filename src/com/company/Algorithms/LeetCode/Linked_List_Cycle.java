package com.company.Algorithms.LeetCode;

import javafx.scene.Node;

import java.util.HashSet;

public class Linked_List_Cycle {

    class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(Node head) {

        HashSet<Node> n = new HashSet<>();

        while(head != null){

            if(n.contains(head)){
                return true;
            }

            n.add(head);
            head = head.next;

        }
        return false;
    }
}

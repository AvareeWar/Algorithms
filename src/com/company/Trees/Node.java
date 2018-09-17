package com.company.Trees;


public class Node{

    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }

    //CHECK BST ALG/////////////////////////////////////////////
    boolean checkBST(Node root) {
        return help(root, 0, 10000);
    }

    boolean help(Node r, int min, int max){
        if(r == null) return true;

        if(r.data >= min && r.data <= max){
            return help(r.left, min, r.data - 1) && help(r.right, r.data + 1, max);
        }
        return false;
    }
    ////////////////////////////////////////////////////////////
}
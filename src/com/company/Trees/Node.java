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

    //COUNT LENGTH OF TREE//////////////////////////////////////
    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return babyHeight(root) - 1;
    }
    public static int babyHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null) leftHeight = babyHeight(root.left);
        if (root.right != null) rightHeight = babyHeight(root.right);

        if (leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
    }
    ////////////////////////////////////////////////////////////
}
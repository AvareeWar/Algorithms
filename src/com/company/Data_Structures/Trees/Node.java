package com.company.Data_Structures.Trees;


import javax.swing.tree.TreeNode;

public class Node{

    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }

    public static void visit(Node node){
        System.out.println(node);
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
    public int maxDepth(Node root) {

        int leftheight = 0;
        int rightheight = 0;

        if(root == null){
            return 0;
        }

        if(root.left != null) leftheight = maxDepth(root.left);


        if(root.right != null) rightheight = maxDepth(root.right);


        if(leftheight > rightheight) return leftheight += 1;
        else{
            return rightheight += 1;
        }


    }
    ////////////////////////////////////////////////////////////

    //IN-ORDER TRAVERSAL////////////////////////////////////////
    public static void inOrderTraversal(Node node){
        //in order traversal means to visit the left branch, then the current node, and finally the right.
        if(node != null){
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }
    ////////////////////////////////////////////////////////////

    //PRE-ORDER TRAVERSAL///////////////////////////////////////
    public static void preOrderTraversal(Node node){
        //pre order traversal visits the current node before its child nodes
        if(node != null){
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    ////////////////////////////////////////////////////////////

    //POST-ORDER TRAVERSAL///////////////////////////////////////
    public static void postOrderTraversal(Node node){
        //pre order traversal visits the current node before its child nodes
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }
}
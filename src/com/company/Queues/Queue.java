package com.company.Queues;

import javafx.scene.Node;

public class Queue {


    //REMEMBER THE ORDERS
        //FIFO -> FIRST IN FIRST OUT (Stack of plates)
        //LIFO -> LAST IN FIRST OUT (Line at the movies)

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    Node head; //remove from the head
    Node tail; //add things to here

    boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public int remove(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }


}


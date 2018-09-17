package com.company.LinkedLists;


public class Node {

    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void appendNode(int data){
        Node current = this;

        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void deleteNode(int data){
        Node current = this;

        while(current.next != null){
            if(current.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public class LinkedList{

        Node head;

        public void append(int data){
            if(head == null){
                head = new Node(data);
                return;
            }
            Node current = head;

            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }

        public void delete(int data){
            if(head == null){
                head = new Node(data);
                return;
            }

            Node current = head;

            while(current.next != null){
                if(current.data == data){
                    current.next = current.next.next;
                }
            }
            current.next = new Node(data);
        }
    }


}

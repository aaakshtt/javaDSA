package DataAlgo;

import java.util.*;
import java.io.*;

class Solution {
    Node head;				//Create a node head
    class Node{				//Defaultclass Node
       int data;			//Intialize data 
       Node next;			//Create a node next
       Node(int data) {		//Constructor with a parametr data
           this.data = data;	
           this.next = null;
       }
    }
    public void push(int new_data){								//Add this element to starting of the list
        Node newnode = new Node(new_data);
        if (head  == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    Node reverse(Node node) {			//Function to reverse a list
        Node prev = null;				//Make previous node null
        Node current =node;				//Make the current node equal to node from the user , mostly head
        Node next = null;				//M
        while (current != null) {
            next = current.next;		//Increment next node
            current.next = prev;		//
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printlist(Node node) {
        if (head == null){
            System.out.println();
        }
        while (node != null){
            System.out.print(node.data +"--");
            node = node.next;
        }
    }


    public static void main(String []args) {
        Solution slist = new Solution();
        slist.push(5);
        slist.push(4);
        slist.push(3);
        slist.push(2);
        slist.push(1);
        slist.printlist(slist.head);
        System.out.println("\n");

        slist.head = slist.reverse(slist.head);
        slist.printlist(slist.head);



    }
}

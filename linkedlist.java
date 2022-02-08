//Code to show how to create a linkedlist
//Add an element to the first and second postion
package DataAlgo;
import java.util.*;

public class LinkedList {
    Node head;
    class Node{                         //Node class
        String data;                    //Create a string name data
        Node next;                      //Create a node named next
        Node(String data){              //Node constructor which accepts String data as parameter
            this.data = data;           //Create a node.data with data
            this.next = null;           //Create a node.next with next
        }
    }
    public void addFIrst(String new_data){
        Node newnode = new Node(new_data);              //Allocate the node and put it into data
        newnode.next = head;
        head = newnode;
    }
    public void addlast(String new_data){
        Node newnode= new Node(new_data);
        Node currnode  = head;
        while (currnode.next != null){                  //Until next of current node does not become null we will travserse
            currnode = currnode.next;                   //We will reach last when - next of currNode will be null
        }
        currnode.next = newnode;                        //When we get the last node we update the next  part of this node
    }
    public void printlist(){
        Node currnode = head;
        while (currnode != null){                   //Until currentnode is not equal to null
            System.out.print(currnode.data +"--->");
            currnode  = currnode.next;              //Current node will be incremented//
                 }
    }
    public void inserafternode(Node prev_node, String new_data){
        if (prev_node == null){
            System.out.println("The previous node is null");
            return;
        }
                                    /* 2. Allocate the Node &   3. Put in the data*/
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;             /* 4. Make next of new Node as next of prev_node */
        prev_node.next = new_node;                  /* 5. make next of prev_node as new_node */
    }

    public static void main(String[] args) {
        LinkedList myobj = new LinkedList();
        myobj.addFIrst("Akshat");
        myobj.addFIrst("Pritesh");
        myobj.addFIrst("Tejas");
//        myobj.printlist();
        myobj.inserafternode(myobj.head, "Sahil");            //Will add after the head of first list
        myobj.printlist();



    }


    }


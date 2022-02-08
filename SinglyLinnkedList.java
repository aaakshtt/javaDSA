package DataAlgo;
import java.util.*;

public class SinglyLinnkedList {
    Node head;                          //Create a node head
    class Node{                         //Class with name Node
        String data;                    //String to store data
        Node next;                      //Next element with type Node
        Node(String data){              //Constructor
            this.data = data;           //We create data
            this.next = null;           //Next value is null
        }
    }
    //add operation
    //add first , add last
    public void AddFirst(String data){  //Method to addfirst element with parameter data
        Node newNode= new Node(data);   //Create a new object of class Node with data as parameter
        if (head ==null){               //Corner case- if there is no head
            head = newNode;             // Head will be the new node
            return;
        }
        newNode.next = head;            // next part of newnode will be head
        head = newNode;                 // head will be equal to newnode
    }

    public void addlast(String data) {  //function to add data to last position
        Node newNode = new Node(data);  //Create object newNode of class Node by taking data
        if (head == null) {             //COrner case
            head = newNode;             //newNode created will be head
            return;
        }
        Node currNode = head;           //Current node is head
        while (currNode.next != null) { //Until next of current node does not become null we will travserse
            currNode = currNode.next;   //We will reach last when - next of currNode will be null
        }

        currNode.next = newNode;        //When we get the last node we update the next  part of this node
    }

    //print list
    public void printlist(){            //function to print list
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;           //Current node will take take value and assign value of head
        while (currNode != null) {      //print current node
            System.out.print(currNode.data +"->");  //Everytime print data of current node until the next part is not null
            currNode = currNode.next;               //Update value of current node
        }
        System.out.println("null");

    }
    public void deletfirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = this.head.next;                  //Single line to delete head element
    }
    public void deletelast(){                   //Now we need to travel the list for which we need currentnode
        if (head == null){                      //Corner case
            System.out.println("List is empty");
            return;
        }
        if (head.next ==null){                  //Corner case
            head = null;
            return;
        }
        Node currnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null){      //We traverse using the while loop
            lastnode  = lastnode.next;
            currnode = currnode.next;
        }
        currnode.next = null;

    }
    public static void main(String[] args) {
        SinglyLinnkedList ll = new SinglyLinnkedList();

        ll.AddFirst("a");
        ll.AddFirst("is");
        ll.printlist();

        ll.addlast("list");
        ll.printlist();

        ll.AddFirst("this");                //This is added to the first of above list
        ll.printlist();


        ll.deletfirst();                        //Delete the first element
        ll.printlist();


    }

}

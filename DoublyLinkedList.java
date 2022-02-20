package DataAlgo;

public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){                    //Constructor to create node
            data = d;                   //TEnter data
        }
    }
    //Adding a new node at the front of the list
    public void push(int new_data){
        Node new_node = new Node(new_data);              /* 1. allocate node   2. put in the data */
        new_node.prev = null;                       /* 3. Make next of new node as head and previous as NULL */
        new_node.next = head;
        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_node;
        /* 5. move the head to point to the new node */
        head = new_node;
    }
    public void inserafternode(Node prev_node,int new_data){
        /*1. check if the given prev_node is NULL */
        if (prev_node == null){
            System.out.println("The given previous node cannot be NULL");
            return;
        }
        /* 2.   allocate node
         * 3.   put in the data */
        Node new_node = new Node(new_data);
        /*4.    Make next of new node as next of previous node */
        new_node.next = prev_node.next;
        //5.    Make next of previous node as new node. We just interchange the pointers
        prev_node.next = new_node;
        //6 Make prev_node as previous of new node
        new_node.prev = prev_node;
        //7. Change previous of new_node's next node
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }
    public void inserbefore(Node next_node, int new_data){      //Insert before the next node
        /*Check if the given nx_node is NULL*/
        if(next_node == null)
        {
            System.out.println("The given next node can not be NULL");
            return;
        }
        //Allocate node, put in the data
        Node new_node = new Node(new_data);

        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        //Check if new node is added as head
        if(new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
    }

    public void insertatlast(int new_data){
        Node newnode= new Node(new_data);
        Node last = head;                   //The node that we will add
        while (last.next != null)           //Traverse the list
            last = last.next;               //Incrementing the last pointer node
        last.next =newnode;                 //Change the next of last node
        newnode.prev = last;                //Making of last node as previous of new node
    }
    public void preintlist(Node node){
        Node last =null;
        System.out.println("Traversal in forward direction");
        while (node != null) {
            System.out.print(node.data + "->");
            last = node;
            node = node.next;
        }

        }



    public static void main(String args[]){
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.push(20);
        dlist.push(10);
        dlist.insertatlast(1000);                   //Last


        dlist.inserbefore(dlist.head.next, 9999);        //Before 20


        dlist.inserafternode(dlist.head.next.next, 100);        //After 20


        dlist.preintlist(dlist.head);



    }
}

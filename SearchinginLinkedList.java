package DataAlgo;

class Node{
    String data;                //Accept data as string
    Node next;                  // Node next
    Node(String d){             //Constructor
        data = d;
        next = null;
    }
}
class SearchinginLinkedList {
    Node head;                          //Head of list
    public void push(String new_data){  //Method to insert data at the node
        //Allocate new node and put data in it
        Node new_node = new Node(new_data);
        //Make next of new node as head
        new_node.next = head;
        //Move the head to point to new Node
        head = new_node;
    }
    public boolean search(Node head,String x){  //Checks if value of x is present in a linkedlist
        Node current  = head; //Intialize current
        while (current != null){            //Check presence of linked list
            if (current.data == x)
                return true;        //data found
                current = current.next;             //go to the next of node or increment
        }
        return false;           //data not found
    }
    /* Takes index as argument and return data at index*/
    public String getelement(int index){                        //Get the element at that index
        Node current  = head;
        int count = 0;      /* index of Node we are
                          currently looking at */
        while (current != null) {
            if (count == index)                                 //If count is equal to index we entered
                return current.data;                            // return data of that current node
            count++;                                            // Increment count
            current = current.next;                             //Increment current as well
        }
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return "0";

    }


    public static void main(String args[]){
        SearchinginLinkedList llist = new SearchinginLinkedList();
        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push("10");
        llist.push("30");
        llist.push("11");
        llist.push("21");
        llist.push("14");

        if (llist.search(llist.head, "10")){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
        System.out.println("Get the element at index 2 is   " + llist.getelement(2));
    }
}

package DataAlgo;

class Node{
    String data;
    Node next;
    Node(String d){             //Constructor
        data = d;
        next = null;
    }
}

class SearchinginLinkedList {
    Node head;                          //Head of list
    public void push(String new_data){
        //Allocate new node and put data in it
        Node new_node = new Node(new_data);

        //Make next of new node as head
        new_node.next = head;
        //Move the head to point to new Node
        head = new_node;
    }
    public boolean search(Node head,String x){
        Node current  = head;       //Intialize current
        while (current != null){
            if (current.data == x)
                return true;        //data found
                current = current.next;

        }
        return false;           //data not found
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

        if (llist.search(llist.head, "100")){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}

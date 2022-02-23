package DataAlgo;

public class circularsinglylinkedlist {
    private Node last;              //Create a instance variable
    private int length;             //Instance variable
    private class Node{
        private Node next;
        private int data;

        public Node(int data){              //Constructor
                this.data = data;
        }
    }
    public circularsinglylinkedlist(){      //Constructor
        last =null;
        length = 0;
    }
    public int length(){        //method
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void createcircularlist(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node tird = new Node(3);
        Node fourth = new Node(4);
        first.next = second;                //Creation of a circular linkedlist
        second.next = tird;
        tird.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void inseratbeginning(int new_data){
        Node temp = new Node(new_data);
        if (last == null){
            last =temp;
        }else {
            temp.next = last.next;      //Copy value of the first node that was first
        }
        last.next = temp;               //This will create a  link from last node to temp
        length++;                       //Increment temp
    }
    public void insertatend(int new_data){      //inseerts the node at the last
        Node temp  = new Node(new_data);
        Node first = last.next;
        if (last == null){
            last = temp;
            last.next =temp;
        }else {
            temp.next = last.next;          //Assign value of the last node
            last.next = temp;               //We change the value of last node to the new node inserted
            last = temp;                    //Now the last node is temp node
        }
        temp.next =first;
        length++;
    }
    public void printlist(){
        Node first = last.next;
        while (first != last){
            System.out.print(first.data+"->");
            first = first.next;
        }   //After this first will become equal to last
        System.out.println(first.data);     //This will print the last node
    }

    public static void main(String[] args) {
        circularsinglylinkedlist clist = new circularsinglylinkedlist();
        clist.createcircularlist();
        clist.printlist();
        clist.inseratbeginning(001);
        clist.printlist();
        clist.insertatend(100);
        clist.printlist();
    }
}

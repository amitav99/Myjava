public class Singly_linkedlist{
    Node head; //instance variable 
    static class Node
    {
        private int data;
        private Node next;
    
    public Node (int data)
    {
        this.data= data;
        this.next=null;
    }
    }
    public void display()
    {
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data +"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    //main function
    public static void main (String args[])
    {
        //creating object of the class linked list
    Singly_linkedlist ob =new Singly_linkedlist();
    ob.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    ob.head.next=second;
    second.next=third;
    third.next=fourth;

    ob.display();
    }
}

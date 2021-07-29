public class Singly_linkedlist {
    private  ListNode head;//instance variable
    private static class ListNode
    {
        private int data;
        private ListNode next;

    public ListNode(int data)
    {
        this.data =data;
        this.next =null;
    }
    }
    public static void main (String args[])
    {
    Singly_linkedlist ob = new Singly_linkedlist();
    ob.head = new ListNode(10);
    ListNode second = new ListNode(5);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(12);

    ob.head.next = second;
    second.next = third;
    third.next = fourth;
}
}

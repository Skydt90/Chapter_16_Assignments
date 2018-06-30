package LinkedIntList;

// Class for storing a single node of a self constructed LinkedList

public class ListNode
{
    public int data;            // data stored in this node
    public ListNode next;       // link to next node in the list

    public ListNode()
    {
        this(0, null);
    }

    ListNode(int data)
    {
        this(data, null);
    }

    ListNode(int data, ListNode next)
    {
        this.data = data;
        this.next = next;
    }

}



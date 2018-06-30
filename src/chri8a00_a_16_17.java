import LinkedIntList.LinkedIntList;
import LinkedIntList.ListNode;

public class chri8a00_a_16_17 extends LinkedIntList
{
    public void removeRange(int start, int end)
    {
        if(start < 0 || end < 0)
        {
            throw new IllegalArgumentException();
        }
        ListNode previous = null;
        ListNode current = front;
        int index = 0;

        while(current != null && index < start)
        {
            previous = current;
            current = current.next;
            index++;
        }

        while(current != null && index <= end)
        {
            if(previous == null)
            {
                front = front.next;
                previous = null;
                current = front;
            }
            else
            {
                previous.next = current.next;
                current = previous.next;
            }

            index++;
        }
    }
}

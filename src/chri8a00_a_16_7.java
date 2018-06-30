import LinkedIntList.LinkedIntList;
import LinkedIntList.ListNode;
import java.util.NoSuchElementException;

public class chri8a00_a_16_7 extends LinkedIntList
{
    public int deleteBack()
    {
        if(front == null)                       // if list is empty, throw exception
        {
            throw new NoSuchElementException();
        }
        int rValue = front.data;                // Return value

        if(front.next == null)                  // If nothing after front, remove front
        {
            front = null;
        }
        else
        {
            ListNode current = front;
            while(current.next.next != null)
            {
                rValue = current.data;
                current = current.next;
            }
            current.next = null;
        }
        return rValue;
    }
}

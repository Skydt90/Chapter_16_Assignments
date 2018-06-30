package LinkedIntList;

import java.util.NoSuchElementException;

public class LinkedIntList implements IntList
{
    protected ListNode front;

    public LinkedIntList()
    {
        this.front = null;
    }

    // Appends a ListNode to the end of the list
    public void add(int value)
    {
        if (front == null)
        {
            front = new ListNode(value, null);
        }
        else
            {
                ListNode current = front;
                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = new ListNode(value);
            }
    }

    // Appends a ListNode at the desired "index"
    public void add(int index, int value)
    {
        if (index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // Returns the position of the first occurrence of the value
    public int indexOf(int value)
    {
        int index = 0;
        ListNode current = front;
        while (current != null)
        {
            if (current.data == value)
            {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // Inserts a number in a position, that is sorted with the list
    public void addSorted(int value)
    {
        if (front == null || front.data >= value)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            while (current.next != null && current.next.data < value)
            {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    // Removes a ListNode from the specified "index"
    public void remove(int index)
    {
        if (index == 0)
        {
            front = front.next;
        }
        else
        {
            ListNode current = nodeAt(index -1);
            current.next = current.next.next;
        }
    }

    // Deletes the back element of the list.
    public int deleteBack()
    {
        if(front == null)                       // if list is empty, throw exception
        {
            throw new NoSuchElementException();
        }
        int rValue = front.data;                 // Return value

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

    public void removeRange(int start, int end)
    {
        if(start < 0 || end < 0)
        {
            throw new IllegalArgumentException();
        }
        ListNode previous = null;
        ListNode current = front;
        int index = 0;

        // Get to the starting point via index
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

    // Returns the ListNode at the desired "index"
    public int get(int index)
    {
        return nodeAt(index).data;
    }

    // Returns a String containing the contents of the list
    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null)
            {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // Returns the current number of elements in the list
    public int size()
    {
        int count = 0;
        ListNode current = front;
        while (current != null)
        {
            current = current.next;
            count++;
        }
        return count;
    }

    // Returns a reference to the ListNode at a given "index"
    private ListNode nodeAt(int index)
    {
        ListNode current = front;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }

    /*
    private class LinkedIterator<E> implements Iterator<E>
    {
        private ListNode current;
        private boolean removeOK;

        public LinkedIterator()
        {
            this.current = front.next;
            removeOK = false;
        }

        public boolean hasNext()
        {
            return current != back;
        }

        public E next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            E result = current.data;
            current = current.next;
            removeOK = true;
            return result;
        }

        public void remove()
        {
            if (!removeOK)
            {
                throw new IllegalStateException();
            }
            ListNode<E> prev2 = current.prev.prev;
            prev2.next = current;
            size--;
            removeOK = false;
        }

        public void addAll(List<E> other)
        {
            for(E value : other)
            {
                add(value);
            }
        }
    }
    */

}



package com.dsa.linkedlist;
import com.dsa.node.dll.Node;
public class DoubleLinkedList
{
    private Node head;
    private Node tail;
    int length;

    public DoubleLinkedList(int value)
    {
        head =tail = new Node(value);
        length++;
    }

    public int getLength()
    {
        return length;
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    public void printList(boolean forwardDirection)
    {
        if(length==0) return;
        Node temp;

        if(forwardDirection)
        {
            temp=head;
            while(temp!=null)
            {
                System.out.println(temp.value);
                temp =temp.next;
            }
        }
        else
        {
            temp =tail;
            while(temp!=null)
            {
                System.out.println(temp.value);
                temp =temp.prev;
            }
        }
    }

    public void printAll()
    {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("Doubly Linked List");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList(true);
        }
    }

    public void append(int value)
    {
        Node temp = new Node(value);

        if(length==0)
        {
            head =tail= temp;

        }
        else
        {
            tail.next =temp;
            temp.prev =tail;
            tail =temp;
        }
        length++;
    }
    public Node removeLast()
    {
        Node temp = tail;
        if(length==0 || length==1)
        {
            head=tail=null;
            length=0;
            return temp;

        }
        else
        {
            tail=temp.prev;
            tail.next = null;
            temp.prev =null;
        }
        length--;
        return temp;
    }

    public void prepend(int value)
    {
        Node temp = new Node(value);
        if (length==0)
        {
            head=tail=temp;
        }
        else
        {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        length++;
    }

    public Node removeFirst()
    {
        Node temp=head;
        if(length==0 ||length==1)
        {
            head=tail=null;
            length =0;
        }
        else
        {
            head =temp.next;
            head.prev=null;
            temp.next=null;
            length--;
        }

        return temp;
    }

    public Node get(int index)
    {
        Node temp;
        if(length==0 ||index>=length ||index<0) return null;
        if(index==0) return head;
        if(index== length-1) return tail;
        else
        {
            if(index<length/2)
            {
                temp = head;
                for(int i=0;i<index;i++)
                {
                    temp =temp.next;
                }
            }
            else
            {
                temp = tail;
                for(int i = length - 1; i > index; i--)
                {
                    temp =temp.prev;
                }
            }
        }
        return temp;
    }

    public boolean set(int index, int value)
    {
        if(index<0 ||index>length-1) return false;
        Node temp = this.get(index);
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value)
    {
        if(index<0 || index>length) return false;
        else
        {
            if(index==0) prepend(value);
            else if(index==length) append(value);
            else
            {
                Node temp = new Node(value);
                Node pos = get(index-1);
                temp.next =pos.next;
                temp.prev=pos;
                pos.next=temp;
                temp.next.prev=temp;
                length++;
            }

        }

        return true;
    }
    public Node remove(int index)
    {
        if(index<0 ||index> length-1) return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();

        else
        {
            Node temp = get(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.prev =temp.next =null;
            length--;
            return temp;
        }

    }
}

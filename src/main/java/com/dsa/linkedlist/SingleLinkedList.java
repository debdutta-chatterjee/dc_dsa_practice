package com.dsa.linkedlist;
import com.dsa.node.Node;

import java.util.HashSet;

public class SingleLinkedList
{
    private Node node;
    private int length=0;
    private Node head= null;
    private Node tail= null;

    public SingleLinkedList(int data)
    {
        node = new Node(data);
        head = tail = node;
        length++;
    }
    public SingleLinkedList()
    {
    }

    public void makeEmpty()
    {
        head = tail = null;
        length = 0;
    }

    //get length
    public int getLength()
    {
        return length;
    }

    //print list
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void print(Node start)
    {
        Node temp=start;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    //print details
    public void printAll()
    {
        System.out.println("Length::"+length);
        if (length==0)
        {
            System.out.println("Head:: Null");
            System.out.println("Tail:: Null");
        }
        else{
            System.out.println("Head::"+head);
            System.out.println("Tail::"+tail);
        }
        System.out.println("Linked list");
        if(length==0) System.out.println("List is empty");
        this.print();
    }

    //add node
    public void add(int data)
    {
        Node temp = new Node(data);
        if(head==null) head = tail = temp;
        else {
            node.next = temp;
            tail = temp;
        }
        length++;
    }

    //add node
    public void append(int value)
    {
        Node temp = new Node(value);
        if(head== null)
        {
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        length++;
    }

    //remove last node
    public Node removeLast() {
        Node prev = null;
        Node temp = null;

        if (head == null) return null;
        else if (length == 1) {
            temp = head;
            head = tail = null;
            length--;
            return temp;
        } else {
            temp = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            tail = prev;
            length--;
            return temp;
        }
    }
    //prepend
    public void prepend(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        length++;
        if (tail == null) {
            tail = head;
        }
    }
    //remove first
    public Node removeFirst()
    {
        Node temp = head;
        if(temp==null) return temp;

        head = head.next;
        if(length==1)
        {
            tail = null;
        }
        else {
            temp.next=null;
        }
        length--;
        return temp;
    }

    //get node by index
    public Node get(int index)
    {
        if(index>length|| index<0) return null;
        else {
            Node temp= head;
            for(int i=0;i<index;i++)
            {
                temp= temp.next;
            }
            return temp;
        }
    }

    //Set value to node at index
    public boolean set(int index,int value)
    {
        if(index<0 || index>=length) return false;

        else{
            Node temp= head;
            for (int i= 0;i<index;i++){
                temp=temp.next;
            }
            temp.data = value;
            return true;
        }
    }

    public boolean insert(int index,int value)
    {
        if(index<0 ||index>length) return false;

        Node temp = new Node(value);
        if(index==0)
        {
            temp.next=head;
            head=temp;
        }
        else if(index== length)
        {
            tail.next= temp;
            tail=temp;
        }
        else{
            Node prev =head;
            for(int i=0; i<index-1;i++)
            {
                prev=prev.next;
            }
            temp.next=prev.next;
            prev.next=temp;
        }
        length++;
        return true;
    }

    public Node remove(int index)
    {
        if(index<0||index>=length) return null;

        if(index==0) return removeFirst();
        else if(index==length-1) return removeLast();
        else{
            Node temp = head;
            Node prev= null;
            for(int i=0;i<index;i++)
            {
                prev=temp;
                temp = temp.next;
            }
            prev.next =temp.next;
            temp.next=null;
            length--;
            return temp;
        }
    }

    public void reverse()
    {
        if(length>1)
        {
            Node before=null;
            Node temp = head;
            Node after = temp.next;

            while(temp.next!=null)
            {
                temp.next=before;
                before =temp;
                temp= after;
                after= temp.next;
            }
            temp.next=before;
            head=tail;
            tail=temp;
        }
    }

    public Node findMiddleNode()
    {
        if(head==null) return head;
        Node temp=head;
        int index=0;
        while(temp.next!=null)
        {
            index++;
            temp = temp.next;
        }

        int middle= (int) index/2;

        temp=head;
        for(int i=0;i<middle;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public Node findKthFromEnd(int k)
    {
        if(head==null) return head;

        Node temp=head;
        int index=0;
        Node[] arr = new Node[20];
        while(temp!=null)
        {
            arr[index++] = temp;
            temp = temp.next;
        }

        if(index<=k) return null;
        int node_index= index-k;

        return arr[node_index];

    }

    public boolean hasLoop()
    {
        if(head==null ||head.next==null) return false;

        Node temp=head;
        int index=0;
        HashSet<Node> setNode = new HashSet<>();
        while(temp!=null)
        {
            setNode.add(temp);
            temp=temp.next;
            if(setNode.size() < (index+1)) return true;
            index++;
        }

        return false;
    }
}


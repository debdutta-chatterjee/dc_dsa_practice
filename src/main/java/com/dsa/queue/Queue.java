package com.dsa.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }

    public void enqueue(int value)
    {
        Node temp = new Node(value);
        if(first==null)
        {
            first = last =temp;
        }
        else
        {
            last.next=temp;
            last=temp;
        }
        length++;
    }

    public Node dequeue()
    {
        if(first==null) return null;
        Node temp=first;
        if(length==1){
            first=last=null;
        }
        else{
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

}
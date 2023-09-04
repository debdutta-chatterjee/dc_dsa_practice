package com.dsa.stack;

public class Stack
{
    Node top;
    int height=0;

    public Stack(int value)
    {
        Node node = new Node(value);
        top = node;
        height++;
    }

    public class Node
    {
        public Node next;
        public int value;

        Node(int value)
        {
            this.value=value;
        }
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public void push(int value)
    {
        Node temp = new Node(value);
        temp.next=top;
        top=temp;
        height++;
    }

    public Node pop()
    {
        if(height==0) return top;
        Node temp=top;
        top = top.next;
        temp.next=null;
        height--;
        return temp;
    }

//    public static String reverseString (String str)
//    {
//        Stack myStack = new Stack();
//        for(char c: str.toCharArray())
//        {
//            myStack.push(c);
//        }
//        StringBuilder sb = new StringBuilder();
//
//        while(myStack.size()>0)
//        {
//            sb.append(myStack.pop());
//        }
//        return sb.toString();
//    }

//    public static boolean isBalancedParentheses(String str)
//    {
//        Stack myStack = new Stack();
//        for(char c: str.toCharArray())
//        {
//            if(c=='(')
//                myStack.push(c);
//            else
//            {
//                if(myStack.pop()!=Character.valueOf('(')) return false;
//            }
//        }
//        if(myStack.size()!=0) return false;
//        return true;
//    }
}

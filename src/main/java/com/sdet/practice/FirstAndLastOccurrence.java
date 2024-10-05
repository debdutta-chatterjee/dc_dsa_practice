package com.sdet.practice;

public class FirstAndLastOccurrence
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        firstAndLastOccurrence(arr,5);

        int[] arr2 = {1, 3, 5, 5, 5, 5, 7, 123, 125 };
        firstAndLastOccurrence(arr2,7);
    }

    public static void firstAndLastOccurrence(int[] arr, int element)
    {
        boolean foundFirst=false;
        boolean foundLast=false;
        int first=-1;
        int last=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(!foundFirst && arr[i]==element)
            {
                first =i;
                foundFirst=true;
            }
            if(!foundLast && arr[arr.length-1-i]==element)
            {
                last = arr.length-1-i;
                foundLast=true;
            }
            if(foundFirst && foundLast) break;
        }

        System.out.println("First occurrence:"+first);
        System.out.println("Last occurrence:"+last);
    }
}

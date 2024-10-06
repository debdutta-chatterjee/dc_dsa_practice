package com.sdet.practice;

import java.util.HashMap;
import java.util.Map;

public class PairElement
{
    public static void main(String[] args)
    {
        int arr[] = { 1, 5, 7, -1, 5 };
        pairElement(arr,6);

    }
    public static void pairElement(int[] arr, int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
               if(arr[i]+arr[j]==sum)
               {
                   System.out.println("found pair"+i+","+j);
               }
            }
        }
    }
}

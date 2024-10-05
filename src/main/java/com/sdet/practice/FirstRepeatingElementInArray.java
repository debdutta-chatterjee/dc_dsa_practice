package com.sdet.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingElementInArray
{
    public static void main(String args[])
    {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatingElementInArray(arr));

        int[] arr2 = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        System.out.println(firstRepeatingElementInArray(arr2));
    }
    public static int firstRepeatingElementInArray(int[] arr)
    {
        int firstRepeating =-999;
        Set<Integer> set = new HashSet<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            if(set.contains(arr[i]))
            {
                firstRepeating = i;
            }
            else{
                set.add(arr[i]);
            }
        }
        return arr[firstRepeating];
    }
}

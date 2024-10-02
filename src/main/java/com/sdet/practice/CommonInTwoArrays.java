package com.sdet.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonInTwoArrays
{
    public static void main(String[] args)
    {
        int b[] = { 1, 2, 6, 3, 4, 5 };
        int a[] = { 2, 4, 3, 1, 0 };
        System.out.println(commonInTwoArrays(a,b));
    }

    public static List<Integer> commonInTwoArrays(int [] arr1, int [] arr2)
    {
        List duplicates = new ArrayList<Integer>();
        List list_arr1 = new ArrayList<Integer>();


        for(int i =0;i<arr1.length;i++)
        {
            list_arr1.add((arr1[i]));
        }

        for(int i =0;i<arr2.length;i++)
        {
            if(list_arr1.contains(arr2[i]))
            {
                duplicates.add(arr2[i]);
            }
        }
        return duplicates;
    }
}

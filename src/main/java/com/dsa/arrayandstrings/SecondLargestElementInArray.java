package com.dsa.arrayandstrings;

public class SecondLargestElementInArray
{
    public static int findSecondLargest(int n, int[] arr) {
        if (arr.length < 2) return -1;

        int max = -99999998;
        int secondmax = -99999999;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= max) max = arr[i];
        }
        //System.out.println("Max- [" + max + "]");

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == max) continue;
            if (arr[i] >= secondmax) secondmax = arr[i];
        }
        //System.out.println("2ndMax- [" + secondmax + "]");
        if (secondmax != -99999999) return secondmax;
        else return -1;
    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

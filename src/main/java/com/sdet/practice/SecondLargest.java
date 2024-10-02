package com.sdet.practice;

public class SecondLargest
{
    public static void main(String[] args)
    {
        int arr[] = {12, 38, 1, 10, 34, 1,37};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr)
    {
        int max=-998;
        int secondMax =-999;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max && arr[i]>secondMax)
            secondMax =arr[i];
        }
        return secondMax;
    }
}

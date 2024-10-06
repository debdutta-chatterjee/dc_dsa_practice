package com.sdet.practice;

import java.util.Arrays;

public class RearrangePosNegNumber
{
    // The main function that rearranges elements of given
    // array.  It puts positive elements at even indexes (0,
    // 2, ..) and negative numbers at odd indexes (1, 3, ..).
    public static void main(String[] args)
    {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Arrays.stream(arr).forEach(i ->System.out.print(i+" "));
        System.out.println();
        rearrangePosNegNumber(arr);
    }

    public static void rearrangePosNegNumber(int[] arr)
    {
        int i = -1, temp = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Arrays.stream(arr).forEach(k ->System.out.print(k+" "));

        //TBD
    }


    public static void rearrangePosNegNumber_Incorrect(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            if((i%2==0 && arr[i]<0) || (i%2!=0 && arr[i]>0))
            {
                temp =arr[i+1];
                arr[i+1] =arr[i];
                arr[i]=temp;
            }
        }
        Arrays.stream(arr).forEach(i ->System.out.print(i+" "));
    }
}

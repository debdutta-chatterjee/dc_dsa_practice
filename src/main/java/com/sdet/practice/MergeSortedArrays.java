package com.sdet.practice;

import java.util.Arrays;

public class MergeSortedArrays
{
    public static void main(String[] args)
    {
        int arr1[] = { 1, 3, 4, 5};
       int arr2[] = {2, 4, 6, 8};
       //Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
        mergeSortedArrays(arr1,arr2);

        int arr3[] = { 5, 8, 9};
        int arr4[] = {4, 7, 8};
       // Output: arr3[] = {4, 5, 7, 8, 8, 9}
        mergeSortedArrays(arr3,arr4);
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2)
    {
        int[] mergedArray = new int[arr1.length+arr2.length];
        int index=0;
        int i=0;
        int j=0;
        while( i< arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                mergedArray[index++]=arr1[i];
                i++;
            } else if (arr2[j]<arr1[i]) {
                mergedArray[index++]=arr2[j];
                j++;
            } else if (arr1[i]==arr2[j]) {
                mergedArray[index++]=arr1[i];
                mergedArray[index++]=arr2[j];
                i++;
                j++;
            }
        }

        if(i<arr1.length)
        {
            for(;i<arr1.length;i++)
                mergedArray[index++] =arr1[i];
        }
        if(j<arr2.length)
        {
            for(;j<arr1.length;j++)
                mergedArray[index++] =arr2[j];
        }
        Arrays.stream(mergedArray).forEach(k -> System.out.print(k+" "));
        System.out.println();
        return mergedArray;
    }
}

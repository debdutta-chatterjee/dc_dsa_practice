package com.sdet.practice;

import java.util.Arrays;

public class RotateByN
{
    /*
    Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
Explanation:
After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and
after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}


Input: arr[] = {1, 2, 3}, d = 4
Output: {2, 3, 1}
Explanation: The array is rotated as follows:


After first left rotation, arr[] = {2, 3, 1}
After second left rotation, arr[] = {3, 1, 2}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {2, 3, 1}
     */
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6,7};
        rotateByNRight(arr1,3);
        rotateByNLeft(arr1,3);

        //Output: {3, 4, 5, 6, 1, 2}

        int arr2[] = {1, 2, 3};
        //Output: {2, 3, 1}
        rotateByNRight(arr2,4);
        rotateByNLeft(arr2,4);
        System.out.println("-------");
        //rotateByNInPlace(arr1,2);
        //rotateByNInPlace(arr2,4);
    }

    public static void rotateByNRight(int[] arr, int n)
    {
        int[] rotatedArray = new int[arr.length];

        for(int i=0; i<rotatedArray.length;i++)
        {
            int pos =(i+n)%arr.length;
            //System.out.println(pos);
            rotatedArray[pos] = arr[i];
        }

        Arrays.stream(rotatedArray).forEach(k -> System.out.print(k+" "));
        System.out.println();
    }


    public static void rotateByNLeft(int[] arr, int n)
    {
        int[] rotatedArray = new int[arr.length];

        for(int i=0; i<rotatedArray.length;i++)
        {
            int pos =(Math.abs(i-n))%arr.length;
            //System.out.println(pos);
            rotatedArray[pos] = arr[i];
        }

        Arrays.stream(rotatedArray).forEach(k -> System.out.print(k+" "));
        System.out.println();
    }


    public static void rotateByNInPlace(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
            System.out.println("Pass"+i+"--");
            Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
            System.out.println();
        }
        System.out.println("Final");
        Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
        System.out.println();
    }

}

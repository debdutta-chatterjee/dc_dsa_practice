package com.sdet.practice;


/*
Given an array arr[] of n integers and a target value,
the task is to find the number of pairs of integers
in the array whose sum is equal to target.
Examples:

Input: arr[] = {1, 5, 7, -1, 5}, target = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).


Input: arr[] = {1, 1, 1, 1}, target = 2
Output:  6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).


Input: arr[] = {10, 12, 10, 15, -1}, target = 125
Output:  0
 */

public class CountPair
{
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 1, 1};
        int target =2;

        System.out.println(countPair(arr,target));

        int[] arr2 = {1, 5, 7, -1, 5};
        target =6;

        System.out.println(countPair(arr2,target));
    }

    public static int countPair(int[] arr,int target)
    {
        int count =0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

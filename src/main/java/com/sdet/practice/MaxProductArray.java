package com.sdet.practice;
/*
Input: arr[] = {-2, 6, -3, -10, 0, 2}
Output: 180
Explanation: The sub array with maximum product is {6, -3, -10}
 with product = 6 * (-3) * (-10) = 180


Input: arr[] = {-1, -3, -10, 0, 60}
Output: 60
Explanation: The subarray with maximum product is {60}.
 */


public class MaxProductArray
{
    public static void main(String[] args)
    {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println("Max product -"+maxProductArray(arr));
        int arr2[] = {-1, -3, -10, 0, 60};
        System.out.println("Max product -"+maxProductArray(arr2));

    }
    public static int maxProductArray(int[] arr)
    {
        if(arr.length<2)
            return -1;
        int result =arr[0];
        for(int i=0; i<arr.length;i++)
        {
            int mul =1;
            for(int j=i; j<arr.length;j++)
            {
                mul = mul*arr[j];
                System.out.println(result+" "+mul);
                result = Math.max(result,mul);
            }
            System.out.println("-------------");
        }
        return result;
    }
}

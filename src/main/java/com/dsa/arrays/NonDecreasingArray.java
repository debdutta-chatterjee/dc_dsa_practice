package com.dsa.arrays;

public class NonDecreasingArray
{
    public static boolean isPossible(int[] arr, int n)
    {
        boolean isUnChanged =true;

        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                if (!isUnChanged) return false;
                if(i>1 && arr[i-2] >arr[i])
                {
                    arr[i]= arr[i-1];
                }
                else{
                    arr[i-1]= arr[i];
                }
                isUnChanged=false;
            }
        }
        return true;
    }
}

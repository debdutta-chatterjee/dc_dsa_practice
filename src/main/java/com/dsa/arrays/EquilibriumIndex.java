package com.dsa.arrays;

public class EquilibriumIndex
{

    //https://www.codingninjas.com/studio/problems/equilibrium-index_893014
    public static int arrayEquilibriumIndex(int[] arr){
        int leftSum=0;
        int rightSum=0;

        for(int i=0; i<arr.length-1; i++)
        {
            if(i>0)leftSum =leftSum+arr[i-1];
            for(int j=i+1; j<arr.length; j++)
            {
                rightSum= rightSum+arr[j];
            }
            //System.out.println(leftSum+"   "+rightSum);
            if(leftSum==rightSum)return i;
            rightSum=0;
        }
        return -1;
    }
}

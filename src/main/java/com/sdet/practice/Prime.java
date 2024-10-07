package com.sdet.practice;

public class Prime
{
    public static void main(String[] args)
    {
        for(int i=0;i<=100;i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }



    public static boolean isPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}

package com.sdet.practice;

public class SumUntilSingleDigit
{
    public static void main(String[] args)
    {
        System.out.println(sumUntilSingleDigit(1234567890));
        System.out.println(sumUntilSingleDigit(5674));
    }

    public static int sumUntilSingleDigit(int num)
    {
        if(num<10)
            return num;
        int count=0;
        while(num>10)
        {
            int rem = num % 10;
            num= num/10;
            num= num+rem;
        }
        return num;
    }
}

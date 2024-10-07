package com.sdet.practice;

import java.util.Arrays;

public class Factorial
{
    public static void main(String[] args)
    {
        int num =10;
        int[] memory = new int[num+1];
        memory[0]=1;
        memory[1] =1;
        System.out.println(factorial(num,memory));

        Arrays.stream(memory).forEach(item -> System.out.println(item+" "));

    }
    public static int factorial(int num,int [] memory)
    {
        if(num==0 || num ==1)
            return 1;
        if(memory[num]!=0)
            return memory[num];
        else
        {
            memory[num] = num* factorial(num-1,memory);
            return memory[num];
        }
    }
}

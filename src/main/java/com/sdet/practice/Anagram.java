package com.sdet.practice;

import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args) {
        String str1 ="tewt";
        String str2 ="ttew";

        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2)
    {
        String revStr1="";
        if(str1.length() != str2.length())
            return false;

        char[] sortedFirst = str1.toCharArray();
        char[] sortedSecond = str2.toCharArray();

        Arrays.sort(sortedFirst);
        Arrays.sort(sortedSecond);

        for(int i=0;i< sortedFirst.length;i++)
        {
            if(sortedFirst[i] != sortedSecond[i])
                return false;
        }
        return true;
    }
}
